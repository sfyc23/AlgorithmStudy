package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 01:50
 * 【程序21】  题目：求1+2!+3!+...+20!的和
 * 1.程序分析：此程序只是把累加变成了累乘。
 */
public class Example21 {
    public static void main(String[] args) {
        System.out.println(sumFactorial(20));

    }

    public static long sumFactorial(int count) {
        long sum = 0L;
        for (int i = 1; i <= count; i++) {
            sum += factorial(i);
        }
        return sum;
    }

    public static long factorial(int natural) {
        if (natural <= 1L) {
            return 1L;
        } else {
            return natural * factorial(natural - 1);
        }
    }
}
