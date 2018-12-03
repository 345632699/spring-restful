package com.resetful.base64;

import java.io.UnsupportedEncodingException;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class CryptUtil {
	private static final int SECURE_KEY_LENGTH = 16;

	/**
	 * 采用AES128解密
	 *
	 * @param data
	 * @param secureKey
	 * @return
	 * @throws Exception
	 *         ,Exception
	 * @throws Exception
	 */
	public static byte[] decrypt(byte[] data, String secureKey) throws Exception {
		if (data == null || data.length == 0)
		{
			return data;
		}
		// 获得密匙数据
		byte[] rawKeyData = getAESKey(secureKey);
		// 从原始密匙数据创建一个KeySpec对象
		SecretKeySpec key = new SecretKeySpec(rawKeyData, "AES");
		// Cipher对象实际完成解密操作
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		byte[] iv = new byte[SECURE_KEY_LENGTH];
		// 用密匙初始化Cipher对象
		cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(iv));
		try
		{
			return cipher.doFinal(data);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw new Exception(e);
		}
	}

	public static byte[] getAESKey(String key) throws UnsupportedEncodingException {
		byte[] keyBytes;
		keyBytes = key.getBytes("UTF-8");
		// Use the first 16 bytes (or even less if key is shorter)
		byte[] keyBytes128 = new byte[SECURE_KEY_LENGTH];
		System.arraycopy(keyBytes, 0, keyBytes128, 0, Math.min(keyBytes.length, SECURE_KEY_LENGTH));
		return keyBytes128;
	}

	/**
	 * 自动生成128密钥
	 *
	 * @return
	 * @throws Exception
	 */
	public static byte[] getAESKey() throws Exception {
		KeyGenerator kg = KeyGenerator.getInstance("AES");
		kg.init(SECURE_KEY_LENGTH);// 要生成多少位，只需要修改这里即可128, 192或256
		SecretKey sk = kg.generateKey();
		return sk.getEncoded();
	}

	/**
	 * 采用AES128加密
	 * @return
	 */
	public static byte[] encrypt(byte[] data, String secureKey) throws Exception {
		if (data == null || data.length == 0)
		{
			return data;
		}
		// 获得密匙数据
		byte[] rawKeyData = getAESKey(secureKey);
		// 从原始密匙数据创建KeySpec对象
		SecretKeySpec key = new SecretKeySpec(rawKeyData, "AES");
		// Cipher对象实际完成加密操作
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		byte[] iv = new byte[SECURE_KEY_LENGTH];
		// 用密匙初始化Cipher对象
		cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(iv));
		// 正式执行加密操作
		return cipher.doFinal(data);
	}

	/**
	 * BASE64加密
	 * @param bt bt
	 * @return str
	 */
	public static String encryptBASE64(byte[] bt) {
		return (new BASE64Encoder()).encodeBuffer(bt).replaceAll("\r|\n","")  ;
	}


	public static String encryptAseAndBase64(String content, String key) {
		try {
			byte[] encrypt = encrypt(content.getBytes("utf-8"), key);
			return encryptBASE64(encrypt);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}