package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 12:39
 * 题目：打印出杨辉三角形（要求打印出10行如下图）
 * 说明：杨辉三角形第n层（顶层称第0层，第1行，第n层即第n+1行，此处n为包含0在内的自然数）
 * 杨辉三角以正整数构成，数字左右对称，每行由1开始逐渐变大，然后变小，回到1。
 * <p>
 * 特点：第 n 行的数字个数为 n个。
 * 除每行最左侧与最右侧的数字为1以外，每个数字等于它的左上方与右上方两个数字之和。
 */
public class Example33 {
    public static void main(String[] args) {
        getYanghuiTriangle(10);
    }

    public static void getYanghuiTriangle(int layer) {
        int triangle[][] = new int[layer][];// 创建二维数组
        // 遍历二维数组的第一层
        for (int i = 0, length = triangle.length; i < length; i++) {
            triangle[i] = new int[i + 1];// 初始化第二层数组的大小
            // 遍历第二层数组
            for (int j = 0; j <= i; j++) {
                // 将两侧的数组元素赋值为1
                if (i == 0 || j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {// 其他数值通过公式计算
                    triangle[i][j] = triangle[i - 1][j] + triangle[i - 1][j - 1];
                }
                System.out.print(triangle[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
