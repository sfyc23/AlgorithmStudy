【程序 21】题目：求1+2!+3!+...+20! 的和。

关于阶乘可以先看 程序22.

先计算单个数值的，然后累加就行。

用 Java 实现：

```
public static void main(String[] args) {
    System.out.println(sumFactorial(20));
}

public static long sumFactorial(int count) {
    long sum = 0L;
    for (int i = 1; i <= count; i++) {
        sum += factorialRecursionTail(i);
    }
    return sum;
}

//阶乘--尾递归
public static int factorialRecursionTail(int natural) {
    return factorialRecursionTail(natural, 1);
}

private static int factorialRecursionTail(int natural, int sum) {
    if (natural < 2) {
        return sum;
    }
    sum = sum * natural;
    return factorialRecursionTail(natural - 1,sum);
}
```

用 Kotlin 实现：

```
fun main(args: Array<String>) {
    println(sumFactorial(20))
}

fun sumFactorial(count: Int): Long {
    var sum = 0L
    for (i in 1..count) {
        sum += factorialRecursionTail(i)
    }
    return sum
}


//阶乘--尾递归
private fun factorialRecursionTail(natural: Int, sum: Long = 1L): Long {
    var sum = sum.toLong()
    if (natural < 2) {
        return sum
    }
    sum = sum * natural
    return factorialRecursionTail(natural - 1, sum)
}
```

输出为：

```
2561327494111820313
```



