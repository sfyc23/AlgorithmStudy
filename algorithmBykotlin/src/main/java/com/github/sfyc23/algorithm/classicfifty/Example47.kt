package com.github.sfyc23.algorithm.classicfifty

import java.util.*

/**
 * Author :leilei on 2017/6/28 12:42
 */
fun main(args: Array<String>) {
    val s = Scanner(System.`in`)
    var temp = 0;
    var scMark = false
    for (i in 1..7){
        scMark = false
        do {
            if (scMark) {
                println("输入错误，请重新输入一个1--50之间的整数")
            } else {
                println("请输入一个1--50之间的整数：")
            }
            temp = s.nextInt()
            scMark = true
        } while (temp !in 1..50)
        for (k in 1..temp) {
            print("*")
        }
        println()
    }
    println("输出结束")
}