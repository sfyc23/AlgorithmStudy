package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 10:26
 */
fun main(args: Array<String>) {
    calcNatural(1235)
}

fun calcNatural(natural: Long) {
    println("整数为：$natural")
    val ns = natural.toString()

    val length = ns.length
    if (length >= 5) {
        println("请重新输入")
        return
    }
    println("它是 $length 位数")
    for (i in length - 1 downTo 0) {
        print(ns[i] + "\t")
    }
}