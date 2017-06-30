package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 02:04
 */
fun main(args: Array<String>) {
    getMomey(250000.0)
}
fun getMomey(lirun: Double): Double {
    var sum = 0.0

    if (lirun <= 100000) {
        sum = lirun * 0.1
    } else if (lirun <= 200000) {
        sum = 10000 + lirun * 0.075
    } else if (lirun <= 400000) {
        sum = 17500 + lirun * 0.05
    } else if (lirun <= 600000) {
        sum = 27500 + lirun * 0.03
    } else if (lirun <= 1000000) {
        sum = 33500 + lirun * 0.015
    } else {
        sum = 39500 + lirun * 0.01
    }
    println("当月利润为：$lirun,应发的奖金是:$sum")
    return sum
}