package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 01:50
 * 【程序24】  题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字
 */
public class Example24 {
    public static void main(String[] args) {
        calcNatural(1235);
    }

    public static void calcNatural(long natural) {
        System.out.println("整数为：" + natural);
        String ns = String.valueOf(natural);
        System.out.println("它是 " + ns.length() + " 位数");
        for (int i = ns.length() - 1; i >= 0; i--) {
            System.out.print(ns.charAt(i) + "\t");
        }
    }


}
