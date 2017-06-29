package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 01:50
 * 【程序10】  题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
 */
public class Example10 {
    public static void main(String[] args) {
        getHeight(100);
    }

    public static void getHeight(double height) {
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += height;
            height = height / 2;
        }
        System.out.println("共经过" + sum + "米。第10次反弹" + height + "米。");
    }
}
