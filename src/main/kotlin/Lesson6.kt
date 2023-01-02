fun main() {
    val month = 5

    when (month) {
        in 0..1 -> println("Месяц 1 - дней 31")
        in 2..2 -> println("Месяц 2 - дней 28")
        in 3..3 -> println("Месяц 3 - дней 31")
        in 4..4 -> println("Месяц 4 - дней 30")
        in 5..5 -> println("Месяц 5 - дней 31")
        in 6..6 -> println("Месяц 6 - дней 30")
        in 7..7 -> println("Месяц 7 - дней 31")
        in 8..8 -> println("Месяц 8 - дней 31")
        in 9..9 -> println("Месяц 9 - дней 30")
        in 10..10 -> println("Месяц 10 - дней 31")
        in 11..11 -> println("Месяц 11 - дней 30")
        in 12..12 -> println("Месяц 12 - дней 31")
        else -> {
            println("Неизвестно")
        }
    }


    print("Введите координаты точки и радиус круга")
    val x = readLine()?.toInt()
    val y = readLine()?.toInt()
    val R = readLine()?.toInt()

    var hypotenuse = ("x ** 2 + y ** 2")
    when {
        R == 0 -> println("Точка принадлежит кругу")
        else ->
            println("Точка не принадлежит кругу")

    }
}




