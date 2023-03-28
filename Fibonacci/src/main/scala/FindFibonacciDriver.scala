package com.knoldus.fibonacci

import scala.util.{Failure, Success}

object FindFibonacciDriver extends App{

  private val FindFibonacciObject = new FindFibonacci()
  private val result = FindFibonacciObject.fibonacci(10)

  result match {
    case Success(value) => println("The result is "+ value)
    case Failure(exception) => println(s"Error: ${exception.getMessage}")
  }

}
