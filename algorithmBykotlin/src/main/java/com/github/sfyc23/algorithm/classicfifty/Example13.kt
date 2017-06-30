package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 02:04
 */
fun main(args: Array<String>) {
//  做一个循环找小于100000之间的数
    for (i in -100..99999) {
        //如果这个数的开方%1=0，说明这个数的开方是个整数
        if (Math.sqrt((i + 100).toDouble()) % 1 == 0.0) {
            if (Math.sqrt((i + 268).toDouble()) % 1 == 0.0) {
                println(i)
            }
        }
    }
}