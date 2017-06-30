程序【1】  题目：古典问题：有一对兔子，从出生后第 3 个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？ 

程序分析：兔子的规律斐波纳契数列1,1,2,3,5,8,13,2...   

\#\#\#用 Java 方法实现：

#### 用递归方式实现：

```
 /**
 * 递归实现方式
 * @param count
 * @return
 */
public static int recursively(int count) {
    if (count < 0) {
        throw new IllegalArgumentException(" the parameter is valid!");
    }
    if (count <= 2) {
        return 1;
    } else {
        return recursively(count - 1) + recursively(count - 2);
    }
}

```

### 用递归方式实现：

```
/**
 * 累加实现方式
 * @param count
 */
public static int recursive(int count) {
    if (count < 0) {
        throw new IllegalArgumentException(" the parameter is valid!");
    }
    if (count <= 2) {
        return 1;
    }
    int a = 1, b = 1, num = 0;
    for (int i = 3; i <= count; i++) {
        num = a + b;
        a = b;
        b = num;
    }
    System.out.println("第 " + count + " 个月的兔子为 " + num + " 只");
    return num;
}
```



