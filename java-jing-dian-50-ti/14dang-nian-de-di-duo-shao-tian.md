【程序 14】 题目：输入某年某月某日，判断这一天是这一年的第几天？

程序分析：以 3 月 5 日为例，应该先把前两个月的加起来，然后再加上 5 天即本年的第几天，特殊情况，闰年且输入月份大于 3 时需考虑多加一天。



用 Java 实现：

```
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
```

用  Kotlin 实现 

```
fun main(args: Array<String>) {
    println(getDay(2017, 6, 28))
}

fun getDay(year: Int, month: Int, day: Int): Int {
    var sum = 0
    /*先计算某月以前月份的总天数*/
    when (month) {
        1 -> sum = 0
        2 -> sum = 31
        3 -> sum = 31 + 28
        4 -> sum = 31 + 28 + 31
        5 -> sum = 31 + 28 + 31 + 30
        6 -> sum = 31 + 28 + 31 + 30 + 31
        7 -> sum = 31 + 28 + 31 + 30 + 31 + 30
        8 -> sum = 31 + 28 + 31 + 30 + 31 + 30 + 31
        9 -> sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31
        10 -> sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30
        11 -> sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31
        12 -> sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30
        else -> println("data error")
    }

    //平年，且月份大于2
    if (!isLeapYear(year) && month > 2) {
        sum += 1
    }
    sum += day

    return sum
}

/**
 * 判断是否为闰年。
 * @param year
 * *
 * @return
 */
fun isLeapYear(year: Int): Boolean {
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        return true
    }
    return false
}
```



