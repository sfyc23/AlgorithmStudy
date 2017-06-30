package com.github.sfyc23.algorithm.classicfifty;

import java.util.Arrays;
import java.util.Random;

/**
 * Author :leilei on 2017/6/28 12:39
 * * 【程序28】  题目：对10个数进行排序
 * 1.程序分析：可以利用选择法，即从后9个比较过程中，选择一个最小的与第一个元素交换，下次类推，即用第二个元素与后8个进行比较，并进行交换。
 */
public class Example28 {
    public static void main(String[] args) {

        int[] numbers = getRandomInt();
        System.out.println("原数组：" + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("排序后：" + Arrays.toString(numbers));
//        bubbleSort(numbers);//冒泡排序
    }


    /*
    * 冒泡排序
    * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
    * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
    * 针对所有的元素重复以上的步骤，除了最后一个。
    * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
    * @param numbers 需要排序的整型数组
    */
    public static void bubbleSort(int[] numbers) {
        int temp = 0;
        int size = numbers.length;
        for (int i = 0, il = size - 1; i < il; i++) {
            for (int j = 0, jl = size - 1 - i; j < jl; j++) {
                //交换两数位置
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public static int[] getRandomInt() {
        int[] numbers = new int[10];
        Random rd = new Random();
        for (int i = 0, length = numbers.length; i < length; i++) {
            numbers[i] = rd.nextInt(100);
        }
        return numbers;
    }

    public static void printlnArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number+"\t");
        }
        System.out.println();
    }
}
