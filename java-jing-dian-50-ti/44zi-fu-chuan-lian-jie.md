【程序 44】 题目：一个偶数总能表示为两个素数之和。

证明：i\(偶数\) = j\(素数\) + k\(素数\)

用 Java 实现：

```
public static void main(String[] args) {
    //遍迭2-10000的偶数,判断是否可用
    for (int i = 2; i <= 10000; i += 2) {
        if (!isEvenEqualsPrimeAdd(i)) {
            System.out.println(i + "不能证明");
            return;
        }
    }
    System.out.println("2到10000的偶数都可以");
}

/**
 * 证明偶数 = 素数 + 素数
 * @param even 
 * @return
 */
public static boolean isEvenEqualsPrimeAdd(int even) {
    int k = 0;
    for (int j = 1; j < even; j++) {
        //如果是素数
        if (isPrimeNumber(j)) {
            k = even - j;
            if (isPrimeNumber(k)) {
                return true;
            }
        }
    }
    return false;
}

/**
 * 是否为素数
 */
public static boolean isPrimeNumber(int n) {
    int n1 = (int) Math.sqrt(n);
    for (int i = 2; i <= n1; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
```

用 Kotlin 实现：

```
fun main(args: Array<String>) {
    for (i in 2..10000 step 2) {
        if (!isEvenEqualsPrimeAdd(i)) {
            println("$i ：不能证明")
            return
        }
    }
    println("2到10000的偶数都可以")
}
/**
* 证明偶数 = 素数 + 素数
*/
fun isEvenEqualsPrimeAdd(even: Int): Boolean {
    for (j in 1..even - 1) {
        //如果是素数
        if (j.isPrimeNumber()) {
            if ((even - j).isPrimeNumber()) {
                return true
            }
        }
    }
    return false
}

//Int扩展函数，判断一个数是否为素数
fun Int.isPrimeNumber(): Boolean {
    val sqlt = Math.sqrt(this.toDouble()).toInt()
    for (i in 2..sqlt) {
        if (this % i == 0) {
            return false
        }
    }
    return true
}
```

输入结果：

```
2到10000的偶数都满足等于两个素数之和
```



