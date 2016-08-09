package main.scala.Day10

/**
  * Created by Haha on 09.08.2016.
  */

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val n = sc.nextInt()

    def f(n:Int):List[Int] = {
      val arr:List[Int] = Nil
      f_(n, arr)
    }

    def f_(n:Int, arr:List[Int]):List[Int] = n match {
      case 0 => arr
      case _ => f_(n/2, arr.::(n%2))
    }

    println(f(n) mkString "")
    // todo

  }
}

