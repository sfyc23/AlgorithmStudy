【程序 1】  题目：古典问题：有一对兔子，从出生后第 3 个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？

程序分析：兔子的规律为 [斐波纳契数列](https://zh.wikipedia.org/wiki/%E6%96%90%E6%B3%A2%E9%82%A3%E5%A5%91%E6%95%B0%E5%88%97) 0,1,1,2,3,5,8,13,2...

**特别指出**：0 不是第一项，而是第零项。

### 用 Java 方法实现：

#### 用递归方式实现：

```
 /**
 * 递归实现方式
 * @param count
 * @return
 */
public static int recursively(int count) {
    if (count < 0) {
        throw new IllegalArgumentException(" the parameter is valid!");
    }
    if (count <= 2) {
        return 1;
    } else {
        return recursively(count - 1) + recursively(count - 2);
    }
}
```

### 用递归方式实现：

```
/**
 * 累加实现方式
 * @param count
 */
public static int recursive(int count) {
    if (count < 0) {
        throw new IllegalArgumentException(" the parameter is valid!");
    }
    if (count <= 2) {
        return 1;
    }
    int a = 1, b = 1, num = 0;
    for (int i = 3; i <= count; i++) {
        num = a + b;
        a = b;
        b = num;
    }
    System.out.println("第 " + count + " 个月的兔子为 " + num + " 只");
    return num;
}
```

### 尾递归方式实现

```
public static int recursionTail(int n) {
    return recursionTail(n, 1, 1);
}

/**
 * 尾递归
 * @param n
 * @param curSum 第一次调用是 1
 * @param preSum 第一次调用是 1
 * @return
 */
public static int recursionTail(int n, int curSum, int preSum) {
    if (n < 2) {
        return curSum;
    } else {
        curSum += preSum;
        return recursionTail(n - 1, preSum, curSum);
    }
}
```



### 用 Kotlin 的方式实现

```
fun recursionTail(n: Int, curSum: Int =1, preSum: Int =1 ): Int {
    var curSum = curSum
    if (n < 2) {
        return curSum
    } else {
        curSum += preSum
        return recursionTail(n - 1, preSum, curSum)
    }
}
```



