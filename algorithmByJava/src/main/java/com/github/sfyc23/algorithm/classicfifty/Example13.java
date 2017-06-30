package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 01:50
 * 题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
 * 1.程序分析：在10万以内判断，先将该数加上100后再开方，再将该数加上268后再开方，如果开方后的结果满足如下条件，即是结果。请看具体分析：
 */
public class Example13 {
    public static void main(String[] args) {
//        做一个循环找小于100000之间的数
        for (double i = -100; i < 100000; i++) {
            //如果这个数的开方%1=0，说明这个数的开方是个整数
            if (Math.sqrt(i + 100) % 1 == 0) {
                if (Math.sqrt(i + 268) % 1 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
