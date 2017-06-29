package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 10:26
 *  * 【程序17】  题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
 * 以后每天早上都吃了前一天剩下的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
 * 1.程序分析：采取逆向思维的方法，从后往前推断。
 */
fun main(args: Array<String>) {
    var count = 1
    for (i in 1..9) {
        count = (count + 1) * 2
    }
    println("第一天共摘了" + count)
}
