【程序 3】 题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。例如：153 是一个 "水仙花数 "，因为153 = 1的三次方＋5的三次方＋3的三次方。

程序分析：利用 for 循环控制 100-999 个数，每个数分解出个位，十位，百位。

Java 实现：

```
public static void main(String[] args) {
    System.out.println(getNarcissistic(100, 999));
}

public static List<Integer> getNarcissistic(int start, int end) {
    List<Integer> nrs = new ArrayList<>();
    for (int i = start; i <= end; i++) {
        if (isNarcissistic(i)) {
            nrs.add(i);
        }
    }
    return nrs;
}

/*
*判断是否为水仙花数
*/
public static boolean isNarcissistic(int natural) {
    int hundred = natural / 10 / 10 % 10;
    int ten = natural / 10 % 10;
    int digit = natural % 10;

    int num = hundred * hundred * hundred + ten * ten * ten + digit * digit * digit;

    if (num == natural) {
        return true;
    }
    return false;
}
```

Kotlin 实现：

```
fun main(args: Array<String>) {
    println(getNarcissistic(100, 999))
}

fun getNarcissistic(start: Int, end: Int): List<Int> {
    val nrs = ArrayList<Int>()
    for (i in start..end) {
        if (i.isNarcissistic()) {
            nrs.add(i)
        }
    }
    return nrs
}

/**
 * 扩展函数，判断是否为水仙花数。
 */
fun Int.isNarcissistic(): Boolean {
    val hundred = this / 10 / 10 % 10
    val ten = this / 10 % 10
    val digit = this % 10

    val num = hundred * hundred * hundred + ten * ten * ten + digit * digit * digit

    if (num == this) {
        return true
    }
    return false
}
```



