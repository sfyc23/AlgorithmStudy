package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 12:42
 * 【程序40】  题目：字符串排序。
 */
fun main(args: Array<String>) {
    var s = "redistribution";
    println("原:$s")
    println("排序:${s.sort()}")
}

fun String.sort() :String {
    var ca = this.toCharArray()
    ca.sort()
    return String(ca);
}