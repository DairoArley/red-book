package com.co.udea.modelling

import scala.annotation.tailrec

sealed trait FirstChapter {

  def fibonacci(n: Int): Int = {
    @tailrec
    def loop(cont: Int, ant: Int, act: Int) :Int = {
      if (n == cont)
        ant
      else
        loop(cont+1, act, ant+act)
    }
    loop(0, 0, 1)
  }
}
object FirstChapter extends FirstChapter
