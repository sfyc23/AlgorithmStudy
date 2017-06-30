package com.github.sfyc23.algorithm.classicfifty

import java.util.*

/**
 * Author :leilei on 2017/6/28 12:42
 * 【程序 46】 题目：两个字符串连接程序。
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    println("请输入一串字符串:")
    val s1 = sc.nextLine()
    println("请输入一串字符串:")
    val s2 = sc.nextLine()

    val ss12 = s1 + s2
    println("合并的字符串是 :\n $ss12")
}