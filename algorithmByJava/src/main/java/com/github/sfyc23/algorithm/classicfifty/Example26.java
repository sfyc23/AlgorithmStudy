package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 12:39
 * 【程序26】  题目：请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续判断第二个字母。
 * 1.程序分析：用情况语句比较好，如果第一个字母一样，则判断用情况语句或if语句判断第二个字母。
 * 　星期一： Mon.=Monday
 * 　　星期二： Tues.=Tuesday
 * 　　星期三：Wed.=Wednesday
 * 　　星期四： Thur.=Thurday
 * 　　星期五： Fri.=Friday
 * 　　星期六： Sat.=Saturday
 * 　　星期天： Sun.=Sunday
 */
public class Example26 {
    public static void main(String[] args) {
        System.out.println(getWeek("Tue"));
    }

    public static String getWeek(String week) {
        week = week.toLowerCase();
        switch (week.charAt(0)) {
            case 'm':
                return "Monday";
            case 't':
                if (week.charAt(1) == 'u') {
                    return "Tuesday";
                } else if (week.charAt(1) == 'h') {
                    return "Thurday";
                }
                return "输入有误";
            case 'w':
                return "Wednesday";
            case 'f':
                return "Friday";
            case 's':
                if (week.charAt(1) == 'a') {
                    return "Saturday";
                } else if (week.charAt(1) == 'u') {
                    return "Sunday";
                }
                return "输入有误";
            default:
                return "输入有误";
        }

    }
}
