package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 01:50
 * 【程序8】  题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
 * 1.程序分析：关键是计算出每一项的值。
 */
public class Example8 {
    public static void main(String[] args) {

        System.out.println(getSum(2, 4));
    }

    public static long getSum(int a, int length) {
        long num = 0;
        for (int i = 0; i < length; i++) {
            num += a * getOne(i);
        }
        return num;
    }

    public static long getOne(int length) {
        if (length == 0) {
            return 1;
        } else {
            return (long) Math.pow(10, length) + getOne(length - 1);
        }

    }
}
