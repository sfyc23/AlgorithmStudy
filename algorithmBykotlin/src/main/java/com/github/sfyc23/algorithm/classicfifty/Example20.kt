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
        sum += fibonacci(i + 2) / fibonacci(i + 1)
    }
    return sum
}

fun fibonacci(position: Int): Double = when {
    position < 0 -> throw IllegalArgumentException(" the parameter is valid!")
    position in 0..2 ->  1.0
    else -> {
        var a = 1
        var b = 1
        var num = 0
        for (i in 3..position) {
            num = a + b
            a = b
            b = num
        }
        num.toDouble()
    }
}
