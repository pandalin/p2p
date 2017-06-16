package com.jvv.p2p.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import org.apache.commons.lang.ArrayUtils;

/**
 * 字段 反射�?单工�?
 * 
 * @author cx
 *
 */
public class FieldUtil {

	/**
	 * 得到 claz的所�? 字段 包括 super的字�?
	 * 
	 * @param claz
	 * @return
	 */
	public static Field[] getAllFields(Class<?> claz) {
		Field[] fields = new Field[0];
		return getAllFields(fields, claz);
	}

	private static Field[] getAllFields(Field[] fields, Class<?> claz) {
		if (fields == null) {
			fields = new Field[0];
		}

		fields = (Field[]) ArrayUtils.addAll(fields, claz.getDeclaredFields());

		if (claz.getSuperclass() != null) {
			fields = getAllFields(fields, claz.getSuperclass());
		}

		return fields;
	}

	/**
	 * 得到 claz �? annotationClaz 注解的字�?
	 * 
	 * @param claz
	 * @param annotationClaz
	 * @return
	 */
	public static Field[] getAnnotationField(Class<?> claz, Class<? extends Annotation> annotationClaz) {
		Field[] allfield = claz.getDeclaredFields();
		Field[] annotationField = new Field[0];
		for (Field f : allfield) {

			Object tt = f.getAnnotation(annotationClaz);
			if (null == tt)
				continue;
			annotationField = (Field[]) ArrayUtils.add(annotationField, f);
		}

		return annotationField;
	}
}
