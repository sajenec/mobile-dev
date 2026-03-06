fun main() {
    println("1.Первое блюдо\n" +
            "2.Второе блюдо\n" +
            "3.Десерт\n" +
            "Пожалуйста, выберите пункт меню: ")

    val a: Int = readLine()!!.toInt()

    if (a == 1) {
        println("борщ")
    } else if (a == 2) {
        println("картошка с мясом")
    } else if (a == 3) {
        println("компот")
    }
}