package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 12:42
 * * 【程序42】  题目：809*??=800*??+9*??+1   其中??代表的两位数,8*??的结果为两位数，9*??的结果为3位数。求??代表的两位数，及809*??后的结果。
 * 换一个思路3个??不一定一样。,还是不行。
 */
fun main(args: Array<String>) {
    for (i in 10..99) {
        for (k in 10..99) {
            for (j in 10..99) {
                if (8 * k < 100 && 9 * j > 100) {
                    if (809 * i == (800 * k + 9 * j + 1)) {
                        print("$i,$k,$j")
                    }
                }

            }
        }
    }
}