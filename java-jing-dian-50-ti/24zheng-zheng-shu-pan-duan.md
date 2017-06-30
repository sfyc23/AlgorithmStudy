【程序 23】 【程序 24】 题目：给一个不多于 5 位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。

程序分析：当 N 转成 String，然后通过 String.length 判断长度。多于 5 位重新输入，小于 5 位则输出位数，并逆序打印

一群熊孩子

用 Java 实现：

```
public static void main(String[] args) {
    calcNatural(1235);
}

public static void calcNatural(long natural) {
    System.out.println("整数为：" + natural);
    String ns = String.valueOf(natural);
    int length = ns.length();
    if (length >= 5) {
        System.out.println("请重新输入");
        return;
    }
    System.out.println("它是 " + length + " 位数");

    for (int i = ns.length() - 1; i >= 0; i--) {
        System.out.print(ns.charAt(i) + "\t");
    }
}
```

用 Kotlin 实现：

```
fun main(args: Array<String>) {
    calcNatural(1235)
}

fun calcNatural(natural: Long) {
    println("整数为：$natural")
    val ns = natural.toString()

    val length = ns.length
    if (length >= 5) {
        println("请重新输入")
        return
    }
    println("它是 $length 位数")
    for (i in length - 1 downTo 0) {
        print(ns[i] + "\t")
    }
}
```

输出为：

```
整数为：1235
它是 4 位数
5	3	2	1	
```



