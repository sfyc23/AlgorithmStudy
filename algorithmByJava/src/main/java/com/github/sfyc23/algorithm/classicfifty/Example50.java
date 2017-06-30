package com.github.sfyc23.algorithm.classicfifty;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Author :leilei on 2017/6/28 12:39
 * 【程序 50】 题目：有 5 个学生，每个学生有 3 门课的成绩，从键盘输入以上数据（包括学生号，姓名，三门课成绩），计算出平均成绩，况原有的数据和计算出的平均分数存放在磁盘文件"stud "中。
 */
public class Example50 {
    public static void main(String[] args) {
        avgandGrade();
    }

    private static void avgandGrade() {

//        //键盘输入
//        Scanner sc = new Scanner(System.in);
//        List<Transcripts> transcriptsList = new ArrayList<>();
//        Transcripts tran = null;
//        for (int i = 0; i < 5; i++) {
//            tran = new Transcripts();
//            System.out.print("请输入第" + i + "个学生的学号：");
//            tran.no = sc.nextLine();
//
//            System.out.print("请输入第" + i + "个学生的姓名：");
//            tran.name = sc.nextLine();
//
//            System.out.print("请输入该学生的语文成绩：");
//            tran.score1 = Integer.valueOf(sc.nextLine());
//
//            System.out.print("请输入该学生的数学成绩：");
//            tran.score2 = Integer.valueOf(sc.nextLine());
//
//            System.out.print("请输入该学生的英语成绩：");
//            tran.score3 = Integer.valueOf(sc.nextLine());
//
//            System.out.println("\n");
//        }

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


}
