package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 01:50
 * 【程序19】  题目：打印出如下图案（菱形） *   ***   ******   ********   ******   ***   *
 * 1.程序分析：先把图形分成两部分来看待，前四行一个规律，后三行一个规律，利用双重   for循环，第一层控制行，第二层控制列。
 * 前n项(空格)= n-1 ,(*) = 2*n-1
 * 后n-1项 (空格)= count ,(*) = 2*(count-m)-1
 */
public class Example19 {
    public static void main(String[] args) {
        printDiamond(4);
    }

    public static void printDiamond(int num) {
        for (int i = 1; i <= num; i++) {
            int spaceTemp = i;
            while (num > spaceTemp) {
                System.out.print(" ");
                spaceTemp++;
            }

            int statTemp = 1;
            int count = 2 * i - 1;
            while (statTemp <= count) {
                System.out.print("*");
                statTemp++;
            }
            System.out.println();
        }

        for (int i = 1; i < num; i++) {
            int spaceTemp = 1;
            while (spaceTemp <= i) {
                System.out.print(" ");
                spaceTemp++;
            }
            int statTemp = 2 * (num - i) - 1;
            while (statTemp > 0) {
                System.out.print("*");
                statTemp--;
            }
            System.out.println();
        }
    }


}
