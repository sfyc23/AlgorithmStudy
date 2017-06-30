package com.github.sfyc23.algorithm.classicfifty;

import java.util.Arrays;

/**
 * Author :leilei on 2017/6/28 01:50
 * 【程序15】  题目：输入三个整数x,y,z，请把这三个数由小到大输出。
 * 1.程序分析：我们想办法把最小的数放到x上，先将x与y进行比较，如果x> y则将x与y的值进行交换，然后再用x与z进行比较，如果x> z则将x与z的值进行交换，这样能使x最小。
 * 最后对比y,z.
 */
public class Example15 {
    public static void main(String[] args) {
        sort(6, 4, 3);
        arraySort(6, 4, 3);
    }

    /**
     * 脑残性排序并输出
     */
    public static void sort(int x, int y, int z) {
        int temp = 0;
        if (x > y) {
            temp = x;
            x = y;
            y = temp;
        }

        if (x > z) {
            temp = x;
            x = z;
            z = temp;
        }

        if (y > z) {
            temp = y;
            y = z;
            z = temp;
        }
        System.out.println("x = " + x + ", y = " + y + " , z = " + z);
    }

    /**
     * 使用Array.sort();并用Array.toString()输出
     */
    public static void arraySort(int x, int y, int z) {
        Integer[] is = new Integer[]{x, y, z};
        Arrays.sort(is);
        System.out.println(Arrays.toString(is));
    }

}
