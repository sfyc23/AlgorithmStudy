package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 12:42
 * 【程序29】  题目：求一个 3*3 矩阵对角线元素之和
 * 1.程序分析：利用双重 for 循环控制输入二维数组，再将 a 累加后输出。
 * if（i==j） 则是对角线的数值
 */
fun main(args: Array<String>) {

    val array = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 7, 8))
    var sum = 0;

    for (i in 0..array.size - 1) {
        for (j in 0..array.size - 1) {
            if (i == j) {
                sum += array[i][j]
            }
        }
    }
    println(sum)
}