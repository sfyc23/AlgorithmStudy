package com.github.sfyc23.algorithm.classicfifty;

import java.util.ArrayList;
import java.util.List;

/**
 * Author :leilei on 2017/6/28 12:39
 * 【程序37】  题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
 * 约瑟夫环问题
 */
public class Example37 {
    public static void main(String[] args) {
        int peopleNum = 8;
        int checkIndex = 3;

        int liveIndex = josephusIteration(peopleNum, checkIndex);
//        int liveIndex = josephusRecursion(peopleNum, checkIndex);
        System.out.println(peopleNum + "人围圈，报数为： " + checkIndex + " , 最后存活的人的位置是： " + liveIndex);
    }
    /*
   迭代删除
     */
    public static int josephusIteration(int peopleNum, int node) {
        if (peopleNum <= 0 || node <= 0) {
            throw new IllegalArgumentException("人数，报名必须大于0");
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= peopleNum; i++) {
            list.add(i);
        }
        // 每次计数开始的索引
        int romoveIndex = 0;
        //循环杀人
        while (true) {
            romoveIndex = (romoveIndex + node - 1) % list.size();
            list.remove(romoveIndex);
            //只有最后一位时，跳出
            if (list.size() == 1) {
                return list.get(0);
            }
        }
    }

    /**
     * 递推公式:
     * (1)、f[1]=0;
     * (2)、f[i]=(f[i-1]+m)%i; (i>1)
     */
    public static int josephusRecursion(int peopleNum, int node) {
        if (peopleNum <= 0 || node <= 0) {
            throw new IllegalArgumentException("人数，报名必须大于0");
        }
        int s = 0;
        for (int i = 2; i <= peopleNum; i++) {
            s = (s + node) % i;
        }
        return s + 1;
    }
}

