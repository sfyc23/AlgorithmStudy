package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 01:50
 【程序23】  题目：有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。问第4个人岁数，他说比第3个人大2岁。问第三个人，又说比第2人大两岁。问第2个人，说比第一个人大两
 岁。最后问第一个人，他说是10岁。请问第五个人多大？
 1.程序分析：利用递归的方法，递归分为回推和递推两个阶段。要想知道第五个人岁数，需知道第四人的岁数，依次类推，推到第一人（10岁），再往回推。
 */
public class Example23 {
    public static void main(String[] args) {
        ageCalc();
    }

    public static void ageCalc(){
        int age = 10;
        System.out.println("第1个人的岁数为：" + age);

        age += 2;
        System.out.println("第2个人的岁数为：" + age);

        age += 2;
        System.out.println("第3个人的岁数为：" + age);

        age += 2;
        System.out.println("第4个人的岁数为：" + age);

        age += 2;
        System.out.println("第5个人的岁数为：" + age);

    }

}
