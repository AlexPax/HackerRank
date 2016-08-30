package main.scala.Day20

/**
  * Created by user on 8/30/16.
  */
object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val n = sc.nextInt()
    val a = new Array[Int](n)
    for(a_i <- 0 until n) {
      a(a_i) = sc.nextInt()
    }

    def bubbleSort(arr: List[Int]): List[Int] = {

    }

    println(bubbleSort(a.toList))
  }
}
