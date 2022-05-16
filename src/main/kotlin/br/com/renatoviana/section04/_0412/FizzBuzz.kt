package br.com.renatoviana.section04._0412

fun main() {
    print(fizzBuzz(16))
}

fun fizzBuzzFor(size: Int): List<String> {
    val myArray = mutableListOf<String>()
    for (number in 1..size) {
        val item = when {
            number % 3 == 0 && number % 5 == 0 -> "FizzBuzz"
            number % 3 == 0 -> "Fizz"
            number % 5 == 0 -> "Buzz"
            else -> number.toString()
        }
        myArray.add(item)
    }
    return myArray
}

fun fizzBuzz(size: Int): List<String> {
    val myArray = mutableListOf<String>()
    (1..size).forEach {
        val item = when {
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it.toString()
        }
        myArray.add(item)
    }
    return myArray
}