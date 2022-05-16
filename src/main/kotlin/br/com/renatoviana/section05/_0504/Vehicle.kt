package br.com.renatoviana.section05._0504

interface Vehicle {

    val automakerName: String

    fun start() {
        println("Vruuuuuuuuummmmmmmm")
    }

    fun stop() {
        println("Brake noise")
    }

    fun getKmPerLiter(): Int {
        return 17
    }

    fun getDoors(): Int
}