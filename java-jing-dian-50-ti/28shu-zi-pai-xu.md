【程序 28】 题目：对 10 个数进行排序。

这个题，怎么说呢，可大可小，不过还是从小的做吧。

用 Java 实现：

```
public static void main(String[] args) {

  int[] numbers = getRandomInt();
  System.out.println("原数组：" + Arrays.toString(numbers));
  
  Arrays.sort(numbers);
  System.out.println("排序后：" + Arrays.toString(numbers));
//        bubbleSort(numbers);//冒泡排序
}
```

用 Kotlin 实现：

```
fun main(args: Array<String>) {
    var listAdd = getRandomList();
    println("原：$listAdd")

    var newList = listAdd.sorted()
    println("排序后：$newList")
}

fun getRandomList(count: Int = 10): List<Int> {
    val list = mutableListOf<Int>()
    val rd = Random()
    for (i in 0..count - 1) {
        list.add(rd.nextInt(100))
    }
    return list
}
```

输出结果：

```
原数组：[58, 18, 25, 42, 98, 67, 12, 19, 60, 34]
排序后：[12, 18, 19, 25, 34, 42, 58, 60, 67, 98]
```



