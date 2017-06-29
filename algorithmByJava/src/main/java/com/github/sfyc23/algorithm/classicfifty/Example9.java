package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 01:50
 * 【程序9】  题目：一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。
 例如6=1＋2＋3.编程找出1000以内的所有完数。
 */
public class Example9 {
    public static void main(String[] args) {

        for (int i = 1; i < 1000; i++) {
            if (isPerfectNumber(i)){
                System.out.println(i+" 为完美数");
            }
        }

    }
    public static boolean isPerfectNumber(long n) {
        int s = 0 ;
        //迭代求出所有因子之和
        for (int i = 1; i < n; i++) {
            if(n%i == 0) {
                s +=i;
            }
        }
        //判断该数是否等于它的因子之和，是则是完数。
        if( s == n) {
            return true;
        }
        return false;
    }
}
