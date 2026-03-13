import kotlin.random.Random

fun main(){

    println("Введите сколько учеников в классе")
    val quantity = IntArray(readLine()!!.toInt())

    for (i in quantity.indices){
        quantity[i] = Random.nextInt(140, 195)
    }

    println(quantity.contentToString())

    var max = quantity[0]
    var min = quantity[0]

    for (i in quantity.indices){
        if (quantity[i] > max){
            max = quantity[i]
        }
    }
    println("Самый высокий ученик в классе: $max")

    for (i in quantity.indices){
        if (quantity[i] < min){
            min = quantity[i]
        }
    }
    println("Самый низкий ученик в классе: $min")

    var counter = 0
    for (i in quantity.indices){
        if (quantity[i] > 170){
            counter += 1
        }
    }
    println("Количество учеников способных играть в бакетболл: $counter")
}