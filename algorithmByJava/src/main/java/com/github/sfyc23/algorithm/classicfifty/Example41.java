package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 12:39
 *
 【程序41】 题目：海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子凭据分为五份，多了一个，这只猴子把多的一个扔入海中，拿走了一份。第二只猴子把剩下的桃子又平均分成
 五份，又多了一个，它同样把多的一个扔入海中，拿走了一份，第三、第四、第五只猴子都是这样做的，问海滩上原来最少有多少个桃子？
 */
public class Example41 {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            if (isMonkeyPeach(i)) {
                System.out.println("最少有桃子:" + i);
                return;
            }
        }
    }


    public static boolean isMonkeyPeach(int natural){
        int lavePeach = natural;
        for (int i = 0; i <5; i++) {
            if ((lavePeach - 1) % 5 != 0) {
                return false;
            }
            lavePeach = (lavePeach - 1) * 4 / 5;
        }
        return true;
    }
}
