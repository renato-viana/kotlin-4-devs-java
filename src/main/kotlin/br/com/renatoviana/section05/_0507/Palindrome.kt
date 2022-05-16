package br.com.renatoviana.section05._0507


fun main() {
    println(isPalindrome("civic"))
}

fun isPalindrome(str: String): Boolean {
    return str == str.reversed()
}

