package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/27 20:27
 * 【程序7】  题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 * 1.程序分析：利用while语句,条件为输入的字符不为 '\n '.
 */
public class Example7 {
    public final static String SS = "Jack quietly moved up front and seized the big ball of wax. (47 letters) (Includes proper noun)";

    public static void main(String[] args) {




        char[] as = SS.toCharArray();
        int spaceCount = 0;
        int alphabet = 0;
        int other = 0;
        int digital = 0;
        for (char a : as) {
            if (a == ' ') {
                spaceCount++;
            } else if ((a >= 'a' && a <= 'z') || (a >= 'A' && a < 'Z')) {
                alphabet++;
            } else if (a >= '0' && a <= '9') {
                digital++;
            } else {
                other++;
            }
        }

        System.out.println("空格：" + spaceCount);
        System.out.println("字母：" + alphabet);
        System.out.println("数字：" + digital);
        System.out.println("其他：" + other);
    }
}
