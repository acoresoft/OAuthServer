package com.util;

public class StringUtil {
	private static final String EMPTY="";
	/**
	 * @param str
	 * @return
	 */
	public static String null2String(String str) {
		return isBlank(str)?EMPTY:str;
	}
	/**
	 * @param str
	 * @return
	 */
	public static boolean isBlank(String str) {
		return str!=null&&str.length()>0;
	}

}
