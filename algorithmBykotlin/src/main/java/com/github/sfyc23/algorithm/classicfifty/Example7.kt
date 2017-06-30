package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/27 20:55
 *  * 【程序7】  题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 * 1.程序分析：利用while语句,条件为输入的字符不为 '\n '.
 */
var SS = "Jack quietly moved up front and seized the big ball of wax. (47 letters) (Includes proper noun)"

fun main(args: Array<String>) {
    println("字符为：$SS")
    statistics1();
    statistics2();
}


fun statistics1() {
    val `as` = SS.toCharArray()
    var countMap = `as`.groupBy {
        when {
            it == ' ' -> AlphabetType.SPACE
            it >= 'a' && it <= 'z' || it >= 'A' && it < 'Z' -> AlphabetType.ALPHABET
            it >= '0' && it <= '9' -> AlphabetType.DIGITAL
            else -> AlphabetType.OTHER
        }
    }

    for (at in countMap) {
        when (at.key) {
            AlphabetType.SPACE -> println("空格 = ${at.value.size}")
            AlphabetType.ALPHABET -> println("字母 = ${at.value.size}")
            AlphabetType.DIGITAL -> println("数字 = ${at.value.size}")
            AlphabetType.OTHER -> println("其他 = ${at.value.size}")
        }
    }
}

fun statistics2() {
    val `as` = SS.toCharArray()
    var countMap = `as`.groupBy {
        when {
            it == ' ' -> AlphabetType.SPACE
            it >= 'a' && it <= 'z' || it >= 'A' && it < 'Z' -> AlphabetType.ALPHABET
            it >= '0' && it <= '9' -> AlphabetType.DIGITAL
            else -> AlphabetType.OTHER
        }
    }.map {
        mapOf(it.key to it.value.size)
    }

    countMap.forEach {
        it.forEach {
            when (it.key) {
                AlphabetType.SPACE -> println("空格 = ${it.value}")
                AlphabetType.ALPHABET -> println("字母 = ${it.value}")
                AlphabetType.DIGITAL -> println("数字 = ${it.value}")
                AlphabetType.OTHER -> println("其他 = ${it.value}")
            }
        }
    }
}


enum class AlphabetType {
    SPACE,
    ALPHABET,
    DIGITAL,
    OTHER
}

