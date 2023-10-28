package uni.course.kt.task2

class Complex(private val coordinates: ArrayList<Double>) {
    fun sumCoordinates(): Double {
        return coordinates.sum()
    }

    fun productCoordinates(): Double {
        return coordinates.reduce { a, b -> a * b }
    }
}

fun main() {
    // println("N = " + ((1441 + 2) % 65 + 1)) // N = 14 (номер варианта)
    val list = ArrayList<Double>()
    val n = 5
    for (i in 0 until n) {
        list.add(1 + Math.random() * 10)
        //list.add(0, 1.0); // console numbers -> 5.0 and 1.0
    }
    val complex = Complex(list)
    println(complex.sumCoordinates())
    println(complex.productCoordinates())
}