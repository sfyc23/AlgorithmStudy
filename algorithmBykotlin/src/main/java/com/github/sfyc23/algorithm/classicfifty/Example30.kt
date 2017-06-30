package com.github.sfyc23.algorithm.classicfifty

import java.util.*

/**
 * Author :leilei on 2017/6/28 12:42
 * 【程序30】  题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
 * 1.程序分析：首先判断此数是否大于最后一个数，然后再考虑插入中间的数的情况，插入后此元素之后的数，依次后移一个位置。
 */
fun main(args: Array<String>) {
    var numbers = getRandomArrayInt(10);
    numbers.sort();
    println("原排序数组：${Arrays.toString(numbers)}");

//    var numbers = intArrayOf(8,12,14)
    val insertInt = 25
    insertArraySort(numbers,insertInt);
}

/*
*创建一个新数组，将插入值与原数组进行比较插入
 */
fun insertArraySort(numbers: IntArray, insertInt: Int) {
    println("插入数值：$insertInt")

    //已插入标记
    var isInsertMarked = false
    val newNumbers = IntArray(numbers.size + 1)
    val lastIndex = numbers.lastIndex

    numbers.forEachIndexed { i, item ->
        if (!isInsertMarked) {
            //当前数值少于插入值，且不是最后一位
            if (item < insertInt ) {
                newNumbers[i] = item
                if (i == lastIndex) {
                    newNumbers[i + 1] = insertInt
                }
            } else {
                //在此处插入
                isInsertMarked = true
                newNumbers[i] = insertInt
                newNumbers[i+1] = item
            }
        } else {
            newNumbers[i+1] = item
        }
    }
    println("插入后排序的数组：${Arrays.toString(newNumbers)}" )
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

