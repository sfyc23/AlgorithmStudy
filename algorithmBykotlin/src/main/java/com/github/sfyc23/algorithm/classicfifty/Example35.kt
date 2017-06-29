package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 12:42
 * 【程序35】  题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
 */
fun main(args: Array<String>) {
//    var numbers = getRandomArrayInt(10)

    var numbers = intArrayOf(1, 2,6, 5, 3, 4);
    printArray(numbers, "输入：")

    //全部倒序排序，这样自然最大在前，最小在前
//    numbers.sortDescending();

    numbers.replace(numbers.maxIndexed(), 0)
    numbers.replace(numbers.minIndexed(), numbers.lastIndex)

    printArray(numbers, "排序：")

}

public fun IntArray.replace(n1: Int?, n2: Int?) {
    if (n1 == null || n2 == null) {
        return
    }
    if (n1 !in 0..lastIndex) {
        return
    }
    if (n2 !in 0..lastIndex) {
        return
    }
    if (n1 == n2) {
        return
    }
    var temp = 0
    temp = this[n1]
    this[n1] = this[n2]
    this[n2] = temp
}


public fun IntArray.maxIndexed(): Int? {
    if (isEmpty()) return null
    var max = this[0]
    var maxIndex = 0
    for (i in 1..lastIndex) {
        val e = this[i]
        if (max < e) {
            max = e
            maxIndex = i;
        }
    }
    return maxIndex
}

public fun IntArray.minIndexed(): Int? {
    if (isEmpty()) return null
    var min = this[0]
    var minIndex = 0;
    for (i in 1..lastIndex) {
        val e = this[i]
        if (min > e) {
            min = e
            minIndex = i;
        }
    }
    return minIndex
}