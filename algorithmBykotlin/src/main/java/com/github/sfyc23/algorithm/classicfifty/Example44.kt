package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 12:42
 * 【程序44】  题目：一个偶数总能表示为两个素数之和。
 * 证明：i(偶数) = j(素数) + k(素数)
 */
fun main(args: Array<String>) {
    for (i in 2..10000 step 2) {
        if (!isEvenEqualsPrimeAdd(i)) {
            println("$i ：不能证明")
            return
        }
    }
    println("2到10000的偶数都可以")
}

fun isEvenEqualsPrimeAdd(even: Int): Boolean {
    for (j in 1..even - 1) {
        //如果是素数
        if (j.isPrimeNumber()) {
            if ((even - j).isPrimeNumber()) {
                return true
            }
        }
    }
    return false
}