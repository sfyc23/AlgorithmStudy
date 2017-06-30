package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 12:39
 * 【程序 49】 题目：计算字符串中子串出现的次数。
 */
public class Example49 {

    public static void main(String[] args) {
        String sup = "How much caramel can a canny canonball cram in a camel if a canny canonball can cram caramel in a camel?";
        String son = "ca";
        int count = containsNum(sup, son);
        System.out.println("出现的次数为：" + count);
    }

    public static int containsNum(String sup, String son) {
        return containsNum(sup, son, 0);
    }

    private static int containsNum(String sup, String son, int count) {
        if (sup.contains(son) && count < 20) {
            count++;
            int supBeginIndex = sup.indexOf(son) + son.length();
            //字符串截断,从子字符串出现的位置
            sup = sup.substring(supBeginIndex);
            return containsNum(sup, son, count);
        }
        return count;
    }


}
