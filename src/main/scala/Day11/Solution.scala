package main.scala.Day11
/**
  * Created by user on 8/12/16.
  */
object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val arr = Array.ofDim[Int](6,6)
    for(arr_i <- 0 to 6-1) {
      for(arr_j <- 0 to 6-1) {
        arr(arr_i)(arr_j) = sc.nextInt()
      }
    }

    def smallMass(arr:Array[Array[Int]], x:Int, y:Int) = {
      for {
        i <- x to x+2
        j <- y to y+2
      } yield arr(i)(j)
    }j

    def sumOfSmallMass(arr: Array[Array[Int]]): Int = {
      var maxSum = -999999999
      for {
        i <- 0 to 3
        j <- 0 to 3
      } {
        val num = smallMass(arr, i, j).toList.zipWithIndex.filter(_._2 != 5).filter(_._2 != 3).map(_._1).sum
        if (num > maxSum) maxSum = num
      }
      maxSum
    }

    println(sumOfSmallMass(arr))
  }
}