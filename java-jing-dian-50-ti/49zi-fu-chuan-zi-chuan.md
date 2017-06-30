【程序 49】 题目：计算字符串中子串出现的次数。

和伪递归的方法实现。

用 Java 实现：

```
public static void main(String[] args) {
    String sup = "How much caramel can a canny canonball cram in a camel if a canny canonball can cram caramel in a camel?";
    String son = "ca";
    int count = containsNum(sup, son);
    System.out.println("出现的次数为：" + count);
}

public static int containsNum(String sup, String son) {
    return containsNum(sup, son, 0);
}

private static int containsNum(String sup, String son, int count) {
    if (sup.contains(son) && count < 20) {
        count++;
        int supBeginIndex = sup.indexOf(son) + son.length();
        //字符串截断,从子字符串出现的位置
        sup = sup.substring(supBeginIndex);
        return containsNum(sup, son, count);
    }
    return count;
}
```

用 Kotlin 实现：

```
fun main(args: Array<String>) {
    val sup = "How much caramel can a canny canonball cram in a camel if a canny canonball can cram caramel in a camel?"
    val son = "ca"
    val count = containsNum(sup, son)
    println("出现的次数为：" + count)
}

fun containsNum(sup: String, son: String, count: Int = 0): Int {
    var sup = sup
    var count = count
    if (sup.contains(son)) {
        count++
        val supBeginIndex = sup.indexOf(son) + son.length
        sup = sup.substring(supBeginIndex)
        return containsNum(sup, son, count)
    }
    return count
}
```

输入结果：

```
出现的次数为：10
```



