package com.github.sfyc23.algorithm.classicfifty;

import java.util.ArrayList;
import java.util.List;

/**
 * Author :leilei on 2017/6/27 02:12
 * 【程序3】  题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3 的三次方。
 * 1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
 */
public class Example3 {
    public static void main(String[] args) {
        System.out.println(getNarcissistic(100, 999));
    }

    public static List<Integer> getNarcissistic(int start, int end) {
        List<Integer> nrs = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isNarcissistic(i)) {
                nrs.add(i);
            }
        }
        return nrs;
    }

    public static boolean isNarcissistic(int natural) {
        int hundred = natural / 10 / 10 % 10;
        int ten = natural / 10 % 10;
        int digit = natural % 10;

        int num = hundred * hundred * hundred + ten * ten * ten + digit * digit * digit;

        if (num == natural) {
            return true;
        }
        return false;
    }

}
