【程序 46】 题目：两个字符串连接程序。

用 Java 实现：

```
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        boolean scMark = false;
        for (int i = 0; i < 7; i++) {
            scMark = false;
            do {
                if (scMark) {
                    System.out.println("输入错误，请重新输入一个1--50之间的整数");
                } else {
                    System.out.println("请输入一个1--50之间的整数：");
                }
                temp = sc.nextInt();
                scMark = true;

            } while (temp < 1 || temp > 50);
            for (int k = 0; k < temp; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
```

用 Kotlin 实现：

    fun main(args: Array<String>) {
        val s = Scanner(System.`in`)
        var temp = 0;
        var scMark = false
        for (i in 1..7){
            scMark = false
            do {
                if (scMark) {
                    println("输入错误，请重新输入一个1--50之间的整数")
                } else {
                    println("请输入一个1--50之间的整数：")
                }
                temp = s.nextInt()
                scMark = true
            } while (temp !in 1..50)
            for (k in 1..temp) {
                print("*")
            }
            println()
        }
        println("输出结束")
    }







