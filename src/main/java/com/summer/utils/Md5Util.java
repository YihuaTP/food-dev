package com.summer.utils;

import org.apache.commons.codec.binary.Base64;

import java.security.MessageDigest;


public class Md5Util {

    /**
     * @Description: 对字符串进行md5加密
     */
    public static String getMD5Str(String strValue) throws Exception {

        MessageDigest md5 = MessageDigest.getInstance("MD5");

        String newstr = Base64.encodeBase64String(md5.digest(strValue.getBytes()));

        return newstr;

    }


    /**
     * 测试加密算法
     *
     * @param args
     */
    public static void main(String[] args) {

        try {

            String md5 = getMD5Str("孔逸卓");

            System.out.println(md5);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}

