package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 02:04
 * 【程序15】  题目：输入三个整数x,y,z，请把这三个数由小到大输出。
 * 使用list的sorted，对自然数排序
 */
fun main(args: Array<String>) {
    sort(6, 4, 3)
}

fun sort(x: Int, y: Int, z: Int) {
    var list = listOf(x, y, z)
    println(list.sorted());
}