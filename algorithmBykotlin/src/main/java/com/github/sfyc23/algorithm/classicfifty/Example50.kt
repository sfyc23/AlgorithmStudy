package com.github.sfyc23.algorithm.classicfifty

import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter
import java.util.*

/**
 * Author :leilei on 2017/6/28 12:42
 * 【程序 50】 题目：有 5 个学生，每个学生有 3 门课的成绩，从键盘输入以上数据（包括学生号，姓名，三门课成绩），计算出平均成绩，况原有的数据和计算出的平均分数存放在磁盘文件"stud "中。
 */
fun main(args: Array<String>) {

}

private fun avgandGrade() {
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