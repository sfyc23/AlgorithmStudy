package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 12:39
 * 【程序39】  题目：编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,
 * 当输入n为奇数时，调用函数1/1+1/3+...+1/n(利用指针函数)
 */
public class Example39 {
    public static void main(String[] args) {
        int natural = 6;
        if (natural < 0) {
            throw new IllegalArgumentException("自然数必须大于0");
        }
        double sum = 0.0;
        double i = isEven(natural) ? 2.0 : 1.0;
        for (; i <= natural; i += 2) {
            sum += 1.0 / i;
        }
        System.out.println("因数为：" + natural + ",sum = " + sum);
    }

    //判断是不是偶数
    public static boolean isEven(int natural) {
        if (natural % 2 == 0) {
            return true;
        }
        return false;
    }

}
