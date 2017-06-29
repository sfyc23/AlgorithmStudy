package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 12:42
 * 【程序39】  题目：编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,
 * 当输入n为奇数时，调用函数1/1+1/3+...+1/n(利用指针函数)
 */
fun main(args: Array<String>) {
    val natural = 7
    if (natural < 0) {
        throw IllegalArgumentException("自然数必须大于0")
    }

    var sum = 0.0
    var i = if (natural.isEven()) 2.0 else 1.0

    while (i <= natural) {
        sum += 1.0 / i
        i += 2.0
    }
    println("因数为：$natural,sum = $sum")

}

//int 扩展函数
fun Int.isEven(): Boolean {
    if (this % 2 == 0) {
        return true
    }
    return false
}


