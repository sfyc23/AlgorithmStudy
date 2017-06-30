【程序 12】 题目：企业发放的奖金根据利润提成。利润\(I\)低于或等于 10 万元时，奖金可提 10%；利润高于 10 万元，低于 20 万元时，低于 10 万元的部分按 10% 提成，高于 10 万元的部分，可可提成 7.5%；20 万到 40 万之间时，高于 20 万元的部分，可提成5%；40万到 60 万之间时高于 40 万元的部分，可提成 3%；60 万到100 万之间时，高于 60 万元的部分，可提成5%，高于100万元时，超过100万元的部分按 1 % 提成，从键盘输入当月利润I，求应发放奖金总数？



程序分析：请利用数轴来分界，定位。注意定义时需把奖金定义成长整型。



用 Java 实现：

```
public static void main(String[] args) {
    getMomey(250000);
}

public static double getMomey(double lirun) {
    double sum = 0.0;

    if (lirun <= 100000) {
        sum = lirun * 0.1;
    } else if (lirun <= 200000) {
        sum = 10000 + lirun * 0.075;
    } else if (lirun <= 400000) {
        sum = 17500 + lirun * 0.05;
    } else if (lirun <= 600000) {
        sum = 27500 + lirun * 0.03;
    } else if (lirun <= 1000000) {
        sum = 33500 + lirun * 0.015;
    } else {
        sum = 39500 + lirun * 0.01;
    }
    System.out.println("当月利润为：" + lirun + ",应发的奖金是:" + sum);
    return sum;
}
```

用 Kotlin 实现：

```
fun main(args: Array<String>) {
    getMomey(250000.0)
}
fun getMomey(lirun: Double): Double {
    var sum = 0.0

    if (lirun <= 100000) {
        sum = lirun * 0.1
    } else if (lirun <= 200000) {
        sum = 10000 + lirun * 0.075
    } else if (lirun <= 400000) {
        sum = 17500 + lirun * 0.05
    } else if (lirun <= 600000) {
        sum = 27500 + lirun * 0.03
    } else if (lirun <= 1000000) {
        sum = 33500 + lirun * 0.015
    } else {
        sum = 39500 + lirun * 0.01
    }
    println("当月利润为：$lirun,应发的奖金是:$sum")
    return sum
}
```



