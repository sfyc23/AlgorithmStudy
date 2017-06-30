package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 02:04
 【程序 8】 题目：求 s=a+aa+aaa+aaaa+aa...a 的值，其中 a 是一个数字。例如 2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
程序分析：关键是计算出每一项的值。
 */
fun main(args: Array<String>) {
    println(getSum(2, 4))
}

fun getSum(a: Int, length: Int): Long {
    var num: Long = 0
    for (i in 0..length - 1) {
        num += a * getOne(i)
    }
    return num
}

fun getOne(length: Int): Long {
    if (length == 0) {
        return 1
    } else {
        return Math.pow(10.0, length.toDouble()).toLong() + getOne(length - 1)
    }
}