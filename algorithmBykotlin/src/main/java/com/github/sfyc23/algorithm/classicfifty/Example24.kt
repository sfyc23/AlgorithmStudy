package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 10:26
 */
fun main(args: Array<String>) {
    calcNatural(15544)
}

fun calcNatural(natural: Long) {
    println("整数为：$natural")
    val ns = natural.toString()
    println("它是  ${ns.length}  位数")
    for (i in ns.length - 1 downTo 0) {
        print(ns[i] + "\t")
    }
}