package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 01:51
 * 【程序14】  题目：输入某年某月某日，判断这一天是这一年的第几天？
 * 1.程序分析：以3月5日为例，应该先把前两个月的加起来，然后再加上5天即本年的第几天，特殊情况，闰年且输入月份大于3时需考虑多加一天。
 */
public class Example14 {
    public static void main(String[] args) {
        System.out.println(getDay(2017, 6, 28));
    }

    public static int getDay(int year, int month, int day) {
        int sum = 0;
        /*先计算某月以前月份的总天数*/
        switch (month) {
            case 1:
                sum = 0;
                break;
            case 2:
                sum = 31;
                break;
            case 3:
                sum = 31 + 28;
                break;
            case 4:
                sum = 31 + 28 + 31;
                break;
            case 5:
                sum = 31 + 28 + 31 + 30;
                break;
            case 6:
                sum = 31 + 28 + 31 + 30 + 31;
                break;
            case 7:
                sum = 31 + 28 + 31 + 30 + 31 + 30;
                break;
            case 8:
                sum = 31 + 28 + 31 + 30 + 31 + 30 + 31;
                break;
            case 9:
                sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
                break;
            case 10:
                sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                break;
            case 11:
                sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                break;
            case 12:
                sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
                break;
            default:
                System.out.println("data error");
                break;
        }

        //平年，且月份大于2
        if (!isLeapYear(year) && month > 2) {
            sum += 1;
        }
        sum += day;
        return sum;
    }

    /**
     * 判断是否为闰年。
     * @param year
     * @return
     */
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

}
