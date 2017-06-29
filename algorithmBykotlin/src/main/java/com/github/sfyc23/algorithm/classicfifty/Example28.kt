package com.github.sfyc23.algorithm.classicfifty

import java.util.*

/**
 * Author :leilei on 2017/6/28 12:42
 * 【程序28】  题目：对10个数进行排序
 * 1.程序分析：可以利用选择法，即从后9个比较过程中，选择一个最小的与第一个元素交换，下次类推，即用第二个元素与后8个进行比较，并进行交换。
 */
fun main(args: Array<String>) {
    var listAdd = getRandomList();
    println("原：$listAdd")

    var newList = listAdd.sorted()
    println("排序后：$newList")
}

fun getRandomList(count: Int = 10): List<Int> {
    val list = mutableListOf<Int>()
    val rd = Random()
    for (i in 0..count - 1) {
        list.add(rd.nextInt(100))
    }
    return list
}