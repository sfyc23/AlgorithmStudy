【程序 15】 题目：输入三个整数 x，y，z，请把这三个数由小到大输出。

程序分析：我们想办法把最小的数放到 x 上，先将 x 与 y 进行比较，如果 x&gt; y 则将 x 与 y 的值进行交换，然后再用 x 与 z 进行比较，如果 x&gt; z 则将 x 与 z 的值进行交换，这样能使 x 最小。

或者使用 Array.sort\(\) 进行排序，Array.toString 输出。

用 Java 实现：

```
public static void main(String[] args) {
//    sort(6, 4, 3);
    arraySort(6, 4, 3);
}

/**
 * 脑残性排序并输出
 */
public static void sort(int x, int y, int z) {
    int temp = 0;
    if (x > y) {
        temp = x;
        x = y;
        y = temp;
    }

    if (x > z) {
        temp = x;
        x = z;
        z = temp;
    }

    if (y > z) {
        temp = y;
        y = z;
        z = temp;
    }
    System.out.println("x = " + x + ", y = " + y + " , z = " + z);
}

/**
 * 使用Array.sort();并用Array.toString()输出
 */
public static void arraySort(int x, int y, int z) {
    Integer[] is = new Integer[]{x, y, z};
    Arrays.sort(is);
    System.out.println(Arrays.toString(is));
}
```

用 Kotlin 实现：

```
fun main(args: Array<String>) {
    sort(6, 4, 3)
}

fun sort(x: Int, y: Int, z: Int) {
    var list = listOf(x, y, z)
    println(list.sorted());
}
```

输出结果：

```
[3, 4, 6]
```



