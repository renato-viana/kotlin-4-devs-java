package br.com.renatoviana.section06._0602

fun main() {

    val cat = Animal("Garfield", "cat", 10)
    println(cat.show())
    val dog = Animal("Kiko", "dog", 20)
    println(dog.show())

    cat.weight = 13
    println(cat.show())
}