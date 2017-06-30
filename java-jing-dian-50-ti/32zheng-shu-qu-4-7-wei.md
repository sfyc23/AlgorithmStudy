【程序 32】 题目：取一个整数 a 从右端开始的 4～7 位。

这个也没啥好说的，将long换成String,然后剪断

用 Java 实现：

```
public static void main(String[] args) {

    long number = 123456789;
    String ss = String.valueOf(number);
    int length = ss.length();
    if (length < 7) {
        System.out.println("长度少于7位");
        return;
    }
    ss = ss.substring(3, 7);
    System.out.println(ss);

}
```



用 Kotlin 实现：

```
fun main(args: Array<String>) {
    val number: Long = 123456789
    var ss = number.toString()
    val length = ss.length
    if (length < 7) {
        println("长度少于7位")
        return
    }
    ss = ss.substring(3, 7)
    println(ss)
}
```

输入结果：

```
4567
```



