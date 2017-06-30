package com.github.sfyc23.algorithm.classicfifty

import java.util.*

/**
 * Author :leilei on 2017/6/28 12:42
 * 【程序36】  题目：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
 */
fun main(args: Array<String>) {
//    val numbers = getRandomArrayInt(10)
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val m = 3;
    println("原数组：" + Arrays.toString(numbers))

    val newNums = moveArray(numbers, m)
    println("移动 ${m} 位到最前之后：${Arrays.toString(newNums)}" )
}

fun moveArray(numbers: IntArray, m: Int): IntArray {
    if (m < 0 || m > numbers.size - 1) {// 判断移动的位置是否合法
        throw IllegalArgumentException(" 移动位数不能大于数组个数，且不能为负数")
    }
    val arrayLength = numbers.size
    val newNums = IntArray(arrayLength)
    for (i in 0..arrayLength - 1) {
        if (i < m) {
            newNums[i] = numbers[arrayLength - m + i]
        } else {
            newNums[i] = numbers[i - m]
        }
    }
    return newNums
}