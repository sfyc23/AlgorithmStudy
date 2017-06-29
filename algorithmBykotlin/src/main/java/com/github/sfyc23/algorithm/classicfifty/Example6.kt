package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/27 17:23
 * 题目：输入两个正整数 m 和 n ，求其最大公约数和最小公倍数。
 * 1.程序分析：利用辗除法。
 */

fun main(args: Array<String>) {
    println("Greatest Common Divisor:" + getGcd(12, 18))
    println("Least Common Multiple:" + getLcm(12, 18))
}

/**
 * 最大公约数(Greatest Common Divisor)。
 * 如果有一个自然数a能被自然数b整除，则称a为b的倍数，b为a的约数。几个自然数公有的约数，叫做这几个自然数的公约数。公约数中最大的一个公约数，称为这几个自然数的最大公约数。
 * 早在公元前300年左右，欧几里得就在他的著作《几何原本》中给出了高效的解法——辗转相除法。
 * 辗转相除法使用到的原理很聪明也很简单，假设用f（x, y）表示x，y的最大公约数，
 * 取k = x/y，b = x%y，则x = ky + b，如果一个数能够同时整除x和y，则必能同时整除b和y；
 * 而能够同时整除b和y的数也必能同时整除x和y，即x和y的公约数与b和y的公约数是相同的，其最大公约数也是相同的，则有f（x, y）= f（y, x%y）（y > 0），
 * 如此便可把原问题转化为求两个更小数的最大公约数，直到其中一个数为0，剩下的另外一个数就是两者最大的公约数。

 * @param x
 * *
 * @param y
 * *
 * @return
 */
fun getGcd(x: Int, y: Int): Int {
    var x = x
    var y = y
    if (x < y) {
        val temp = x
        x = y//x存储较大的一个数
        y = temp
    }

    var k = 0
    while (y != 0) {
        k = x % y
        x = y
        y = k
    }
    return x
}

/*
    求两个数的最小公倍数数(Least Common Multiple)。
  几个数公有的倍数叫做这几个数的公倍数，其中最小的一个公倍数，叫做这几个数的最小公倍数。自然数a、b的最小公倍数可以记作[a,b]，自然数a、b的最大公因数可以记作(a,b），当(a,b)=1时，[a,b]= a×b。
  两个数的最大公因数和最小公倍数有着下列关系：
  最大公因数×最小公倍数=两数的乘积
  即(a,b)×[a,b]= a×b 。
  证明：设 a = x*(a,b),b = y*(a,b) 其中x,y不存在公约数。
        a * b = [x * (a,b)] * [y * (a,b)]
                 = [x * y * (a,b)] * (a,b)
                 = [a,b] * (a,b)
     */
fun getLcm(x: Int, y: Int) = x * y / getGcd(x, y)