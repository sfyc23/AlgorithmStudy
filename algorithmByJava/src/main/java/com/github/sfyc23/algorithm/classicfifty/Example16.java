package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 01:50
 * 【程序16】题目：输出9*9口诀。
 * 1.程序分析：分行与列考虑，共9行9列，i控制行，j控制列。
 */
public class Example16 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " = " + j + " * " + i + "\t");
            }
            System.out.println();
        }
    }

}
