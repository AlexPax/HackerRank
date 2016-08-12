package main.scala.Day11

import scala.collection.mutable.ListBuffer

/**
  * Created by user on 8/12/16.
  */
object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    var arr = Array.ofDim[Int](6,6)
    for(arr_i <- 0 to 6-1) {
      for(arr_j <- 0 to 6-1) {
        arr(arr_i)(arr_j) = sc.nextInt()
      }
    }



/*
    def maximumCalculatedHourglassesSum(arr:Array[Int][Int]):Int = {
//      CalculatedHourglassesSum(arr:Array[Int][Int]):Int =
      ???
    }

    def CalculatedHourglassesSum(arr:Array[Int][Int], globMax:Int, currMax:Int):Int = {
//      HourglassesSum(arr:Array[Int][Int], globMax:Int, currMax:Int):Int =
      ???
    }

    def HourglassesSum(arr:Array[Int][Int], globMax:Int, currMax:Int):Int = {
      ???
    }
*/

    def smallMass(arr:Array[Array[Int]], x:Int, y:Int) = {
      for {
        i <- 0 to 2
        j <- 0 to 2
      } yield arr(i)(j)
    }

    println(smallMass(arr,0,0).foreach(println))
  }
}