package main.scala.Day10

/**
  * Created by Haha on 09.08.2016.
  */

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val n = sc.nextInt()

    def calc(n:Int):Int = {
      calc_(f(n), 0, 0)
    }

    def f(n:Int):List[Int] = {
      val arr:List[Int] = Nil
      f_(n, arr)
    }

    def f_(n:Int, arr:List[Int]):List[Int] = n match {
      case 0 => arr
      case _ => f_(n/2, n%2 :: arr)
    }

    def calc_(arr:List[Int], globMax:Int, currMax:Int):Int = arr match {
      case Nil => if (globMax < currMax) currMax else globMax       //fail detected
      case 1 :: tail => calc_(arr.tail, globMax, currMax+1)
      case 0 :: tail => calc_(arr.tail, if (globMax > currMax) globMax else currMax, 0)
    }

    println(calc(n))
  }
}

