【程序 35】 题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。

用 Java 实现：

```
public static void main(String[] args) {
//        int[] numbers = getRandomArrayInt(10);
    int[] numbers = new int[]{1, 2, 5, 3, 4};
    System.out.println("原数组：" + Arrays.toString(numbers));

    int max = numbers[0];
    int min = numbers[0];
    int maxIndex = 0;
    int minIndex = 0;

    int temp = 0;
    //得到数组的最大值，最小值所在位置
    for (int i = 0, length = numbers.length; i < length; i++) {
        temp = numbers[i];
        if (max < temp) {
            max = temp;
            maxIndex = i;
        }
        if (min > temp) {
            min = temp;
            minIndex = i;
        }
    }
    replace(numbers, maxIndex, 0);
    //如果最小值是第一位，则已经最大值替换成最大值所在的位置
    if (minIndex != 0) {
        replace(numbers, minIndex, numbers.length - 1);
    } else {
        replace(numbers, maxIndex, numbers.length - 1);
    }
}
/**
 * 互换数组的位置
 */
public static void replace(int[] numbers, int p1, int p2) {
    int temp = numbers[p1];
    numbers[p1] = numbers[p2];
    numbers[p2] = temp;
}
```

用 Kotlin 实现：

```
public fun IntArray.replace(n1: Int?, n2: Int?) {
    if (n1 == null || n2 == null) {
        return
    }
    if (n1 !in indices) {
        return
    }
    if (n2 !in indices) {
        return
    }
    if (n1 == n2) {
        return
    }
    var temp = 0
    temp = this[n1]
    this[n1] = this[n2]
    this[n2] = temp
}


public fun IntArray.maxIndexed(): Int? {
    if (isEmpty()) return null
    var max = this[0]
    var maxIndex = 0
    for (i in indices) {
        val e = this[i]
        if (max < e) {
            max = e
            maxIndex = i;
        }
    }
    return maxIndex
}

public fun IntArray.minIndexed(): Int? {
    if (isEmpty()) return null
    var min = this[0]
    var minIndex = 0;
    for (i in indices) {
        val e = this[i]
        if (min > e) {
            min = e
            minIndex = i;
        }
    }
    return minIndex
}
```

用上述方法，并不是很优，是另一种尝试。

输入结果：

```
原数组：[1, 2, 5, 3, 4]
互换后：[5, 2, 4, 3, 1]
```



