package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 02:04
 * * 【程序9】  题目：一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。
例如6=1＋2＋3.编程找出1000以内的所有完数。
 */
fun main(args: Array<String>) {
    for (i in 1..999) {
        if (isPerfectNumber(i)) {
            println(i.toString() + " 为完美数")
        }
    }
}

fun isPerfectNumber(n: Int): Boolean {
    var s = 0L
    //迭代求出所有因子之和
    for (i in 1..n - 1) {
        if (n.toInt() % i == 0) {
            s += i
        }
    }
    //判断该数是否等于它的因子之和，是则是完数。
    if (s.toInt() == n) {
        return true
    }
    return false
}