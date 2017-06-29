package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 10:26
 * 【程序16】题目：输出9*9口诀。
 * 1.程序分析：分行与列考虑，共9行9列，i控制行，j控制列。
 */
fun main(args: Array<String>) {
    for (i in 1..9) {
        for (j in 1..i) {
            print("${i*j} = $j * $i \t")
        }
        println()
    }
}
