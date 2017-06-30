package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/27 00:54
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，问每个月的兔子总数为多少？
 *
 * 兔子的规律为斐波纳契数列 1,1,2,3,5,8,13,21....
 */
fun main(args: Array<String>) {
    fibonacciIteration(7)
    println(fibonacciRecursion(8))

}



fun fibonacciRecursion(count: Int) :Int = when{
    count < 0 -> throw IllegalArgumentException(" the parameter is valid!")
    count in 0..2 ->  1
    else ->  fibonacciRecursion(count - 1) + fibonacciRecursion(count - 2)
}


/**
 * 递推实现方式
 * @param count
 */
fun fibonacciIteration(count: Int): Int = when{
    count < 0 -> throw IllegalArgumentException(" the parameter is valid!")
    count in 0..2 ->  1
    else -> {
        var a = 1
        var b = 1
        var num = 0
        for (i in 3..count) {
            num = a + b
            a = b
            b = num
        }
        println("第 $count 个月的兔子为 $num 只")
        num
    }
}

fun fibonacciRecursionTail(n: Int, curSum: Int =1, preSum: Int =1 ): Int {
    var curSum = curSum
    if (n < 2) {
        return curSum
    } else {
        curSum += preSum
        return fibonacciRecursionTail(n - 1, preSum, curSum)
    }
}




