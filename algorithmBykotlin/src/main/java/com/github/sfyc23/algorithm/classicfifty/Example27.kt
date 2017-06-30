package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 12:42
 * 【程序27】  题目：求100之内的素数
 */
fun main(args: Array<String>) {
    for (i in 1..100) {
        if (i.isPrimeNumber()) {
            println( "$i 是素数")
        }
    }
}

