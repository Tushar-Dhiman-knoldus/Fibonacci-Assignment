package com.knoldus.fibonacci
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers._

import scala.util.{Failure, Success}

class FibonacciSpec extends AnyFlatSpec {

  val FindFibonacciObject = new FindFibonacci()

  "The FindFibonacci class" should "return 0 for input 0" in {
    val result = FindFibonacciObject.fibonacci(0)
    result shouldEqual Success(0)
  }

  it should "return 1 for input 1" in {
    val result = FindFibonacciObject.fibonacci(1)
    result shouldEqual Success(1)
  }

  it should "return 1 for input 2" in {
    val result = FindFibonacciObject.fibonacci(10)
    result shouldEqual Success(55)
  }

  it should "return a Failure for negative input" in {
    val result = FindFibonacciObject.fibonacci(-1)
    result shouldBe a [Failure[_]]
  }
}

