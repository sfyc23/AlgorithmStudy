【程序 37】 题目：有 n 个人围成一圈，顺序排号。从第一个人开始报数（从 1 到 3 报数），凡报到 3 的人退出圈子，问最后留下的是原来第几号的那位。

这个是 [**约瑟夫环**](https://zh.wikipedia.org/wiki/%E7%BA%A6%E7%91%9F%E5%A4%AB%E6%96%AF%E9%97%AE%E9%A2%98) 问题。

可以用两种方式实现。

用 Java 实现：

```
public static void main(String[] args) {
    int peopleNum = 8;
    int checkIndex = 3;

    int liveIndex = josephusIteration(peopleNum, checkIndex);
//        int liveIndex = josephusRecursion(peopleNum, checkIndex);
    System.out.println(peopleNum + "人围圈，报数为： " + checkIndex + " , 最后存活的人的位置是： " + liveIndex);
}
/*
迭代删除
 */
public static int josephusIteration(int peopleNum, int node) {
    if (peopleNum <= 0 || node <= 0) {
        throw new IllegalArgumentException("人数，报名必须大于0");
    }
    List<Integer> list = new ArrayList<>();
    for (int i = 1; i <= peopleNum; i++) {
        list.add(i);
    }
    // 每次计数开始的索引
    int romoveIndex = 0;
    //循环杀人
    while (true) {
        romoveIndex = (romoveIndex + node - 1) % list.size();
        list.remove(romoveIndex);
        //只有最后一位时，跳出
        if (list.size() == 1) {
            return list.get(0);
        }
    }
}

/**
 * 递推公式:
 * (1)、f[1]=0;
 * (2)、f[i]=(f[i-1]+m)%i; (i>1)
 */
public static int josephusRecursion(int peopleNum, int node) {
    if (peopleNum <= 0 || node <= 0) {
        throw new IllegalArgumentException("人数，报名必须大于0");
    }
    int s = 0;
    for (int i = 2; i <= peopleNum; i++) {
        s = (s + node) % i;
    }
    return s + 1;
}
```

用 Kotlin 实现：

```
fun main(args: Array<String>) {
    val peopleNum = 8
    val checkIndex = 3

    val liveIndex = josephusIteration(peopleNum, checkIndex)
//        val liveIndex = josephusRecursion(peopleNum, checkIndex);
    println( "$peopleNum 人围圈，报数为： $checkIndex , 最后存活的人的位置是： $liveIndex" )
}

fun josephusIteration(peopleNum: Int, node: Int): Int {
    if (peopleNum <= 0 || node <= 0) {
        throw IllegalArgumentException("人数，报名必须大于0") as Throwable
    }
    //初始化人数
    var numbers = ArrayList<Int>()
    for (i in 1..peopleNum) {
        numbers.add(i)
    }
    var index = 0;
    for (i in 1..peopleNum - 1) {
        index = (index + node - 1) % numbers.size
        numbers.removeAt(index)
        println(numbers)
    }
    return numbers[0];
}


/**
 * 递推公式:
 * (1)、f[1]=0;
 * (2)、f[i]=(f[i-1]+m)%i; (i>1)
 */
fun josephusRecursion(peopleNum: Int, node: Int): Int {
    if (peopleNum <= 0 || node <= 0) {
        throw IllegalArgumentException("人数，报名必须大于0") as Throwable
    }
    var s = 0
    for (i in 2..node) {
        s = (s + node) % i
    }
    return s + 1
}
```

输入结果：

```
8 人围圈，报数为： 3 , 最后存活的人的位置是： 7
```



