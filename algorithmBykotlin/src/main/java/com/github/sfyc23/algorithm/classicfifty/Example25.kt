package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 10:26
 */
fun main(args: Array<String>) {
    for (i in 10000..99999) {
        if (isPalindromeNumber(i.toLong())) {
            print(i.toString() + "\t")
        }
    }
}

fun isPalindromeNumber(l: Long): Boolean {
    val c = l.toString().toCharArray()
    val len = c.size / 2
    for (i in 0..len - 1) {
        if (c[i] != c[c.size - 1 - i]) {
            return false
        }
    }
    return true
}
