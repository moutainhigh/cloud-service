package com.cloud.common.component.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Hex;

public class SHAUtils {
	
	public static String getSHA256Str(String str){
		 MessageDigest messageDigest;
		 String encdeStr = "";
		 try {
		  messageDigest = MessageDigest.getInstance("SHA-256");
		  byte[] hash = messageDigest.digest(str.getBytes("UTF-8"));
		  encdeStr = Hex.encodeHexString(hash);
		 } catch (NoSuchAlgorithmException e) {
		  e.printStackTrace();
		 } catch (UnsupportedEncodingException e) {
		  e.printStackTrace();
		 }
		 return encdeStr;
		}
	
	
	/**
	* 利用java原生的摘要实现SHA256加密
	* @param str 加密后的报文
	* @return
	*/
	public static String getSHA256StrJava(String str){
	 MessageDigest messageDigest;
	 String encodeStr = "";
	 try {
	  messageDigest = MessageDigest.getInstance("SHA-256");
	  messageDigest.update(str.getBytes("UTF-8"));
	  encodeStr = byte2Hex(messageDigest.digest());
	 } catch (NoSuchAlgorithmException e) {
	  e.printStackTrace();
	 } catch (UnsupportedEncodingException e) {
	  e.printStackTrace();
	 }
	 return encodeStr;
	}
	
	
	/**
	* 将byte转为16进制
	* @param bytes
	* @return
	*/
	private static String byte2Hex(byte[] bytes){
	 StringBuffer stringBuffer = new StringBuffer();
	 String temp = null;
	 for (int i=0;i<bytes.length;i++){
	  temp = Integer.toHexString(bytes[i] & 0xFF);
	  if (temp.length()==1){
	  //1得到一位的进行补0操作
	  stringBuffer.append("0");
	  }
	  stringBuffer.append(temp);
	 }
	 return stringBuffer.toString();
	}


}
