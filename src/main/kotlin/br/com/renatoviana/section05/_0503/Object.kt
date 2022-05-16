package br.com.renatoviana.section05._0503

fun main() {

    val location1 = object {
        var xCoordinate = 200
        var yCoordinate = 400
    }

    val location = object {
        var xCoordinate = 200
        var yCoordinate = 600

        fun printIt() {
            println("Coordinates = ($xCoordinate, $yCoordinate)")
        }
    }

    println("Coordinates = (${location1.xCoordinate}, ${location1.yCoordinate})")
    location.printIt()

    location.xCoordinate = 250
    location.yCoordinate = 450
    location.printIt()

    val temperature = MySingleton.getLasTemperatures()
    print("Last temperature measured = $temperature degress!")
}

object MySingleton {
    var temperatures = arrayOf(18, 22, 26)
    fun getLasTemperatures() = temperatures.last()
}