package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 02:04
 * 【程序11】  题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
1.程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去掉不满足条件的排列。
 */
fun main(args: Array<String>) {
    var count = 0
    for (one in 1..4)
        for (ten in 1..4)
            for (hundred in 1..4)
                if (one != ten && ten != hundred && one != hundred) {
                    count++
                    println(one * 100 + ten * 10 + hundred)
                }
    println("一共有 $count 个数据")
}