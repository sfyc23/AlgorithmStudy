【程序 48】 题目：某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：每位数字都加上 5，然后用和除以 10 的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。

用 Java 实现：

```
public static void main(String[] args) {
    encryptPhone(1314);
}

public static void encryptPhone(int phone) {
    if (phone < 1000 || phone > 9999) {
        throw new IllegalArgumentException(" 请输入四位数");
    }
    System.out.println("原数字为：" + phone);
    Integer[] phones = new Integer[4];
    phones[0] = phone / 1000; // 取千位的数字
    phones[1] = (phone / 100) % 10; // 取百位的数字
    phones[2] = (phone / 10) % 10; // 取十位的数字
    phones[3] = phone % 10; // 取个位的数字

    //对每个数字进行加密处理
    for (int i = 0; i < 4; i++) {
        phones[i] = (phones[i] + 5) % 10;
    }

    int temp = 0;
    //数组反转,数组长度除以2
    for (int i = 0; i < 2; i++) {
        temp = phones[i];
        phones[i] = phones[3 - i];
        phones[3 - i] = temp;
    }
    System.out.print("加密数字：");
    for (Integer p : phones) {
        System.out.print(p);
    }
}
```

用 Kotlin 实现：

```
fun main(args: Array<String>) {
    encryptPhone(1314)
}

fun encryptPhone(phone: Int) {
    if (phone < 1000 || phone > 9999) {
        throw IllegalArgumentException(" 请输入四位数")
    }
    println("原数字为：" + phone)
    val phones = IntArray(4)
    phones[0] = phone / 1000 // 取千位的数字
    phones[1] = phone / 100 % 10 // 取百位的数字
    phones[2] = phone / 10 % 10 // 取十位的数字
    phones[3] = phone % 10 // 取个位的数字

    //对每个数字进行加密处理
    for (i in phones.indices) {
        phones[i] = (phones[i] + 5) % 10
    }
    phones.reverse()//反转

    print("加密数字：")
    for (p in phones) {
        print(p)
    }
}
```

输入结果：

```
原数字为：1314
加密数字：9686
```



