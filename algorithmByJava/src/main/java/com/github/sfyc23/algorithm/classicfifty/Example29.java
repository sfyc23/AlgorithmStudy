package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 12:39
 * 【程序29】  题目：求一个 3*3 矩阵对角线元素之和
 * 1.程序分析：利用双重 for 循环控制输入二维数组，再将 a 累加后输出。
 * if（i==j） 则是对角线的数值
 */
public class Example29 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 7, 8}};
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println(sum);

    }
}
