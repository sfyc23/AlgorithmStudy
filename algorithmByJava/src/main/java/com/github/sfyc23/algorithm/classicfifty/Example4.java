package com.github.sfyc23.algorithm.classicfifty;

import java.util.ArrayList;
import java.util.List;

/**
 * Author :leilei on 2017/6/27 10:05
 * 【程序4】  题目：将一个正整数分解质因数。例如：输入 90,打印出 90=2*3*3*5。
 * 程序分析：对 n 进行分解质因数，应先找到一个最小的质数 k，然后按下述步骤完成：
 * (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
 * (2)如果n <> k，但 n 能被 k 整除，则应打印出 k 的值，并用 n 除以 k 的商,作为新的正整数n,并重复执行第一步。
 * (3)如果 n 不能被 k 整除，则用 k+1 作为 k 的值,重复执行第一步。
 *
 *
 */
public class Example4 {
    public static void main(String[] args) {
//        for (int i = 5; i < 1000; i++) {
////            primeByRecursively(i, true);
//            decPrime(i);
//        }
//        primeByRecursively(144, true);

        decPrime(75);

    }

    /**
     * 用递归的方法做处理
     * @param natural
     * @param isFirst
     */
    public static void primeByRecursively(int natural, boolean isFirst) {

        if (isFirst) {
            System.out.print(natural + " = ");
        }
        for (int i = 2, length = (int) Math.sqrt(natural); i <= length; i++) {
            if (natural % i == 0) {
                System.out.print(i + " * ");
                primeByRecursively(natural / i, false);
                return;
            }
        }

        //最后一行。
        if (isFirst) {
            System.out.println(natural + "为质数");
        } else {
            System.out.println(natural);
        }

    }


    /**
     * 用递推的方法做处理
     * @param natural
     */
    public static void decPrime(int natural) {
        List<Integer> primes = new ArrayList<>();
        int temp = natural;

        for (int i = 2, length = (int) Math.sqrt(temp); i <= length; i++) {
            while (temp != i) {
                if (temp % i != 0) {
                    break;//不能整除肯定不是因数，能够整除在这里一定是质数。因为所有的2，3,5,7
                    //都被除完之后。剩下的因数只能是奇数，且是质数。
                }
                primes.add(i);
                temp = temp / i;
            }
        }
        primes.add(temp);

        if (primes.size() > 1) {
            System.out.print(natural + " = ");
            for (int i = 0, lentgh = primes.size(); i < lentgh; i++) {
                System.out.print(primes.get(i));
                if (i != lentgh - 1) {
                    System.out.print(" * ");
                }

            }
        } else {
            System.out.println(natural + " 为质数");
        }
        System.out.println();

    }


}
