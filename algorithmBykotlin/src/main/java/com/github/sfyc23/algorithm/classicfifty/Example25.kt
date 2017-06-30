package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 10:26
 * 【程序25】  题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 */
fun main(args: Array<String>) {
    var natural = 12321;
    if(natural.isPalindromeNumber()){
        println(" $natural 是一个回文数")
    }
}

fun Int.isPalindromeNumber(): Boolean {
    val c = this.toString().toCharArray()
    val length = c.size
    for (i in 0..length / 2 - 1) {
        if (c[i] != c[length - 1 - i]) {
            return false
        }
    }
    return true
}
