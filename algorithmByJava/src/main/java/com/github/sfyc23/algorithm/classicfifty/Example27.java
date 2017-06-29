package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 12:39
 * 【程序27】  题目：求100之内的素数
 */
public class Example27 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(isPrimeNumber(i)){
                System.out.println(i + " 是素数");
            }
        }


    }

    public static boolean isPrimeNumber(int natural) {
        int n1 = (int) Math.sqrt(natural);
        for (int i = 2; i <= n1; i++) {
            if (natural % i == 0) {
                return false;
            }
        }
        return true;
    }
}
