package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 10:26
 */
fun main(args: Array<String>) {
    println(getSum(20))
}

fun getSum(index: Int): Double {
    var sum = 0.0
    for (i in 1..index) {
        sum += fibonacciRecursionTail(i + 2).toDouble() / fibonacciRecursionTail(i + 1).toDouble()
    }
    return sum
}


