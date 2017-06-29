package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 01:50
 * 【程序12】  题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可
 * 提成7.5%；20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成 3%；60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，
 * 超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？
 * 1.程序分析：请利用数轴来分界，定位。注意定义时需把奖金定义成长整型。
 *
 */
public class Example12 {
    public static void main(String[] args) {
        getMomey(250000);
    }

    public static double getMomey(double lirun) {
        double sum = 0.0;

        if (lirun <= 100000) {
            sum = lirun * 0.1;
        } else if (lirun <= 200000) {
            sum = 10000 + lirun * 0.075;
        } else if (lirun <= 400000) {
            sum = 17500 + lirun * 0.05;
        } else if (lirun <= 600000) {
            sum = 27500 + lirun * 0.03;
        } else if (lirun <= 1000000) {
            sum = 33500 + lirun * 0.015;
        } else {
            sum = 39500 + lirun * 0.01;
        }
        System.out.println("当月利润为：" + lirun + ",应发的奖金是:" + sum);
        return sum;
    }


}
