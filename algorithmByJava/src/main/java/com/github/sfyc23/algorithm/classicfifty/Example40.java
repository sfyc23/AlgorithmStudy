package com.github.sfyc23.algorithm.classicfifty;

import java.util.Arrays;

/**
 * Author :leilei on 2017/6/28 12:39
 * 【程序40】  题目：字符串排序。
 */
public class Example40 {
    public static void main(String[] args) {
        String s = "redistribution";
        System.out.println("原:" + s);

        char[] ca = s.toCharArray();
        Arrays.sort(ca);
        String newS = String.valueOf(ca);
        System.out.println("排序后:" + newS);
    }
}
