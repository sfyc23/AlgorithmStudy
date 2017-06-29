package com.github.sfyc23.algorithm.classicfifty

import java.util.*

/**
 * Author :leilei on 2017/6/27 17:02
 */
fun main(args: Array<String>) {

    primeByRecursively(75, true)
    primeByRecursive(75)
}

/**
 * 用递归的方法做处理
 * @param natural
 * *
 * @param isFirst 用于打印
 */
fun primeByRecursively(natural: Int, isFirst: Boolean = false) {

    if (isFirst) {
        print("$natural = ")
    }
    val sqrt = Math.sqrt(natural.toDouble()).toInt()
    for (i in 2..sqrt) {
        if (natural % i == 0) {
            print("$i * ")
            primeByRecursively(natural / i)
            return
        }
    }

    //最后一行。
    if (isFirst) {
        println("$natural 为质数")
    } else {
        println(natural)
    }
}

/**
 * 用递推的方法做处理
 * @param natural
 */
fun primeByRecursive(natural: Int) {
    var primes = ArrayList<Int>()
    var temp = natural

    val sqrt = Math.sqrt(temp.toDouble()).toInt()
    for (i in 2..sqrt) {
        while (temp != i) {
            if (temp % i != 0) {
                break//不能整除肯定不是因数，能够整除在这里一定是质数。因为所有的2，3,5,7
                //都被除完之后。剩下的因数只能是奇数，且是质数。
            }
            primes.add(i)
            temp = temp / i
        }
    }
    primes.add(temp)

    val lentgh = primes.size
    if (lentgh > 1) {
        print("$natural = ")
        for (i in primes.indices) {
            print(primes[i])
            if (i != lentgh - 1) {
                print(" * ")
            }
        }
    } else {
        println("$natural 为质数")
    }
    println()

}