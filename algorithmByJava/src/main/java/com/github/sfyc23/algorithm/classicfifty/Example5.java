package com.github.sfyc23.algorithm.classicfifty;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Author :leilei on 2017/6/27 12:05
 * 【程序5】  题目：利用条件运算符的嵌套来完成此题：学习成绩> =90 分的同学用 A 表示，
 * 60-89 分之间的用 B 表示，60分以下的用 C 表示。
 * 1.程序分析：(a> b)?a:b这是条件运算符的基本例子。
 */
public class Example5 {
    public static void main(String[] args) {
        List<Integer> scores = getScore(20);
        for (int score : scores) {
            if (score >= 90) {
                System.out.println("score:" + score + " , grade : A");
            } else if (score > 60) {
                System.out.println("score:" + score + " , grade : B");
            } else {
                System.out.println("score:" + score + " , grade : C");
            }
        }
    }

    private static List<Integer> getScore(int num) {
        List<Integer> scores = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < num; i++) {
            scores.add(rd.nextInt(100));
        }
        return scores;
    }

}


