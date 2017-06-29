package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 12:42
 */
fun main(args: Array<String>) {
    if (args != null && args.size > 1) {
        val s = args[0]
        println("长度为：" + getStringLength(s))
    }
}

fun getStringLength(s: String?): Int {
    if (s == null || "" == s) {
        return 0
    }
    return s.length
}