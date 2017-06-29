package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 12:39
 * 【程序42】  题目：809*??=800*??+9*??+1   其中??代表的两位数,8*??的结果为两位数，9*??的结果为3位数。求??代表的两位数，及809*??后的结果。
 * 这个题有问题，809x = 800*x+9*x +1; 则是809x = 809x + 1. 这个x，不存在的。
 */
public class Example42 {
    public static void main(String[] args) {

        for (int i = 10; i < 100; i++) {
            if (isExample42(i)) {
                System.out.println("两位数为：" + i);
                return;
            }
        }
        System.out.println("没有这个两位数");

    }

    public static boolean isExample42(int natural) {
        if (8 * natural >= 100) {
            return false;
        }
        if (9 * natural < 100) {
            return false;
        }

        if ((809 * 100 + natural) != (800 * natural + 9 * natural + 1)) {
            return false;
        }
        return true;
    }
}
