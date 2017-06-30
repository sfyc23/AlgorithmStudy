程序 26】 题目：请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续判断第二个字母。

程序分析：用情况语句比较好，如果第一个字母一样，则判断用情况语句或 if 语句判断第二个字母。



用 Java 实现：

```
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
```

用 Kotlin 实现：

```
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
```

输出为：

```
Tuesday
```



