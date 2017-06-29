package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 01:50
 * 【程序20】  题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
 * 1.程序分析：请抓住分子与分母的变化规律。
 * 先看斐波纳契数列  1,1,2,3,5,8,13,21....  f(n)
 * 则 分数的分子为 f(n+2)
 * 则 分数的分母为 f(n+1)
 */
public class Example20 {
    public static void main(String[] args) {

        System.out.println(getSum(20));
    }

    public static double getSum(int index) {
        double sum = 0;
        for (int i = 1; i <= index; i++) {
            sum += fibonacci(i+2)/fibonacci(i+1);
        }
        return sum;
    }

    public static double fibonacci(int position) {
        if (position < 0) {
            throw new IllegalArgumentException(" the parameter is valid!");
        }
        if (position <= 2) {
            return 1.0;
        }
        int a = 1, b = 1, num = 0;
        for (int i = 3; i <= position; i++) {
            num = a + b;
            a = b;
            b = num;
        }
        return num;
    }

}
