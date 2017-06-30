【程序 10】 题目：一球从 100 米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第 10 次落地时，共经过多少米？第 10 次反弹多高？



用 Java 实现：

```
public static void main(String[] args) {
    getHeight(100, 10);
}

public static void getHeight(double height, int count) {
    if (count < 0 || height < 0) {
        throw new IllegalArgumentException("请输入正确的数值");
    }
    double sum = 0;
    for (int i = 0; i < count; i++) {
        sum += height;
        height = height / 2;
    }
    System.out.println("共经过" + sum + "米。第" + count + "次反弹" + height + "米。");
}
```

用 Kotlin 实现

```
fun main(args: Array<String>) {
    getHeight(100.0, 10);
}

fun getHeight(height: Double,count:Int) {
    if (count < 0 || height < 0) {
        throw IllegalArgumentException("请输入正确的数值")
    }
    var height = height
    var sum = 0.0
    for (i in 1..count) {
        sum += height
        height = height / 2
    }
    println("共经过 $sum 米。第 $count 次反弹 $height 米")
}
```



