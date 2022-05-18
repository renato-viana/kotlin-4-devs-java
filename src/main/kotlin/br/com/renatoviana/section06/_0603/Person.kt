package br.com.renatoviana.section06._0603

class Person internal constructor(var firstName: String, var lastName: String) {

    var age: Int = 33

    init {
        println("Created person named $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String):
            this(firstName, lastName)
}
