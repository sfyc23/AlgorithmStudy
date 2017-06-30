package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 12:42
 * 【程序37】  题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
 */
fun main(args: Array<String>) {
    val peopleNum = 8
    val checkIndex = 3

//    val liveIndex = josephusIteration(peopleNum, checkIndex)
     val liveIndex = josephusRecursion(peopleNum, checkIndex);
    println( "$peopleNum 人围圈，报数为： $checkIndex , 最后存活的人的位置是： $liveIndex" )
}

fun josephusIteration(peopleNum: Int, node: Int): Int {
    if (peopleNum <= 0 || node <= 0) {
        throw IllegalArgumentException("人数，报名必须大于0") as Throwable
    }
    //初始化人数
    var numbers = ArrayList<Int>()
    for (i in 1..peopleNum) {
        numbers.add(i)
    }
    var index = 0;
    for (i in 1..peopleNum - 1) {
        index = (index + node - 1) % numbers.size
        numbers.removeAt(index)
//        println(numbers)
    }
    return numbers[0];
}


/**
 * 递推公式:
 * (1)、f[1]=0;
 * (2)、f[i]=(f[i-1]+m)%i; (i>1)
 */
fun josephusRecursion(peopleNum: Int, node: Int): Int {
    if (peopleNum <= 0 || node <= 0) {
        throw IllegalArgumentException("人数，报名必须大于0") as Throwable
    }
    var s = 0
    for (i in 2..node) {
        s = (s + node) % i
    }
    return s + 1
}