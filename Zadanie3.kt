fun main() {
    println("Введите свой возраст: ")
    val age: Int = readLine()!!.toInt()

    println("Введите свой пол: ")
    val gender: String = readLine()!!

    if (age < 7) {
        println("Школьник")
    } else if (age >= 7 && age <= 22) {
        println("Учащийся")
    } else if (age >= 23 && age <= 55) {
        println("Работающий")
    } else if (age > 55 && gender == "женщина") {
        println("Пенсионер")
    } else if (age > 55 && age <= 60 && gender == "мужчина") {
        println("Работающий")
    } else if (age > 60) {
        println("Пенсионер")
    }
}