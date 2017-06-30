【程序 4】 题目：将一个正整数分解质因数。例如：输入 90，打印出 90=2\*3\*3\*5。

程序分析：对 n 进行分解质因数，应先找到一个最小的质数 k，然后按下述步骤完成：

1. 如果这个质数恰等于 n，则说明分解质因数的过程已经结束，打印出即可。
2. 如果 n &lt;&gt; k，但 n 能被 k 整除，则应打印出 k 的值，并用 n 除以 k 的商,作为新的正整数 n，重复执行第一步。
3. 如果 n 不能被 k 整除，则用 k+1 作为 k 的值,重复执行第一步。

Java 实现

```
public static void main(String[] args) {
    primeIteration(75);
    primeRecursion(75, true);
}

/**
 * 用递归的方法做处理
 *
 * @param natural 任意一个整数
 * @param isFirst 用于输出
 */
public static void primeRecursion(int natural, boolean isFirst) {

    if (isFirst) {
        System.out.print(natural + " = ");
    }
    for (int i = 2, length = (int) Math.sqrt(natural); i <= length; i++) {
        if (natural % i == 0) {
            System.out.print(i + " * ");
            primeRecursion(natural / i, false);
            return;
        }
    }
    //最后一行。
    if (isFirst) {
        System.out.println(natural + "为质数");
    } else {
        System.out.println(natural);
    }

}


/**
 * 用迭带的方法做处理
 *
 * @param natural
 */
public static void primeIteration(int natural) {
    List<Integer> primes = new ArrayList<>();
    int temp = natural;

    for (int i = 2, length = (int) Math.sqrt(temp); i <= length; i++) {
        while (temp != i) {
            if (temp % i != 0) {
                break;//不能整除肯定不是因数，能够整除在这里一定是质数。因为所有的2，3,5,7
                //都被除完之后。剩下的因数只能是奇数，且是质数。
            }
            primes.add(i);
            temp = temp / i;
        }
    }
    primes.add(temp);

    //用于打印 90=2*3*3*5。
    if (primes.isEmpty() || primes.size() <= 1) {
        System.out.println(natural + " 为质数");
        return;
    }

    System.out.print(natural + " = ");
    for (int i = 0, lentgh = primes.size(); i < lentgh; i++) {
        System.out.print(primes.get(i));
        if (i != lentgh - 1) {
            System.out.print(" * ");
        }
    }
    System.out.println();
}
```

Kotlin 实现

```
fun main(args: Array<String>) {
    primeRecursion(75)
    primeIteration(75)
}

/**
 * 用递归的方法做处理
 * @param natural
 * @param isFirst 用于打印
 */
fun primeRecursion(natural: Int, isFirst: Boolean = true) {

    if (isFirst) {
        print("$natural = ")
    }
    val sqrt = Math.sqrt(natural.toDouble()).toInt()
    for (i in 2..sqrt) {
        if (natural % i == 0) {
            print("$i * ")
            primeRecursion(natural / i,false)
            return
        }
    }

    //最后一行。
    if (isFirst) {
        println("$natural 为质数")
    } else {
        println(natural)
    }
}

/**
 * 用迭代的方法做处理
 * @param natural
 */
fun primeIteration(natural: Int) {
    var primes = ArrayList<Int>()
    var temp = natural

    val sqrt = Math.sqrt(temp.toDouble()).toInt()
    for (i in 2..sqrt) {
        while (temp != i) {
            if (temp % i != 0) {
                break//不能整除肯定不是因数，能够整除在这里一定是质数。因为所有的2，3,5,7
                //都被除完之后。剩下的因数只能是奇数，且是质数。
            }
            primes.add(i)
            temp = temp / i
        }
    }
    primes.add(temp)

    //输出
    //用于打印 90=2*3*3*5。
    if (primes.isEmpty() || primes.size <= 1) {
        println("$natural 为质数")
        return
    }

    print("$natural = ")
    for (i in primes.indices) {
        print(primes[i])
        if (i != primes.lastIndex) {
            print(" * ")
        }
    }
    println()
}
```

输出结果：

```
75 = 3 * 5 * 5
75 = 3 * 5 * 5
```



