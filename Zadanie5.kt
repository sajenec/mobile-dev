fun main() {
    println("Введите начало диапазона: ")
    val a: Int = readLine()!!.toInt()

    println("Введите конец диапазона: ")
    val b: Int = readLine()!!.toInt()

    println("Результат: ")
    for (n in a..b) {
        if (n % 2 == 0) {
            println(n)
        }
    }
}