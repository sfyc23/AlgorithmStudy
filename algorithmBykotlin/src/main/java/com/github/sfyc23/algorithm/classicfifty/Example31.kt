package com.github.sfyc23.algorithm.classicfifty

import java.util.*

/**
 * Author :leilei on 2017/6/28 12:42
 * 题目：将一个数组逆序输出。
 * 1.程序分析：用第一个与最后一个交换。
 */
fun main(args: Array<String>) {
//    var numbers = getRandomArrayInt()
    val numbers = arrayOf(1, 5, 3, 2, 9)
    println("正序：${Arrays.toString(numbers)}")

    //遍迭数组
    print("倒序：\t")
    for (i in numbers.lastIndex downTo 0){
        print("${numbers[i]} \t")
    }
    println()

    //反转数组
    numbers.reverse()
    println("倒序：${Arrays.toString(numbers)}")

}

fun printArrayReverse(intArray: IntArray, prifix: String? = null) {
    prifix?.let {
        print(it)
    }

    for (i in intArray.size - 1 downTo 0) {
        print("${intArray[i]} \t")
    }
    println()
}