package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 10:26
 */
fun main(args: Array<String>) {
    println(sumFactorial(20))
}

fun sumFactorial(count: Int): Long {
    var sum = 0L
    for (i in 1..count) {
        sum += factorialRecursionTail(i)
    }
    return sum
}