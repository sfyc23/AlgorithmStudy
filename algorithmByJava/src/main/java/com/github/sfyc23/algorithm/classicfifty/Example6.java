package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/27 12:15
 * 题目：输入两个正整数 m 和 n ，求其最大公约数和最小公倍数。
 * 1.程序分析：利用辗除法。
 */
public class Example6 {

    public static void main(String[] args) {
        System.out.println("Greatest Common Divisor:" + getGcdRecursion(12, 18));
        System.out.println("Least Common Multiple:" + getLcm(12, 18));
    }


    public static int getGcdRecursion(int big, int small) {
        if (big % small == 0) return small;
        return getGcdRecursion(small, big % small);
    }

    public static int getLcm(int x, int y) {
        return x * y / getGcdRecursion(x, y);
    }

}
