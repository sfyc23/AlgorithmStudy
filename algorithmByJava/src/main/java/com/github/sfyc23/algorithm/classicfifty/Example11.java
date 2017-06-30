package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 01:50
 * 【程序11】  题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 * 1.程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去掉不满足条件的排列。
 */
public class Example11 {
    public static void main(String[] args) {
        int count = 0;
        for (int one = 1; one <= 4; one++)
            for (int ten = 1; ten <= 4; ten++)
                for (int hundred = 1; hundred <= 4; hundred++)
                    if (one != ten && ten != hundred && one != hundred) {
                        count++;
//                        System.out.println(one * 100 + ten * 10 + hundred);
                    }
        System.out.println("一共有 " + count + " 个数据");
    }
}
