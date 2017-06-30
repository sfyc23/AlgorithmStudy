package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 12:42
 *【程序41】 题目：海滩上有一堆桃子，五只猴子来分。
 * 第一只猴子把这堆桃子凭据分为五份，多了一个，这只猴子把多的一个扔入海中，拿走了一份。
 * 第二只猴子把剩下的桃子又平均分成五份，又多了一个，它同样把多的一个扔入海中，拿走了一份，
 * 第三、第四、第五只猴子都是这样做的，问海滩上原来最少有多少个桃子？
 */

fun main(args: Array<String>) {
    for (i in 1..10000) {
        if (isMonkeyPeach(i)) {
            println("最少有桃子:" + i)
            return
        }
    }
}

fun isMonkeyPeach(natural: Int): Boolean {
    var lavePeach = natural
    for (i in 1..5) {
        if ((lavePeach - 1) % 5 != 0) {
            return false;
        }
        lavePeach = (lavePeach - 1) * 4 / 5
//        println(lavePeach)
    }
    return true;
}

