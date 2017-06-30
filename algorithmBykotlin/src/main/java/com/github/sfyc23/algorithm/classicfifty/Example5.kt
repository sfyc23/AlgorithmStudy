package com.github.sfyc23.algorithm.classicfifty

import java.util.*

/**
 * Author :leilei on 2017/6/27 17:23
 * 【程序5】  题目：利用条件运算符的嵌套来完成此题：学习成绩> =90 分的同学用 A 表示，
 * 60-89 分之间的用 B 表示，60分以下的用 C 表示。
 * 1.程序分析：(a> b)?a:b这是条件运算符的基本例子。
 */
fun main(args: Array<String>) {
    var scores = getRandomList(10);
    for (score in scores) {
        when {
            score >= 90 -> println("core:$score , grade : A")
            score in 60..89 -> println("core:$score , grade : B")
            else -> println("core:$score , grade : C")
        }
    }
}

private fun getRandomList(count: Int = 10, range: Int = 100): List<Int> {
    val scores = ArrayList<Int>()
    val rd = Random()
    for (i in 1..count) {
        scores.add(rd.nextInt(range))
    }
    return scores
}