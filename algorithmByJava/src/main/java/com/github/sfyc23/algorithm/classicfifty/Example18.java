package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 01:50
 * 【程序18】  题目：两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。有人向队员打听比赛的名单。
 * a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。
 */
public class Example18 {
    public static void main(String[] args) {

        String[] s = {"x", "y", "z"};
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                for (int k = 0; k < s.length; k++) {
                    String a = s[i];
                    String b = s[j];
                    String c = s[k];
                    //a,b,c互不相等，a不同于x,C不同于y,z
                    if ((!a.equals(b)) && (!b.equals(c)) && (!a.equals(c)) &&
                            (!"x".equals(a)) && (!"x".equals(c)) && (!"z".equals(c))) {
                        System.out.println("比赛名单如下：");
                        System.out.println("a  VS  " + a);
                        System.out.println("b  VS  " + b);
                        System.out.println("c  VS  " + c);
                    }
                }
            }
        }
    }

}
