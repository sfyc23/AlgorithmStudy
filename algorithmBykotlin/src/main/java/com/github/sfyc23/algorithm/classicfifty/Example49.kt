package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 12:42
 * 【程序 49】 题目：计算字符串中子串出现的次数。
 */
fun main(args: Array<String>) {
    val sup = "How much caramel can a canny canonball cram in a camel if a canny canonball can cram caramel in a camel?"
    val son = "ca"
    val count = containsNum(sup, son)
    println("出现的次数为：" + count)
}

fun containsNum(sup: String, son: String, count: Int = 0): Int {
    var sup = sup
    var count = count
    if (sup.contains(son)) {
        count++
        val supBeginIndex = sup.indexOf(son) + son.length
        sup = sup.substring(supBeginIndex)
        return containsNum(sup, son, count)
    }
    return count
}