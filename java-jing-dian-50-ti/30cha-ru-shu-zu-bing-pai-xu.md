【程序 30】 题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。

程序分析：创建一个新数组，迭带数组，如此数是否大于当前值，则插入此数到当前数组的位置，插入后此元素之后的数，依次后移一个位置。

用 Java 实现：

```
public static void main(String[] args) {
    //获取一个随机数组并排序
    Integer[] numbers = getRandomIntArray(10);
    Arrays.sort(numbers);
    System.out.println("原排序数组：" + Arrays.toString(numbers));

    int insertInt = 25;
    insertMethods0(numbers, insertInt);
//        insertMethods1(numbers, insertInt);
}

/*
*创建一个新数组，将插入值与原数组进行比较插入
 */
public static void insertMethods0(Integer[] numbers, int insertInt) {
    System.out.println("插入数值：" + insertInt);

    //已插入标记
    boolean isInsertMarked = false;
    Integer[] newNumbers = new Integer[numbers.length + 1];
    for (int i = 0, length = numbers.length; i < length; i++) {
        if (!isInsertMarked) {
            if (numbers[i] < insertInt) {
                newNumbers[i] = numbers[i];
               if (i == length - 1) {
                    newNumbers[i + 1] = insertInt;
                }
            } else {
                //在此处插入
                isInsertMarked = true;
                newNumbers[i] = insertInt;
                newNumbers[i + 1] = numbers[i];
            }
        } else {
            newNumbers[i + 1] = numbers[i];
        }
    }
    System.out.println("插入后排序的数组：\t" + Arrays.toString(newNumbers));
}

public static Integer[] getRandomIntArray(int count) {
    Integer[] numbers = new Integer[count];
    Random rd = new Random();
    for (int i = 0, length = numbers.length; i < length; i++) {
        numbers[i] = rd.nextInt(100);
    }
    return numbers;
}
```

用 Kotlin 实现

```
fun main(args: Array<String>) {
    var numbers = getRandomArrayInt(10);
    numbers.sort();
    println("原排序数组：${Arrays.toString(numbers)}");

//    var numbers = intArrayOf(8,12,14)
    val insertInt = 25
    insertArraySort(numbers,insertInt);
}

/*
*创建一个新数组，将插入值与原数组进行比较插入
 */
fun insertArraySort(numbers: IntArray, insertInt: Int) {
    println("插入数值：$insertInt")

    //已插入标记
    var isInsertMarked = false
    val newNumbers = IntArray(numbers.size + 1)
    val lastIndex = numbers.lastIndex

    numbers.forEachIndexed { i, item ->
        if (!isInsertMarked) {
            //当前数值少于插入值，且不是最后一位
            if (item < insertInt ) {
                newNumbers[i] = item
                if (i == lastIndex) {
                    newNumbers[i + 1] = insertInt
                }
            } else {
                //在此处插入
                isInsertMarked = true
                newNumbers[i] = insertInt
                newNumbers[i+1] = item
            }
        } else {
            newNumbers[i+1] = item
        }
    }
    println("插入后排序的数组：${Arrays.toString(newNumbers)}" )
}

fun getRandomArrayInt(count: Int = 10): IntArray {
    val numbers = IntArray(count)
    val rd = Random()
    for (i in 0..count - 1) {
        numbers[i] = rd.nextInt(100)
    }
    return numbers
}
```

输出结果为：

```
15
```



