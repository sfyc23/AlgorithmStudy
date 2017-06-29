package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 12:42
 * 题目：将一个数组逆序输出。
 * 1.程序分析：用第一个与最后一个交换。
 */
fun main(args: Array<String>) {
    var numbers = getRandomArrayInt()
    printArray(numbers, "正序：");
    printArrayReverse(numbers, "倒序：");

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