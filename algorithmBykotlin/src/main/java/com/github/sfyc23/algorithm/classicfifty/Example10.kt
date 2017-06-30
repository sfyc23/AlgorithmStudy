package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 02:04
 * 【程序10】  题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
 */
fun main(args: Array<String>) {
    getHeight(100.0, 10);
}

fun getHeight(height: Double,count:Int) {
    if (count < 0 || height < 0) {
        throw IllegalArgumentException("请输入正确的数值")
    }
    var height = height
    var sum = 0.0
    for (i in 1..count) {
        sum += height
        height = height / 2
    }
    println("共经过 $sum 米。第 $count 次反弹 $height 米")
}