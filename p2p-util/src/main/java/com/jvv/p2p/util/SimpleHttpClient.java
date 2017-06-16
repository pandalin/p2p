package com.jvv.p2p.util;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jvv.p2p.facade.vo.Title;

public class SimpleHttpClient {

	private final Logger log = Logger.getLogger(this.getClass());

	private HttpGet httpGet;

	public SimpleHttpClient() {

	}

	public static SimpleHttpClient of() {
		return new SimpleHttpClient();
	}

	public String getQryString() {
		URI uri = httpGet.getURI();
		String qryString = uri.getQuery();
		return qryString;
	}

	public List<NameValuePair> getParams() {
		List<NameValuePair> params = URLEncodedUtils.parse(httpGet.getURI(), "UTF-8");

		return params;

	}

	public SimpleHttpClient generateUrl(String url, Object[] requests, Map<String, String> extendParams) throws IOException {
		// 设置 request url
		URI uri = null;
		try {
			List<NameValuePair> params = URLEncodedUtils.parse(new URI(url), "UTF-8");
			String cleanurl = StringUtils.substringBefore(url, "?");
			URIBuilder builder = new URIBuilder().setPath(cleanurl);
			builder.addParameters(params);

			// 设置request url中的 参数
			if (ArrayUtils.isNotEmpty(requests)) {
				for (Object request : requests) {
					if (request == null) {
						continue;
					}
					Class<?> claz = request.getClass();
					Field[] fields = FieldUtil.getAllFields(claz);
					for (Field f : fields) {
						if (!PropertyUtils.isReadable(request, f.getName())) {
							continue;
						}
						Title tt = f.getAnnotation(Title.class);
						if (null == tt)
							continue;
						try {
							Object o = PropertyUtils.getProperty(request, f.getName());
							if (o == null) {
								continue;
							}
							String value = null;
							if (Date.class.equals(o.getClass())) {
								Date d = (Date) o;
								value = DateFormatUtils.format(d, "yyyyMMddHHmmssSSS");
							} else {
								value = o.toString();
							}
							if (StringUtils.isEmpty(value)) {
								continue;
							}

							builder.addParameter(tt.value(), value);
						} catch (Exception e) {
							e.printStackTrace();
							continue;
						}

					}
				}
			}

			if (extendParams != null) {
				for (Map.Entry<String, String> entry : extendParams.entrySet()) {
					builder.addParameter(entry.getKey(), entry.getValue());
				}

			}

			List<NameValuePair> allparams = builder.getQueryParams();

			Comparator<NameValuePair> comp = new Comparator<NameValuePair>() { // solution
				// than
				// making
				// method
				// synchronized
				@Override
				public int compare(NameValuePair p1, NameValuePair p2) {
					return p1.getName().compareTo(p2.getName());
				}
			};
			Collections.sort(allparams, comp);

			builder.removeQuery();
			builder.addParameters(allparams);

			uri = builder.build();

		} catch (URISyntaxException e) {
			throw new IOException(e);
		}
		httpGet = new HttpGet(uri);
		return this;
	}

	public SimpleHttpClient generateUrl(String url, Object[] requests) throws IOException {
		return generateUrl(url, requests, null);
	}

	public void addParams(Object request) throws IOException {

		List<NameValuePair> params = URLEncodedUtils.parse(httpGet.getURI(), "UTF-8");
		String cleanurl = StringUtils.substringBefore(httpGet.getURI().getPath(), "?");
		URIBuilder builder = new URIBuilder().setPath(cleanurl);
		builder.addParameters(params);

		Class<?> claz = request.getClass();
		Field[] fields = FieldUtil.getAllFields(claz);
		for (Field f : fields) {
			if (!PropertyUtils.isReadable(request, f.getName())) {
				continue;
			}
			Title tt = f.getAnnotation(Title.class);
			if (null == tt)
				continue;
			try {
				Object o = PropertyUtils.getProperty(request, f.getName());
				if (o == null) {
					continue;
				}
				builder.addParameter(tt.value(), o.toString());
			} catch (Exception e) {
				continue;
			}

		}
		try {
			URI uri = builder.build();
			httpGet.setURI(uri);
		} catch (URISyntaxException e) {
			throw new IOException(e);
		}
	}

	public void addExtParams(Map<String, String> extendParams) throws IOException {

		List<NameValuePair> params = URLEncodedUtils.parse(httpGet.getURI(), "UTF-8");
		String cleanurl = StringUtils.substringBefore(httpGet.getURI().toURL().toString(), "?");
		URIBuilder builder = new URIBuilder().setPath(cleanurl);
		builder.addParameters(params);
		if (extendParams != null) {
			for (Map.Entry<String, String> entry : extendParams.entrySet()) {
				builder.addParameter(entry.getKey(), entry.getValue());
			}

		}

		try {
			URI uri = builder.build();
			httpGet.setURI(uri);
		} catch (URISyntaxException e) {
			throw new IOException(e);
		}

	}

	public SimpleHttpClient addHeader(String name, String value) {
		if (httpGet == null) {
			throw new IllegalArgumentException("先调用generateUrl 设置请求参数!");
		}
		httpGet.addHeader(name, value);

		return this;
	}

	public String execute() throws IOException {
		if (httpGet == null) {
			throw new IllegalArgumentException("先调用generateUrl 设置请求参数!");
		}
		CloseableHttpClient httpclient = HttpClients.createDefault();
		CloseableHttpResponse response = httpclient.execute(httpGet);
		HttpEntity resEntity = response.getEntity();
		String out = IOUtils.toString(resEntity.getContent(), "UTF-8");

		return out;
	}

	public byte[] executeByte() throws IOException {
		if (httpGet == null) {
			throw new IllegalArgumentException("先调用generateUrl 设置请求参数!");
		}
		CloseableHttpClient httpclient = HttpClients.createDefault();
		CloseableHttpResponse response = httpclient.execute(httpGet);
		HttpEntity resEntity = response.getEntity();
		byte[] out = IOUtils.toByteArray(resEntity.getContent());

		return out;
	}

	public <T> T executeJson(final Class<T> resClaz) throws IOException {
		if (httpGet == null) {
			throw new IllegalArgumentException("先调用generateUrl 设置请求参数!");
		}
		// 设置返回
		ResponseHandler<T> rh = new ResponseHandler<T>() {

			@Override
			public T handleResponse(final HttpResponse response) throws IOException {
				StatusLine statusLine = response.getStatusLine();
				HttpEntity entity = response.getEntity();
				if (statusLine.getStatusCode() >= 300) {
					throw new HttpResponseException(statusLine.getStatusCode(), statusLine.getReasonPhrase());
				}
				if (entity == null) {
					throw new ClientProtocolException("Response contains no content");
				}
				Gson gson = new GsonBuilder().create();
				ContentType contentType = ContentType.getOrDefault(entity);
				Charset charset = contentType.getCharset();

				String content = IOUtils.toString(entity.getContent(), charset.name());

				log.debug(content);
				return gson.fromJson(content, resClaz);
			}
		};

		CloseableHttpClient httpclient = HttpClients.createDefault();
		T dres = httpclient.execute(httpGet, rh);

		return dres;

	}
}
