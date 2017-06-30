package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 01:50
 * 【程序10】  题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
 */
public class Example10 {
    public static void main(String[] args) {
        getHeight(100, 10);
    }

    public static void getHeight(double height, int count) {
        if (count < 0 || height < 0) {
            throw new IllegalArgumentException("请输入正确的数值");
        }
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += height;
            height = height / 2;
        }
        System.out.println("共经过 " + sum + " 米。第 " + count + " 次反弹 " + height + " 米。");
    }
}
