【程序 25】 题目：一个 5 位数，判断它是不是回文数。即 12321 是回文数，个位与万位相同，十位与千位相同。



用 Java 实现：

```
public static void main(String[] args) {
    //计算所有5位数的回文数
//        for (int i = 10000; i <= 99999; i++) {
//            if(isPalindromeNumber(i)){
//            System.out.print(i+"\t");
//            }
//        }

    isPalindromeNumber(12321);

}

public static boolean isPalindromeNumber(long natural) {
    char[] c = String.valueOf(natural).toCharArray();
    int length = c.length;

    for (int i = 0, len = length / 2; i < len; i++) {
        if (c[i] != c[length - 1 - i]) {
            return false;
        }
    }
    System.out.print(natural + " 是一个回文数");
    return true;
}
```

用 Kotlin 实现：

```
fun main(args: Array<String>) {
    var natural = 12321;
    if(natural.isPalindromeNumber()){
        println(" $natural 是一个回文数")   
    }
}

fun Int.isPalindromeNumber(): Boolean {
    val c = this.toString().toCharArray()
    val length = c.size
    for (i in 0..length / 2 - 1) {
        if (c[i] != c[length - 1 - i]) {
            return false
        }
    }
    return true
}
```

输出为：

```
12321 是一个回文数
```



