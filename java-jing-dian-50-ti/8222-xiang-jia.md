【程序 8】 题目：求 s=a+aa+aaa+aaaa+aa...a 的值，其中 a 是一个数字。例如 2+22+222+2222+22222 \(此时共有 5 个数相加\)，几个数相加有键盘控制。

程序分析：关键是计算出每一项的值。

写键盘输入麻烦，所以就不写了。

用 Java 实现：

```
public static void main(String[] args) {
    System.out.println(getSum(2, 4));
}

public static long getSum(int a, int length) {
    if (a <= 0 || a >= 10) {
        throw new IllegalArgumentException("请输入正确的数字!");
    }
    long num = 0;
    for (int i = 0; i < length; i++) {
        num += a * getOne(i);
    }
    return num;
}

public static long getOne(int length) {
    if (length == 0) {
        return 1;
    } else {
        return (long) Math.pow(10, length) + getOne(length - 1);
    }

}
```

用 Kotlin 实现：

```
fun main(args: Array<String>) {
    println(getSum(2, 4))
}

fun getSum(a: Int, length: Int): Long {
    var num: Long = 0
    for (i in 0..length - 1) {
        num += a * getOne(i)
    }
    return num
}

fun getOne(length: Int): Long {
    if (length == 0) {
        return 1
    } else {
        return Math.pow(10.0, length.toDouble()).toLong() + getOne(length - 1)
    }
}
```



