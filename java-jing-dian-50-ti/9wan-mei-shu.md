【程序 9】 题目：一个数如果恰好等于它的因子之和，这个数就称为 "完美数 "。  
例如 6=1＋2＋3 编程找出 1000 以内的所有完数。

用 Java 实现：

```
public static void main(String[] args) {
    for (int i = 1; i < 1000; i++) {
        if (isPerfectNumber(i)) {
            System.out.print(i + " 为完美数\t");
        }
    }
}

public static boolean isPerfectNumber(long n) {
    int s = 0;
    //迭代求出所有因子之和
    for (int i = 1; i < n; i++) {
        if (n % i == 0) {
            s += i;
        }
    }
    //判断该数是否等于它的因子之和，是则是完数。
    if (s == n) {
        return true;
    }
    return false;
}
```

用 Kotlin 实现：

```
fun main(args: Array<String>) {
    for (i in 1..999) {
        if (i.isPerfectNumber()) {
            println("$i 为完美数\t")
        }
    }
}

/**
 * Int 扩展函数
 */
fun Int.isPerfectNumber(): Boolean {
    var s = 0
    //迭代求出所有因子之和
    for (i in 1..this - 1) {
        if (this % i == 0) {
            s += i
        }
    }
    //判断该数是否等于它的因子之和，是则是完数。
    if (s == this) {
        return true
    }
    return false
}
```

输出结果为：

```
6 为完美数	
28 为完美数	
496 为完美数	

```



