【程序 5】题目：利用条件运算符的嵌套来完成此题：学习成绩 &gt; = 90 分的同学用 A 表示，60-89 分之间的用 B 表示，60 分以下的用 C 表示。

程序分析：\(a&gt; b\)?a:b这是条件运算符的基本例子。



Java 实现

```
public static void main(String[] args) {
    List<Integer> scores = getRandomScore(20);
    for (int score : scores) {
        if (score >= 90) {
            System.out.println("score:" + score + " , grade : A");
        } else if (score > 60) {
            System.out.println("score:" + score + " , grade : B");
        } else {
            System.out.println("score:" + score + " , grade : C");
        }
    }
}

/**
 * 获取随机分数
 * @param num 数量
 * @return
 */

private static List<Integer> getRandomScore(int num) {
    List<Integer> scores = new ArrayList<>();
    Random rd = new Random();
    for (int i = 0; i < num; i++) {
        scores.add(rd.nextInt(100));
    }
    return scores;
}
```



Kotlin 实现

```
fun main(args: Array<String>) {
    var scores = getRandomList(20);
    for (score in scores) {
        when {
            score >= 90 -> println("core:$score , grade : A")
            score > 90 -> println("core:$score , grade : B")
            else -> println("core:$score , grade : C")
        }
    }
}

private fun getRandomList(count: Int = 10, range: Int = 100): List<Int> {
    val scores = ArrayList<Int>()
    val rd = Random()
    for (i in 1..count) {
        scores.add(rd.nextInt(range))
    }
    return scores
}
```



