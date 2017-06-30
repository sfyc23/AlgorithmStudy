package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 01:50
 * 题目：利用递归方法求5!。
 * 1.程序分析：递归公式：fn=fn_1*4!
 */
public class Example22 {
    public static void main(String[] args) {
        System.out.println(factorialRecursion(5));
        System.out.println(factorialRecursionTail(5));
    }

    //非尾递归
    public static long factorialRecursion(int natural) {
        if (natural <= 1L) {
            return 1L;
        } else {
            return natural * factorialRecursion(natural - 1);
        }
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


