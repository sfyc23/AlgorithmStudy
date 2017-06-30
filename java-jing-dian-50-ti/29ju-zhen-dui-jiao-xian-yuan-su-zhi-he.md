【程序 29】 题目：求一个 3\*3 矩阵对角线元素之和 。

程序分析：利用双重 for 循环控制输入二维数组，再将 a 累加后输出。

用 Java 实现：

```
public static void main(String[] args) {
    int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int sum = 0;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (i == j) {
                sum += array[i][j];
            }
        }
    }
    System.out.println(sum);
}
```

用 Kotlin 实现

```
val array = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
    var sum = 0;
    for (i in array.indices) {
        for (j in array.indices) {
            if (i == j) {
                sum += array[i][j]
            }
        }
    }
    println(sum)
}
```

输出结果为：

```
15
```



