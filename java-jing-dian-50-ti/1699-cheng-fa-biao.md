【程序 16】 题目：输出 9\*9 口诀。 程序分析：分行与列考虑，共 9 行 9 列，i 控制行，j 控制列。



用 Java 实现：

```
public static void main(String[] args) {
    for (int i = 1; i <= 9; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(i * j + " = " + j + " * " + i + "\t");
        }
        System.out.println();
    }
}
```



用 Kotlin 实现：

```
fun main(args: Array<String>) {
    for (i in 1..9) {
        for (j in 1..i) {
            print("${i*j} = $j * $i \t")
        }
        println()
    }
}
```



