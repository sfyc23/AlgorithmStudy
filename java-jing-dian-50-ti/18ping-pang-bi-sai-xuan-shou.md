【程序 18】 题目：两个乒乓球队进行比赛，各出三人。甲队为 a，b，c 三人，乙队为 x，y，z 三人。已抽签决定比赛名单。有人向队员打听比赛的名单。a 说他不和 x 比，c 说他不和 x，z 比，请编程序找出三队赛手的名单。

用 Java 实现：

```
 public static void main(String[] args) {
        
        String[] s = {"x", "y", "z"};
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                for (int k = 0; k < s.length; k++) {
                    String a = s[i];
                    String b = s[j];
                    String c = s[k];
                    //a,b,c互不相等，a不同于x,C不同于y,z
                    if ((!a.equals(b)) && (!b.equals(c)) && (!a.equals(c)) &&
                            (!"x".equals(a)) && (!"x".equals(c)) && (!"z".equals(c))) {
                        System.out.println("比赛名单如下：");
                        System.out.println("a  VS  " + a);
                        System.out.println("b  VS  " + b);
                        System.out.println("c  VS  " + c);
                    }
                }
            }
        }
    }
```

用 kotlin 实现：

```
fun main(args: Array<String>) {
    val s = arrayOf("x", "y", "z")
    s.forEach { a ->
        s.forEach { b ->
            s.forEach { c ->
                if (a != b && b != c && a != c &&
                        "x" != a && "x" != c && "z" != c) {
                    println("比赛名单如下：")
                    println("a  VS  " + a)
                    println("b  VS  " + b)
                    println("c  VS  " + c)
                }
            }
        }
    }
}
```



输出结束为：

```
比赛名单如下：
a  VS  z
b  VS  x
c  VS  y
```



