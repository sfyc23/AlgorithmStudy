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
            sum += factorialRecursionTail(i);
        }
        return sum;
    }

    //阶乘--尾递归
    public static int factorialRecursionTail(int natural) {
        return factorialRecursionTail(natural, 1);
    }

    private static int factorialRecursionTail(int natural, int sum) {
        if (natural < 2) {
            return sum;
        }
        sum = sum * natural;
        return factorialRecursionTail(natural - 1,sum);
    }
}
