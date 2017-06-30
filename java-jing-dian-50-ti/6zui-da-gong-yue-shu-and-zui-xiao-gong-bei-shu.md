【程序 6】 题目：输入两个正整数 m 和 n，求其最大公约数和最小公倍数。

[最大公约数](https://zh.wikipedia.org/wiki/%E6%9C%80%E5%A4%A7%E5%85%AC%E5%9B%A0%E6%95%B8)（gcd）：指某几个整数共有约数中最大的一个。

[最小公倍数](https://zh.wikipedia.org/wiki/%E6%9C%80%E5%B0%8F%E5%85%AC%E5%80%8D%E6%95%B8)（lcm）：几个数公有的倍数叫做这几个数的公倍数，其中最小的一个公倍数，叫做这几个数的最小公倍数。

两者关系：lcm\(a,b\) = a\*b/gcd\(a,b\)

用 Java 实现：

```
    public static void main(String[] args) {
        System.out.println("Greatest Common Divisor:" + getGcdRecursion(12, 18));
        System.out.println("Least Common Multiple:" + getLcm(12, 18));
    }


    public static int getGcdRecursion(int big, int small) {
        if (big % small == 0) return small;
        return getGcdRecursion(small, big % small);
    }

    public static int getLcm(int x, int y) {
        return x * y / getGcdRecursion(x, y);
    }
```



用 Kotlin 实现：

```
fun main(args: Array<String>) {
    println("Least Common Multiple:" + getLcm(12, 18))
    println("Greatest Common Divisor:" + getGcdRecursion(12, 18))
}

fun getGcdRecursion(big: Int, small: Int): Int {
    if (big % small == 0) return small
    return getGcdRecursion(small, big % small)
}


fun getLcm(x: Int, y: Int) = x * y / getGcdRecursion(x, y)
```



