package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 12:42
  * 【程序32】  题目：取一个整数a从右端开始的4～7位。
 * 程序分析：可以这样考虑：
 * (1)先使a右移4位。
 * (2)设置一个低4位全为1,其余全为0的数。可用~(~0 < <4)
 * (3)将上面二者进行&运算。
 * 将long换成String,然后剪断
 */
fun main(args: Array<String>) {
    val number: Long = 123456789
    var ss = number.toString()
    val length = ss.length
    if (length < 7) {
        println("长度少于7位")
        return
    }
    ss = ss.substring(3, 7)
    println(ss)
}