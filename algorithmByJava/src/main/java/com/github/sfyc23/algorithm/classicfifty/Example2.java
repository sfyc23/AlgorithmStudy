package com.github.sfyc23.algorithm.classicfifty;

import java.util.ArrayList;
import java.util.List;

/**
 * Author :leilei on 2017/6/27 01:57
 * 【程序2】  题目：判断101-200之间有多少个素数，并输出所有素数。
 * 1.程序分析：判断素数的方法：用一个数分别去除 2 到 sqrt(这个数)，如果能被整除，则表明此数不是素数，反之是素数。
 */
public class Example2 {
    public static void main(String[] args) {
        System.out.println(primeRange(100, 200));
    }

    public static List<Integer> primeRange(int start, int end) {
        List<Integer> pns = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrimeNumber(i)) {
                pns.add(i);
            }
        }
        return pns;
    }

    public static boolean isPrimeNumber(int natural) {
        int sqlt = (int) Math.sqrt(natural);
        for (int i = 2; i <= sqlt; i++) {
            if (natural % i == 0) {
                return false;
            }
        }
        return true;
    }




}
