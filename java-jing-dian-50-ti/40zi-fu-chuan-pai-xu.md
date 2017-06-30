【程序 40】 题目：字符串排序。

用 Java 实现：

```
public static void main(String[] args) {
    String s = "redistribution";
    System.out.println("原:" + s);

    char[] ca = s.toCharArray();
    Arrays.sort(ca);
    String newS = String.valueOf(ca);
    System.out.println("排序后:" + newS);
}
```

用 Kotlin 实现：

```
fun main(args: Array<String>) {
    var s = "redistribution";
    println("原:$s")
    println("排序:${s.sort()}")
}

fun String.sort() :String {
    var ca = this.toCharArray()
    ca.sort()
    return String(ca);
}
```

输入结果：

```
原:redistribution
排序:bdeiiinorrsttu
```



