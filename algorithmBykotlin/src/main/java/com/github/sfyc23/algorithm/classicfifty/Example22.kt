package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 10:26
 */
fun main(args: Array<String>) {
    println(factorialRecursion(5))
    println(factorialRecursionTail(5))
}

//递归
fun factorialRecursion(natural: Int): Long {
    if (natural <= 1L) {
        return 1L
    } else {
        return natural * factorialRecursion(natural - 1)
    }
}


//阶乘--尾递归
fun factorialRecursionTail(natural: Int, sum: Long = 1L): Long {
    var sum = sum.toLong()
    if (natural < 2) {
        return sum
    }
    sum = sum * natural
    return factorialRecursionTail(natural - 1, sum)
}
