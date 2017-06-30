【程序 39】 题目：编写一个函数，输入 n 为偶数时，调用函数求 1/2+1/4+...+1/n，当输入 n 为奇数时，调用函数1/1+1/3+...+1/n。

用 Java 实现：

```
public static void main(String[] args) {
    int natural = 6;
    if (natural < 0) {
        throw new IllegalArgumentException("自然数必须大于0");
    }
    double sum = 0.0;
    double i = isEven(natural) ? 2.0 : 1.0;
    for (; i <= natural; i += 2) {
        sum += 1.0 / i;
    }
    System.out.println("因数为：" + natural + ",sum = " + sum);
}

//判断是不是偶数
public static boolean isEven(int natural) {
    if (natural % 2 == 0) {
        return true;
    }
    return false;
}
```

用 Kotlin 实现：

```
fun main(args: Array<String>) {
    val natural = 7
    if (natural < 0) {
        throw IllegalArgumentException("自然数必须大于0")
    }
    var sum = 0.0
    var i = if (natural.isEven()) 2.0 else 1.0

    while (i <= natural) {
        sum += 1.0 / i
        i += 2.0
    }
    println("因数为：$natural,sum = $sum")
}

//int 扩展函数
fun Int.isEven() = if (this % 2 == 0) true else false
```

输入结果：

```
因数为：7,sum = 1.676190476190476
```



