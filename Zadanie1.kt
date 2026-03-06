fun main() {
    println("Сколько стоит книга: ")
    val cost: Int = readLine()!!.toInt()

    println("Сколько денег внёс покупатель: ")
    val money: Int = readLine()!!.toInt()

    if (money == cost) {
        println("Спасибо за покупку!")
    } else if (money > cost) {
        println("Сдача — ${money - cost}")
    } else if (money < cost) {
        println("Недостаточно средств, необходимо еще внести — ${cost - money}")
    }
}