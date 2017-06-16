package com.jvv.p2p.util;

import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.lang.ArrayUtils;

public class FileTypeJudge {

	private static Charset charset = Charset.forName("UTF-8");

	public static FileType getType(String content) throws IOException {
		return getType(content, charset);
	}

	public static FileType getType(String content, Charset charset) throws IOException {
		return getType(content.getBytes(charset));
	}

	public static FileType getType(byte[] content) throws IOException {

		String fileHead = getFileHead(content);

		if (fileHead == null || fileHead.length() == 0) {
			return null;
		}

		fileHead = fileHead.toUpperCase();

		FileType[] fileTypes = FileType.values();

		for (FileType type : fileTypes) {
			if (fileHead.startsWith(type.getValue())) {
				return type;
			}
		}

		return null;
	}

	private static String getFileHead(byte[] content) throws IOException {

		byte[] b = ArrayUtils.subarray(content, 0, 28);
		return Hex.encodeHexString(b);

	}
}
