package br.com.renatoviana.section04._0406

import kotlin.math.abs

fun main() {


    val pizzasOrdered = 2

    when (pizzasOrdered) {
        0 -> println("Not hungry")
        1, 2 -> println("Hungry")
        3 -> println("Very hungry")
        else -> println("Are you sure?")
    }

    when (pizzasOrdered) {
        abs(pizzasOrdered) -> println("Ordered 0 or more pizzas")
        else -> println("Order less than 0")
    }

    when (pizzasOrdered) {
        0 -> println("Not hungry")
        in 1..3 -> println("Hungry")
        4 -> println("Very hungry")
        else -> println("Are you sure?")
    }

    when {
        pizzasOrdered <= 0 -> print("None ordered")
        pizzasOrdered % 2 == 1 -> print("Odd number ordered")
        pizzasOrdered % 2 == 0 -> print("Even number ordered")
    }
}