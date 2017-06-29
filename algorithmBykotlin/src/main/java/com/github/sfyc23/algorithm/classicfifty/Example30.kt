package com.github.sfyc23.algorithm.classicfifty

import java.util.*

/**
 * Author :leilei on 2017/6/28 12:42
 * 【程序30】  题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
 * 1.程序分析：首先判断此数是否大于最后一个数，然后再考虑插入中间的数的情况，插入后此元素之后的数，依次后移一个位置。
 */
fun main(args: Array<String>) {
    var numbers = getRandomArrayInt(10);
    printArray(numbers, "原版:")

    numbers.sort();
    printArray(numbers, "排序后:")

    var newNumbers = insertNum(numbers, 25);
    printArray(numbers, "插入后:")

    numbers.sort();
    printArray(numbers, "插入后排序:")


}

fun getRandomArrayInt(count: Int = 10): IntArray {
    val numbers = IntArray(count)
    val rd = Random()
    for (i in 0..count - 1) {
        numbers[i] = rd.nextInt(100)
    }
    return numbers
}

/**
 * 打印数组
 */
fun printArray(intArray: IntArray, prifix: String? = null) {
    prifix?.let {
        print(it)
    }
    intArray.forEach {
        print("$it \t")
    }
    println()
}

fun insertNum(array: IntArray, num: Int): IntArray {
    val result = IntArray(array.size + 1)
    result[0] = num
    for (i in 0..array.size - 1) {
        result[i + 1] = array[i]
    }
    return result
}