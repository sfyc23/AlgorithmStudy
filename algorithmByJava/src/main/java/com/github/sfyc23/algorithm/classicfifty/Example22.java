package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 01:50
 *题目：利用递归方法求5!。
 * 1.程序分析：递归公式：fn=fn_1*4!
 */
public class Example22 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static long factorial(int natural) {
        if (natural <= 1L) {
            return 1L;
        } else {
            return natural * factorial(natural - 1);
        }
    }
}


