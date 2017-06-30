【程序 23】 题目：有 5 个人坐在一起，问第 5 个人多少岁？他说比第 4 个人大 2 岁。问第 4 个人岁数，他说比第 3 个人大 2 岁。问第 3 个人，又说比第 2 人大两岁。问第 2 个人，说比第 1 个人大 2 岁。最后问第 1 个人，他说是 10 岁。请问第 5 个人多大？

程序分析：利用递归的方法，递归分为回推和递推两个阶段。要想知道第 5 个人岁数，需知道第 4 人的岁数，依次类推，推到第 1 人（10岁），再往回推。

一群熊孩子

用 Java 实现：

```
public static void main(String[] args) {
    ageCalc();
}

public static void ageCalc(){
    int age = 10;
    System.out.println("第1个人的岁数为：" + age);

    age += 2;
    System.out.println("第2个人的岁数为：" + age);

    age += 2;
    System.out.println("第3个人的岁数为：" + age);

    age += 2;
    System.out.println("第4个人的岁数为：" + age);

    age += 2;
    System.out.println("第5个人的岁数为：" + age);

}
```

用 Kotlin 实现：

```
fun main(args: Array<String>) {
    ageCalc()
}

fun ageCalc() {
    var age = 10
    println("第1个人的岁数为：${age}")

    age += 2
    println("第2个人的岁数为：${age}")

    age += 2
    println("第3个人的岁数为：${age}")

    age += 2
    println("第4个人的岁数为：${age}")

    age += 2
    println("第5个人的岁数为：${age}")

}
```

输出为：

```
第1个人的岁数为：10
第2个人的岁数为：12
第3个人的岁数为：14
第4个人的岁数为：16
第5个人的岁数为：18
```



