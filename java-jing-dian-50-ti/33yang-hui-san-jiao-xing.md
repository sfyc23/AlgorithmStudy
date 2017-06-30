

【程序 33】 题目：打印出杨辉三角形（要求打印出 10 行如下图） 程序分析： 1 1 1 1 2 1 1 3 3 1 1 4 6 4 1 1 5 10 10 5 1

[杨辉三角形](https://zh.wikipedia.org/wiki/%E6%9D%A8%E8%BE%89%E4%B8%89%E8%A7%92%E5%BD%A2)：杨辉三角形第 n 层（顶层称第 0 层，第 1 行，第 n 层即第 n+1 行，此处 n 为包含 0 在内的自然数）

杨辉三角以正整数构成，数字左右对称，每行由 1 开始逐渐变大，然后变小，回到 1。

特点：第 n  行的数字个数为  n 个。

除每行最左侧与最右侧的数字为 1 以外，每个数字等于它的左上方与右上方两个数字之和。



用 Java 实现：

```
public static void main(String[] args) {
    getYanghuiTriangle(10);
}

public static void getYanghuiTriangle(int layer) {
    int triangle[][] = new int[layer][];// 创建二维数组
    // 遍历二维数组的第一层
    for (int i = 0, length = triangle.length; i < length; i++) {
        triangle[i] = new int[i + 1];// 初始化第二层数组的大小
        // 遍历第二层数组
        for (int j = 0; j <= i; j++) {
            // 将两侧的数组元素赋值为1
            if (i == 0 || j == 0 || j == i) {
                triangle[i][j] = 1;
            } else {// 其他数值通过公式计算
                triangle[i][j] = triangle[i - 1][j] + triangle[i - 1][j - 1];
            }
            System.out.print(triangle[i][j] + "\t");
        }
        System.out.println();
    }
}
```

用 Kotlin 实现：

```
fun main(args: Array<String>) {
    getYanghuiTriangle(10)
}

fun getYanghuiTriangle(layer: Int) {
    // 创建二维数组
    val triangle = Array(layer) { IntArray(layer) }
    // 遍历二维数组的第一层
    for (i in 0..layer - 1) {
        // 遍历第二层数组
        for (j in 0..i) {
            // 将两侧的数组元素赋值为1
            if (i == 0 || j == 0 || j == i) {
                triangle[i][j] = 1
            } else {// 其他数值通过公式计算
                triangle[i][j] = triangle[i - 1][j] + triangle[i - 1][j - 1]
            }
            print(triangle[i][j].toString() + "\t")
        }
        println()
    }
}
```

输入结果：

```
1	
1	1	
1	2	1	
1	3	3	1	
1	4	6	4	1	
1	5	10	10	5	1	
1	6	15	20	15	6	1	
1	7	21	35	35	21	7	1	
1	8	28	56	70	56	28	8	1	
1	9	36	84	126	126	84	36	9	1	
```





