package me.ziduye.frame.core.util;

import java.security.SecureRandom;
import java.util.UUID;

public class Ids {

	private static SecureRandom random = new SecureRandom();

	/**
	 * 封装JDK自带的UUID, 通过Random数字生成, 中间有-分割.
	 */
	public static String uuid() {
		return UUID.randomUUID().toString();
	}

	/**
	 * 封装JDK自带的UUID, 通过Random数字生成, 中间无-分割.
	 */
	public static String uuidShort() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

	/**
	 * 使用SecureRandom随机生成Long.
	 */
	public static long randomLong() {
		return Math.abs(random.nextLong());
	}

	public static void main(String[] args) {
		System.out.println(uuid());
		System.out.println(uuidShort());
		System.out.println(randomLong());
	}
	
}
