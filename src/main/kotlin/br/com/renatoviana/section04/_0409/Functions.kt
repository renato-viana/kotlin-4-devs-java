package br.com.renatoviana.section04._0409


fun main() {
    println("10 + 20 = ${myMathFunction(10, 20)}")
    println("15 + 25 = ${myMathExpressionBodyFunction(15, 25)}")
    println("15 + 35 = ${myMathExpressionBodyFunctionWithInference(15, 35)}")
    println("15 + 35 = ${myMathFunctionWithDefaults(15, 35)}")
    println("15 + 35 = ${myMathFunctionWithDefaults(15, 35, "Hello")}")
    println("Default sum = ${myMathFunctionWithDefaults(message = "Hello")}")
}

fun myMathFunction(number1: Int, number2: Int): Int {
    return number1 + number2
}

fun myMathExpressionBodyFunction(number1: Int, number2: Int): Int = number1 + number2

fun myMathExpressionBodyFunctionWithInference(number1: Int, number2: Int) = number1 + number2

fun myMathFunctionWithDefaults(number1: Int = 1, number2: Int = 6, message: String = "Hi"): Int {
    val result = number1 + number2
    println(message)
    return result
}