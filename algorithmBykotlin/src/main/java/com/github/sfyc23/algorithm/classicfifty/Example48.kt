package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 12:42
 * 【程序 48】 题目：某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：每位数字都加上 5，然后用和除以 10 的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。
 */
fun main(args: Array<String>) {
    encryptPhone(1314)
}

fun encryptPhone(phone: Int) {
    if (phone < 1000 || phone > 9999) {
        throw IllegalArgumentException(" 请输入四位数")
    }
    println("原数字为：" + phone)
    val phones = IntArray(4)
    phones[0] = phone / 1000 // 取千位的数字
    phones[1] = phone / 100 % 10 // 取百位的数字
    phones[2] = phone / 10 % 10 // 取十位的数字
    phones[3] = phone % 10 // 取个位的数字

    //对每个数字进行加密处理
    for (i in phones.indices) {
        phones[i] = (phones[i] + 5) % 10
    }
    phones.reverse()//反转

    print("加密数字：")
    for (p in phones) {
        print(p)
    }
}