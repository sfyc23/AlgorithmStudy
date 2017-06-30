【程序 31】 题目：将一个数组逆序输出。

用 Java 实现：

```
public static void main(String[] args) {
//        int[] numbers = getRandomArrayInt(10);
    Integer[] numbers = new Integer[]{1, 5, 3, 2, 9};
    System.out.println("当前" + Arrays.toString(numbers));

    //遍迭数组
    System.out.print("输出：\t");
    for (int i = numbers.length - 1; i >= 0; i--) {
        System.out.print(numbers[i] + "\t");
    }
    System.out.println();

}
```



用 Kotlin 实现：

```
fun main(args: Array<String>) {
//    var numbers = getRandomArrayInt()
    val numbers = arrayOf(1, 5, 3, 2, 9)
    println("正序：${Arrays.toString(numbers)}")

    //方法1：遍迭数组
    print("倒序：\t")
    for (i in numbers.lastIndex downTo 0){
        print("${numbers[i]} \t")
    }
    println()

    //方法2：反转数组
    numbers.reverse()
    println("倒序：${Arrays.toString(numbers)}")

}
```

输入结果：

```
当前[1, 5, 3, 2, 9]
输出：	9	2	3	5	1	
```



