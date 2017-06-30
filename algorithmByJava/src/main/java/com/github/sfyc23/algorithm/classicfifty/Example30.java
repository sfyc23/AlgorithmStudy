package com.github.sfyc23.algorithm.classicfifty;

import java.util.Arrays;
import java.util.Random;

/**
 * Author :leilei on 2017/6/28 12:39
 * 【程序30】  题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
 * 1.程序分析：首先判断此数是否大于最后一个数，然后再考虑插入中间的数的情况，插入后此元素之后的数，依次后移一个位置。
 */
public class Example30 {
    public static void main(String[] args) {
        //获取一个随机数组并排序
        Integer[] numbers = getRandomIntArray(10);
        Arrays.sort(numbers);
        System.out.println("原排序数组：" + Arrays.toString(numbers));

        int insertInt = 25;
        insertMethods0(numbers, insertInt);
//        insertMethods1(numbers, insertInt);
    }

    /*
    *创建一个新数组，将插入值与原数组进行比较插入
     */
    public static void insertMethods0(Integer[] numbers, int insertInt) {
        System.out.println("插入数值：" + insertInt);

        //已插入标记
        boolean isInsertMarked = false;
        Integer[] newNumbers = new Integer[numbers.length + 1];
        for (int i = 0, length = numbers.length; i < length; i++) {
            if (!isInsertMarked) {
                if (numbers[i] < insertInt) {
                    newNumbers[i] = numbers[i];
                    if (i == length - 1) {
                        newNumbers[i + 1] = insertInt;
                    }
                } else {
                    //在此处插入
                    isInsertMarked = true;
                    newNumbers[i] = insertInt;
                    newNumbers[i + 1] = numbers[i];
                }
            } else {
                newNumbers[i + 1] = numbers[i];
            }
        }
        System.out.println("插入后排序的数组：\t" + Arrays.toString(newNumbers));
    }

    public static Integer[] getRandomIntArray(int count) {
        Integer[] numbers = new Integer[count];
        Random rd = new Random();
        for (int i = 0, length = numbers.length; i < length; i++) {
            numbers[i] = rd.nextInt(100);
        }
        return numbers;
    }


    /**
     * 创建一个新数组，将插入值放在第0位，其他数据copy,然后重新进行排序
     *
     * @param numbers
     * @param insertInt
     */
    public static void insertMethods1(Integer[] numbers, int insertInt) {
        System.out.println("插入数值：" + insertInt);

        //创建一个新数组，将值插入到第 0 项，其他数值 copy
        Integer[] newNumbers = new Integer[numbers.length + 1];
        newNumbers[0] = insertInt;
        for (int i = 0, length = numbers.length; i < length; i++) {
            newNumbers[i + 1] = numbers[i];
        }

        System.out.println("插入后的数组：\t" + Arrays.toString(newNumbers));

        Arrays.sort(newNumbers);
        System.out.println("插入后排序的数组：\t" + Arrays.toString(newNumbers));
    }


}
