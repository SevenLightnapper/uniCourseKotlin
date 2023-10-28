package uni.course.kt.task1

fun main(args: Array<String>) {
    println("N = " + ((1441 + 2) % 65 + 1)) // N = 14

    println("Найти все двузначные числа, сумма квадратов цифр которых делится на 17.")

    for (i in 10..99) {
        var s = 0 // сумма цифр
        var d = i % 10 // младшая цифра
        s += d * d
        d = i / 10 // старшая цифра
        s += d * d

        if (s % 17 == 0)
            println(i)
    }

}