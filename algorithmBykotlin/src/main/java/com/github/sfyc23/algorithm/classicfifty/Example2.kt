package com.github.sfyc23.algorithm.classicfifty

import java.util.*

/**
 * Author :leilei on 2017/6/27 16:52
 *  【程序2】  题目：判断101-200之间有多少个素数，并输出所有素数。
 * 1.程序分析：判断素数的方法：用一个数分别去除 2 到 sqrt(这个数)，如果能被整除，则表明此数不是素数，反之是素数。
 */
fun main(args: Array<String>) {
    val pns = ArrayList<Int>()
    for (i in 101..200) {
        if (i.isPrimeNumber()) {
            pns.add(i)
        }
    }
    println(pns)
}

//Int扩展函数，判断一个数是否为素数
fun Int.isPrimeNumber(): Boolean {
    val sqlt = Math.sqrt(this.toDouble()).toInt()
    for (i in 2..sqlt) {
        if (this % i == 0) {
            return false
        }
    }
    return true
}