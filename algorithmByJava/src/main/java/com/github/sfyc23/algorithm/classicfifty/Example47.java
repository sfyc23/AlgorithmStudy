package com.github.sfyc23.algorithm.classicfifty;

import java.util.Scanner;

/**
 * Author :leilei on 2017/6/28 12:39
 * 【程序 47】 题目：读取 7 个数（1—50）的整数值，每读取一个值，程序打印出该值个数的＊。
 */
public class Example47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        boolean scMark = false;
        for (int i = 0; i < 7; i++) {
            scMark = false;
            do {
                if (scMark) {
                    System.out.println("输入错误，请重新输入一个1--50之间的整数");
                } else {
                    System.out.println("请输入一个1--50之间的整数：");
                }
                temp = sc.nextInt();
                scMark = true;

            } while (temp < 1 || temp > 50);
            for (int k = 0; k < temp; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
