package br.com.renatoviana.section07._0705

data class Coordinates(var x: Int, var y: Int) {

    operator fun plus(orther: Coordinates): Coordinates {
        return Coordinates(x + orther.x, y + orther.y)
    }
}

