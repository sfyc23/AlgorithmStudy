【程序 19】 题目：打印出如下图案（菱形） \* \*\*\* \*\*\*\*\*\* \*\*\*\*\*\*\*\* \*\*\*\*\*\* \*\*\* \*

程序分析：先把图形分成两部分来看待，前四行一个规律，后三行一个规律，利用双重 for 循环，第一层控制行，第二层控制列。

前n项\(空格\) = n-1 ,\(\*\) = 2\*n-1

后n-1项 \(空格 \)= count ,\(\*\) = 2\*\(count-m\)-1



用 Java 实现：

```
public static void main(String[] args) {
    printDiamond(4);
}

public static void printDiamond(int num) {
    //前N项
    for (int i = 1; i <= num; i++) {
        int spaceTemp = i;
        while (num > spaceTemp) {
            System.out.print(" ");
            spaceTemp++;
        }

        int statTemp = 1;
        int count = 2 * i - 1;
        while (statTemp <= count) {
            System.out.print("*");
            statTemp++;
        }
        System.out.println();
    }
    
//后 N-1 项
    for (int i = 1; i < num; i++) {
        int spaceTemp = 1;
        while (spaceTemp <= i) {
            System.out.print(" ");
            spaceTemp++;
        }
        int statTemp = 2 * (num - i) - 1;
        while (statTemp > 0) {
            System.out.print("*");
            statTemp--;
        }
        System.out.println();
    }
}
```

用 Kotlin 实现：

```
fun main(args: Array<String>) {
    printDiamond(4)
}

fun printDiamond(num: Int) {
    //前 N 项
    for (i in 1..num) {
        var spaceCount = num - i;
        for (temp in 1..spaceCount){
            print(" ")
        }
        val statCount = 2 * i - 1
        for (temp in 1..statCount){
            print("*")
        }
        println()
    }
    //后 N-1 项
    for (i in 1..num - 1) {
        for (temp in 1..i){
            print(" ")
        }
        var statCount = 2 * (num - i) - 1
        for (temp in 1..statCount){
            print("*")
        }
        println()
    }
}
```

输出结果：

```
   *
  ***
 *****
*******
 *****
  ***
   *
```



