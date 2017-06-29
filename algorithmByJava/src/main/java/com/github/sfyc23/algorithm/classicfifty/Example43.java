package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 12:39
 * 题目：求0—7所能组成的奇数个数。
 算法思想：
 这个问题其实是一个排列组合的问题，设这个数为sun=a1a2a3a4a5a6a7a8,a1-a8表示这个数的某位的数值，
 当一个数的最后一位为奇数时，那么这个数一定为奇数，不管前面几位是什么数字。如果最后一位数为偶数，
 则这个数一定为偶数。
 a1-a8可以取0-7这个八个数字，首位数字不为0。
 从该数为一位数到该数为8位数开始统计奇数的个数：
 1.当只有一位数时也就是该数的最后一位，奇数个数为8/2=4
 2.当该数为两位数时，奇数个数为8*7/2=28
 3.当该数为三位数时，奇数个数为：8*8*7/2=224

 */
public class Example43 {
    public static void main(String[] args) {

        int count = 0;

        // 声明由数字组成的数
        int n = 8;
        // 一位数
        count = n / 2;
        // 两位数
        count += (n - 1) * n / 2;
        // 三位数
        count += (n - 1) * n * n / 2;
        // 四位数
        count += (n - 1) * n * n * n / 2;
        // 五位数
        count += (n - 1) * n * n * n * n / 2;
        // 六位数
        count += (n - 1) * n * n * n * n * n / 2;
        // 七位数
        count += (n - 1) * n * n * n * n * n * n / 2;

        System.out.println("求0—7所能组成的奇数个数为:" + count);
    }
}
