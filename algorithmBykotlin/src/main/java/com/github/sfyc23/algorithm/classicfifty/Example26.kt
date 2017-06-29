package com.github.sfyc23.algorithm.classicfifty

/**
 * Author :leilei on 2017/6/28 12:42
 */
fun main(args: Array<String>) {
    println(getWeek("Tue"))
}

fun getWeek(week: String): String {
    var week = week.toLowerCase()
    when (week[0]) {
        'm' -> return "Monday"
        't' -> {
            if (week[1] == 'u') {
                return "Tuesday"
            } else if (week[1] == 'h') {
                return "Thurday"
            }
            return "输入有误"
        }
        'w' -> return "Wednesday"
        'f' -> return "Friday"
        's' -> {
            if (week[1] == 'a') {
                return "Saturday"
            } else if (week[1] == 'u') {
                return "Sunday"
            }
            return "输入有误"
        }
        else -> return "输入有误"
    }

}