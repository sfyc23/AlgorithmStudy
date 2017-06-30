【程序 22】题目：利用递归方法求 5!。

分别使用递归与尾递归实现。

用 Java 实现：

```
public static void main(String[] args) {
    System.out.println(factorialRecursion(5));
    System.out.println(factorialRecursionTail(5));
}

//递归
public static long factorialRecursion(int natural) {
    if (natural <= 1L) {
        return 1L;
    } else {
        return natural * factorialRecursion(natural - 1);
    }
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
    println(factorialRecursion(5))
    println(factorialRecursionTail(5))
}

//递归
fun factorialRecursion(natural: Int): Long {
    if (natural <= 1L) {
        return 1L
    } else {
        return natural * factorialRecursion(natural - 1)
    }
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
120
120
```



