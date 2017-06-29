package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 10:26
 *  * 【程序19】  题目：打印出如下图案（菱形） *   ***   ******   ********   ******   ***   *
 * 1.程序分析：先把图形分成两部分来看待，前四行一个规律，后三行一个规律，利用双重   for循环，第一层控制行，第二层控制列。
 * 前n项(空格)= n-1 ,(*) = 2*n-1
 * 后n-1项 (空格)= n ,(*) = 2*(count-m)-1
 */
fun main(args: Array<String>) {
    printDiamond(4)
}

fun printDiamond(num: Int) {
    for (i in 1..num) {
        var spaceCount = num - i;
        for (temp in 1..spaceCount){
            print(" ")
        }
        val statCount = 2 * i - 1
        for (temp in 1..statCount){
            print("*")
        }
        println()
    }

    for (i in 1..num - 1) {
        for (temp in 1..i){
            print(" ")
        }
        var statCount = 2 * (num - i) - 1
        for (temp in 1..statCount){
            print("*")
        }
        println()
    }
}