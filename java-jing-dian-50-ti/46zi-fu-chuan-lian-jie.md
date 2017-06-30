【程序 46】 题目：两个字符串连接程序。

用 Java 实现：

```
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符串:");
        String s1 = sc.nextLine();
        System.out.println("请输入一串字符串:");
        String s2 = sc.nextLine();

        String ss12 = s1 + s2;
        System.out.println("合并的字符串是 :" + "\n" + ss12);
    }
```

用 Kotlin 实现：

    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        println("请输入一串字符串:")
        val s1 = sc.nextLine()
        println("请输入一串字符串:")
        val s2 = sc.nextLine()

        val ss12 = s1 + s2
        println("合并的字符串是 :\n $ss12")
    }

输入结果：

```
请输入一串字符串:
hello
请输入一串字符串:
world
合并的字符串是 :
helloworld
```



