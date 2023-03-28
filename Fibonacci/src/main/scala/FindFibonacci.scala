package com.knoldus.fibonacci

import scala.annotation.tailrec
import scala.util.{Failure, Success, Try}

class FindFibonacci {

  // Function to find the nth fibonacci number using tail recursion.
  def fibonacci(numberRange: Int): Try[Int] = {

    if (numberRange < 0) Failure(new IllegalArgumentException("NumberRange should be greater than 0"))
    else {
      @tailrec
      def loop(numberRange: Int, previous: Int, current: Int): Int = {
        if (numberRange == 0) previous
        else loop(numberRange - 1, current, previous + current)
      }
      Success(loop(numberRange, 0, 1))
    }
  }
}

