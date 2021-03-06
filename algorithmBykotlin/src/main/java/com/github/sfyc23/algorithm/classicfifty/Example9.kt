package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 02:04
 * * 【程序9】  题目：一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。
例如6=1＋2＋3.编程找出1000以内的所有完数。
 */
fun main(args: Array<String>) {
    for (i in 1..999) {
        if (i.isPerfectNumber()) {
            println("$i 为完美数\t")
        }
    }
}

/**
 * Int 扩展函数
 */
fun Int.isPerfectNumber(): Boolean {
    var s = 0
    //迭代求出所有因子之和
    for (i in 1..this - 1) {
        if (this % i == 0) {
            s += i
        }
    }
    //判断该数是否等于它的因子之和，是则是完数。
    if (s == this) {
        return true
    }
    return false
}