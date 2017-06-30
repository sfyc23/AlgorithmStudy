【程序 50】 题目：有 5 个学生，每个学生有 3 门课的成绩，从键盘输入以上数据（包括学生号，姓名，三门课成绩），计算出平均成绩，况原有的数据和计算出的平均分数存放在磁盘文件"stud "中。



用 Java 实现：

```
public static void main(String[] args) {
    avgandGrade();
}

private static void avgandGrade() {

    //键盘输入
/*     Scanner sc = new Scanner(System.in);
    List<Transcripts> transcriptsList = new ArrayList<>();
    Transcripts tran = null;
    for (int i = 0; i < 5; i++) {
        tran = new Transcripts();
        System.out.print("请输入第" + i + "个学生的学号：");
        tran.no = sc.nextLine();

        System.out.print("请输入第" + i + "个学生的姓名：");
        tran.name = sc.nextLine();

        System.out.print("请输入该学生的语文成绩：");
        tran.score1 = Integer.valueOf(sc.nextLine());

        System.out.print("请输入该学生的数学成绩：");
        tran.score2 = Integer.valueOf(sc.nextLine());

        System.out.print("请输入该学生的英语成绩：");
        tran.score3 = Integer.valueOf(sc.nextLine());

        System.out.println("\n");
    }*/

    //假数据
    List<Transcripts> transcriptsList = getTranscriptsList();
    // 计算平均分
    for (Transcripts rs : transcriptsList) {
        rs.calcAverageScore();
    }

    // 以下写磁盘文件
    try {
        File f = new File("f:\\stud");
        if (f.exists()) {
            System.out.println("文件存在");
        } else {
            System.out.println("文件不存在，正在创建文件");
            f.createNewFile();// 不存在则创建
        }
        BufferedWriter output = new BufferedWriter(new FileWriter(f));
        for (Transcripts rs : transcriptsList) {
            output.write(rs.toString()+"\n");
        }
        output.close();
        System.out.println("数据已写入c盘文件stud中！");
    } catch (Exception e) {
        e.printStackTrace();
    }

}

private static List<Transcripts> getTranscriptsList() {
    List<Transcripts> list = new ArrayList<>();
    Transcripts tran = null;
    for (int i = 0; i < 5; i++) {
        tran = new Transcripts();
        tran.no = "no" + i;
        tran.name = "name" + i;
        tran.score1 = 7 * i + 2;
        tran.score2 = 4 * i + 3;
        tran.score3 = 5 * i + 1;
        list.add(tran);
    }
    return list;
}

//成绩单
public static class Transcripts {
    public String no;
    public String name;
    public Integer score1;
    public Integer score2;
    public Integer score3;
    public Integer averageScore;

    @Override
    public String toString() {
        return "Transcripts{" +
                "\t学号: " + no +
                ", \t姓名 : " + name +
                ", \t语文 :" + score1 +
                ", \t数学 : " + score2 +
                ", \t英语 : " + score3 +
                ", \t平均成绩 : " + averageScore +
                '}';
    }

    //计算平均分
    public void calcAverageScore() {
        averageScore = (score1 + score2 + score3) / 3;
    }
}

```

用 Kotlin 实现：

    rivate fun avgandGrade() {
        //键盘输入
    //    val sc = Scanner(System.`in`)
    //    val transcriptsList = ArrayList<Transcripts>()
    //    var tran: Transcripts? = null
    //    for (i in 0..4) {
    //        tran = Transcripts()
    //        print("请输入第" + i + "个学生的学号：")
    //        tran.no = sc.nextLine()
    //
    //        print("请输入第" + i + "个学生的姓名：")
    //        tran.name = sc.nextLine()
    //
    //        print("请输入该学生的语文成绩：")
    //        tran.score1 = Integer.valueOf(sc.nextLine())
    //
    //        print("请输入该学生的数学成绩：")
    //        tran.score2 = Integer.valueOf(sc.nextLine())
    //
    //        print("请输入该学生的英语成绩：")
    //        tran.score3 = Integer.valueOf(sc.nextLine())
    //
    //        println("\n")
    //    }

        //假数据
        val transcriptsList = getTranscriptsList()
        // 计算平均分
        for (rs in transcriptsList) {
            rs.calcAverageScore()
        }

        // 以下写磁盘文件
        try {
            val f = File("f:\\stud")
            if (f.exists()) {
                println("文件存在")
            } else {
                println("文件不存在，正在创建文件")
                f.createNewFile()// 不存在则创建
            }
            val output = BufferedWriter(FileWriter(f))
            for (rs in transcriptsList) {
                output.write(rs.toString() + "\n")
            }
            output.close()
            println("数据已写入c盘文件stud中！")
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    private fun getTranscriptsList(): List<Transcripts> {
        val list = ArrayList<Transcripts>()
        var tran: Transcripts? = null
        for (i in 0..4) {
            tran = Transcripts()
            tran.no = "no" + i
            tran.name = "name" + i
            tran.score1 = 7 * i + 2
            tran.score2 = 4 * i + 3
            tran.score3 = 5 * i + 1
            list.add(tran)
        }
        return list
    }

    //成绩单
    class Transcripts {
        var no: String? = null
        var name: String? = null
        var score1: Int? = null
        var score2: Int? = null
        var score3: Int? = null
        var averageScore: Int? = null

        override fun toString(): String {
            return "Transcripts{" +
                    "\t学号: " + no +
                    ", \t姓名 : " + name +
                    ", \t语文 :" + score1 +
                    ", \t数学 : " + score2 +
                    ", \t英语 : " + score3 +
                    ", \t平均成绩 : " + averageScore +
                    '}'
        }

        //计算平均分
        fun calcAverageScore() {
            averageScore = (score1!! + score2!! + score3!!) / 3
        }
    }

输入结果：

```
文件存在
数据已写入c盘文件stud中！
```

文件中数据为：

```
Transcripts{	学号: no0, 	姓名 : name0, 	语文 :2, 	数学 : 3, 	英语 : 1, 	平均成绩 : 2}
Transcripts{	学号: no1, 	姓名 : name1, 	语文 :9, 	数学 : 7, 	英语 : 6, 	平均成绩 : 7}
Transcripts{	学号: no2, 	姓名 : name2, 	语文 :16, 	数学 : 11, 	英语 : 11, 	平均成绩 : 12}
Transcripts{	学号: no3, 	姓名 : name3, 	语文 :23, 	数学 : 15, 	英语 : 16, 	平均成绩 : 18}
Transcripts{	学号: no4, 	姓名 : name4, 	语文 :30, 	数学 : 19, 	英语 : 21, 	平均成绩 : 23}
```



