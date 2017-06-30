package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 12:42
 * 【程序38】  题目：写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。
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