package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 02:04
 */
fun main(args: Array<String>) {
    println(getDay(2017, 6, 28))
}

fun getDay(year: Int, month: Int, day: Int): Int {
    var sum = 0
    /*先计算某月以前月份的总天数*/
    when (month) {
        1 -> sum = 0
        2 -> sum = 31
        3 -> sum = 31 + 28
        4 -> sum = 31 + 28 + 31
        5 -> sum = 31 + 28 + 31 + 30
        6 -> sum = 31 + 28 + 31 + 30 + 31
        7 -> sum = 31 + 28 + 31 + 30 + 31 + 30
        8 -> sum = 31 + 28 + 31 + 30 + 31 + 30 + 31
        9 -> sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31
        10 -> sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30
        11 -> sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31
        12 -> sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30
        else -> println("data error")
    }

    //平年，且月份大于2
    if (!isLeapYear(year) && month > 2) {
        sum += 1
    }
    sum += day

    return sum
}

/**
 * 判断是否为闰年。
 * @param year
 * *
 * @return
 */
fun isLeapYear(year: Int): Boolean {
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        return true
    }
    return false
}