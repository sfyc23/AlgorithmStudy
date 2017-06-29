package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 10:26
 * 【程序18】  题目：两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。有人向队员打听比赛的名单。
 * a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。
 */
fun main(args: Array<String>) {
    val s = arrayOf("x", "y", "z")
    s.forEach { a ->
        s.forEach { b ->
            s.forEach { c ->
                if (a != b && b != c && a != c &&
                        "x" != a && "x" != c && "z" != c) {
                    println("比赛名单如下：")
                    println("a  VS  " + a)
                    println("b  VS  " + b)
                    println("c  VS  " + c)
                }
            }
        }
    }
}

