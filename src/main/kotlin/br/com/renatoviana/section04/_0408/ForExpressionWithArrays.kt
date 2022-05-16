package br.com.renatoviana.section04._0408


fun main() {

    var index = 0
    for (item in 10.rangeTo(20).step(2)) {
        println("${++index} ) $item, ")
    }

    println()

    for ((i, item) in 10.rangeTo(20).step(2).withIndex()) {
        println("${i + 1} ) $item, ")
    }

    println()

    val myArray = arrayOf(10, 20, 30, 30, 50)
    for (item in myArray.indices) {
        println("At index $item is ${myArray[item]}")
    }
}