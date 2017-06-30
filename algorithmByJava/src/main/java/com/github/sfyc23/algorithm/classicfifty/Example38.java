package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 12:39
 * 【程序38】  题目：写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。
 */
public class Example38 {
    public static void main(String[] args) {
        if (args != null && args.length > 1) {
            String s = args[0];
            System.out.println("长度为：" + getStringLength(s));
        }
    }

    public static int getStringLength(String s) {
        if (s == null || "".equals(s)) {
            return 0;
        }
        return s.length();
    }
}
