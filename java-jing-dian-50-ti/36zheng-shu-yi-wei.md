【程序 36】 题目：有 n 个整数，使其前面各数顺序向后移 m 个位置，最后m个数变成最前面的 m 个数。

用 Java 实现：

```
public static void main(String[] args) {
//        int[] numbers = getRandomArrayInt(10);
    Integer[] numbers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    int m = 3;
    System.out.println("原数组："+ Arrays.toString(numbers));

    Integer[] newNums = moveArray(numbers, m);
    System.out.println("移动 " + m + " 位到最前之后："+ Arrays.toString(newNums));
}

public static Integer[] moveArray(Integer[] numbers, int m) {
    if (m < 0 || m > numbers.length - 1) {// 判断移动的位置是否合法
        throw new IllegalArgumentException(" 移动位数不能大于数组个数，且不能为负数");
    }
    Integer arrayLength = numbers.length;
    Integer[] newNums = new Integer[arrayLength];
    for (int i = 0; i < arrayLength; i++) {
        if (i < m) {
            newNums[i] = numbers[arrayLength - m + i];
        } else {
            newNums[i] = numbers[i - m];
        }
    }
    return newNums;
}
```

用 Kotlin 实现：

```
fun main(args: Array<String>) {
//    val numbers = getRandomArrayInt(10)
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val m = 3;
    println("原数组：" + Arrays.toString(numbers))

    val newNums = moveArray(numbers, m)
    println("移动 ${m} 位到最前之后：${Arrays.toString(newNums)}" )
}

fun moveArray(numbers: IntArray, m: Int): IntArray {
    if (m < 0 || m > numbers.size - 1) {// 判断移动的位置是否合法
        throw IllegalArgumentException(" 移动位数不能大于数组个数，且不能为负数")
    }
    val arrayLength = numbers.size
    val newNums = IntArray(arrayLength)
    for (i in 0..arrayLength - 1) {
        if (i < m) {
            newNums[i] = numbers[arrayLength - m + i]
        } else {
            newNums[i] = numbers[i - m]
        }
    }
    return newNums
}
```

输入结果：

```
原数组：[1, 2, 3, 4, 5, 6, 7, 8, 9]
移动 3 位到最前之后：[7, 8, 9, 1, 2, 3, 4, 5, 6]
```



