package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/27 00:58
 * 【程序1】  题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 * 1.程序分析：兔子的规律为斐波纳契数列  0,1,1,2,3,5,8,13,21....
 * 前一项，等于前两项之和，用公式表达为 F(n) = F(n-1) + F(n-2)
 * Fibonacci Sequence
 */
public class Example1 {
    public static void main(String[] args) {


        System.out.println(iteration(10));
        System.out.println(recursion(10));
        System.out.println(recursionTail(10));
        ;
    }


    /**
     * 迭代实现方式
     * @param count
     */
    public static int iteration(int count) {
        if (count < 0) {
            throw new IllegalArgumentException(" the parameter is valid!");
        }
        if (count <= 2) {
            return 1;
        }
        int a = 1, b = 1, num = 0;
        for (int i = 3; i <= count; i++) {
            num = a + b;
            a = b;
            b = num;
        }
        System.out.println("第 " + count + " 个月的兔子为 " + num + " 只");
        return num;
    }

    /**
     * 递归实现方式
     *
     * @param count
     * @return
     */
    public static int recursion(int count) {
        if (count < 0) {
            throw new IllegalArgumentException(" the parameter is valid!");
        }
        if (count <= 2) {
            return 1;
        } else {
            return recursion(count - 1) + recursion(count - 2);
        }
    }


    public static int recursionTail(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(" the parameter is valid!");
        }
        return recursionTail(n, 1, 1);
    }

    /**
     * 尾递归
     * @param n
     * @param curSum 第一次调用是 1
     * @param preSum 第一次调用是 1
     * @return
     */
    public static int recursionTail(int n, int curSum, int preSum) {
        if (n < 2) {
            return curSum;
        } else {
            curSum += preSum;
            return recursionTail(n - 1, preSum, curSum);
        }
    }


}
