package com.github.sfyc23.algorithm.classicfifty;

import java.util.Scanner;

/**
 * Author :leilei on 2017/6/28 12:39
 * 【程序 46】 题目：两个字符串连接程序。
 */
public class Example46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符串:");
        String s1 = sc.nextLine();
        System.out.println("请输入一串字符串:");
        String s2 = sc.nextLine();

        String ss12 = s1 + s2;
        System.out.println("合并的字符串是 :" + "\n" + ss12);
    }
}
