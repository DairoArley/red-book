package com.co.udea.modelling

import scala.annotation.tailrec

class FirstChapter {

  def fibonacci(n: Int): Int = {
    @tailrec
    def loop(sum: Int, ant: Int, act: Int) :Int = {
      if (n == act){
        sum
      }else{
        loop(ant+act, act, act+1)
      }
    }
    val sum = loop(1, 0, 1)
    println(sum)
    sum
  }

}
