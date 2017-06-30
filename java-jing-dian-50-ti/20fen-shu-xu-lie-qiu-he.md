【程序 20】 题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前 20 项之和。

 先看斐波纳契数列  1,1,2,3,5,8,13,21....  f\(n\)

 则能得出第 N 项分数的分子为 f\(n+2\)

 则能得出第 N 项分数的分母为 f\(n+1\)



用 Java 实现：

```
public static void main(String[] args) {
    System.out.println(getSum(20));
}

public static double getSum(int index) {
    double sum = 0;
    for (int i = 1; i <= index; i++) {
        sum += fibonacci(i+2)/fibonacci(i+1);
    }
    return sum;
}

public static double fibonacci(int position) {
    if (position < 0) {
        throw new IllegalArgumentException(" the parameter is valid!");
    }
    if (position <= 2) {
        return 1.0;
    }
    int a = 1, b = 1, num = 0;
    for (int i = 3; i <= position; i++) {
        num = a + b;
        a = b;
        b = num;
    }
    return num;
}
```



用 Kotlin 实现：

```
fun main(args: Array<String>) {
    println(getSum(20))
}

fun getSum(index: Int): Double {
    var sum = 0.0
    for (i in 1..index) {
        sum += fibonacciRecursionTail(i + 2).toDouble() / fibonacciRecursionTail(i + 1).toDouble()
    }
    return sum
}

//获取斐波纳契数列
fun fibonacciRecursionTail(n: Int, curSum: Int =1, preSum: Int =1 ): Int {
    var curSum = curSum
    if (n < 2) {
        return curSum
    } else {
        curSum += preSum
        return fibonacciRecursionTail(n - 1, preSum, curSum)
    }
}
```

输出结果：

```
32.66026079864164
```



