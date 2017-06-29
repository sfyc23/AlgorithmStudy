package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 12:42
 * 【程序34】  题目：输入3个数a,b,c，按大小顺序输出。
 * 1.程序分析：利用指针方法。
 */
fun main(args: Array<String>) {
    var numbers = getRandomArrayInt(3)
    printArray(numbers, "原版：")

    numbers.sortDescending()
    printArray(numbers, "原版：")
}