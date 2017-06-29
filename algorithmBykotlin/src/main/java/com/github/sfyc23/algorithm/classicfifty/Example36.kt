package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 12:42
 */
fun main(args: Array<String>) {
    val numbers = getRandomArrayInt(10)
    printArray(numbers, "正序：\t")

    var newNum = moveArray(numbers, 3)

    printArray(newNum, "移动3位到最前之后:");
}

fun moveArray(numbers: IntArray, m: Int): IntArray {
    if (m < 0 || m > numbers.size - 1) {// 判断移动的位置是否合法
        throw IllegalArgumentException(" 移动位数不能大于数组个数，且不能为负数")
    }
    val arrayLength = numbers.size
    val newNums = IntArray(arrayLength)
    for (i in 0..arrayLength - 1) {
        if (i < m) {
            newNums[i] = numbers[arrayLength - m + i]
        } else {
            newNums[i] = numbers[i - m]
        }
    }
    return newNums

}