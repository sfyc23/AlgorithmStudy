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
        System.out.println(primeRange(101, 200));
    }

    /**
     * 素数区间
     * @param start 开始
     * @param end   结束
     * @return
     */
    public static List<Integer> primeRange(int start, int end) {
        if (start < 0 || end <= 0 || start > end) {
            throw new IllegalArgumentException("请输入正确的数值");
        }
        List<Integer> pns = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrimeNumber(i)) {
                pns.add(i);
            }
        }
        return pns;
    }

    /**
     * 判断一个数是否为素数
     * @param natural
     * @return true 素数 ，false 不是素数
     */
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
