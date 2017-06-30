【程序 38】 题目：写一个函数，求一个字符串的长度，在 main 函数中输入字符串，并输出其长度。

用 Java 实现：

```
public static void main(String[] args) {
    if (args != null && args.length > 1) {
        String s = args[0];
        System.out.println("长度为：" + getStringLength(s));
    }
}

public static int getStringLength(String s) {
    if (s == null || "".equals(s)) {
        return 0;
    }
    return s.length();
}
```

用 Kotlin 实现：

```
fun main(args: Array<String>) {
    if (args != null && args.size > 1) {
        val s = args[0]
        println("长度为：" + getStringLength(s))
    }
}

fun getStringLength(s: String?): Int {
    if (s == null || "" == s) {
        return 0
    }
    return s.length
}
```







