fun main() {
    println("Введите число N: ")
    val n: Int = readLine()!!.toInt()

    val ostatok10 = n % 10
    val ostatok100 = n % 100

    val word = when {
        ostatok100 in 11..14 -> "грибов"
        ostatok10 == 1 -> "гриб"
        ostatok10 in 2..4 -> "гриба"
        else -> "грибов"
    }

    println("Я нашел $n $word")
}