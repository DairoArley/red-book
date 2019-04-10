package com.co.udea.testmodelling

import com.co.udea.modelling._
import org.scalatest.FunSuite


class TestFirstChapter extends FunSuite{
  test("Fibonacci(0)") {
    val sum = FirstChapter.fibonacci(0)
    assert(sum == 0)
  }
  test("Fibonacci(1)") {
    val sum = FirstChapter.fibonacci(1)
    assert(sum == 1)
  }
  test("Fibonacci(2)") {
    val sum = FirstChapter.fibonacci(2)
    assert(sum == 1)
  }
  test("Fibonacci(3)") {
    val sum = FirstChapter.fibonacci(3)
    assert(sum == 2)
  }
  test("Fibonacci(4)") {
    val sum = FirstChapter.fibonacci(4)
    assert(sum == 3)
  }
  test("Fibonacci(5)") {
    val sum = FirstChapter.fibonacci(5)
    assert(sum == 5)
  }
  test("Fibonacci(6)") {
    val sum = FirstChapter.fibonacci(6)
    assert(sum == 8)
  }
  test("Fibonacci(7)") {
    val sum = FirstChapter.fibonacci(7)
    assert(sum == 13)
  }
  test("Fibonacci(8)") {
    val sum = FirstChapter.fibonacci(8)
    assert(sum == 21)
  }
  test("Fibonacci(9)") {
    val sum = FirstChapter.fibonacci(9)
    assert(sum == 34)
  }
}


