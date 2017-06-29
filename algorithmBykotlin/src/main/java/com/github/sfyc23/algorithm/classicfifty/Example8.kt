package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 02:04
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