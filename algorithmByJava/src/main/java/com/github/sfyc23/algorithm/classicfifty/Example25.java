package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 01:50
 * 【程序25】  题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 */
public class Example25 {
    public static void main(String[] args) {
        //计算所有5位数的回文数
//        for (int i = 10000; i <= 99999; i++) {
//            if(isPalindromeNumber(i)){
//            System.out.print(i+"\t");
//            }
//        }

        isPalindromeNumber(12321);

    }

    public static boolean isPalindromeNumber(long natural) {
        char[] c = String.valueOf(natural).toCharArray();
        int length = c.length;

        for (int i = 0, len = length / 2; i < len; i++) {
            if (c[i] != c[length - 1 - i]) {
                return false;
            }
        }
        System.out.print(natural + " 是一个回文数");
        return true;
    }

}
