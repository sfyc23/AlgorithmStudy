【程序 34】 题目：输入 3  个数 a，b，c，按大小顺序输出。



用 Java 实现：

```
public static void main(String[] args) {
//        Integer[] numbers = getRandomArrayInt(3);
    Integer[] numbers = new Integer[]{5, 8, 4};
    System.out.println("排序前：" + Arrays.toString(numbers));
    //自带函数倒排序
    Arrays.sort(numbers, Collections.reverseOrder());
    System.out.println("按大小顺序：" + Arrays.toString(numbers));
}
```

用 Kotlin 实现：

```
fun main(args: Array<String>) {
//    var numbers = getRandomArrayInt(3)
    val numbers = arrayOf(5, 8, 4)
    println("排序前:${Arrays.toString(numbers)}")
    numbers.sortDescending()
    println("按大小顺序:${Arrays.toString(numbers)}")
}
```

输入结果：

```
排序前：[5, 8, 4]
按大小顺序：[8, 5, 4]
```



