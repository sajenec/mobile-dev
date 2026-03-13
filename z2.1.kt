import kotlin.random.Random

fun main(){

    val currency = IntArray(5)

    for (i in currency.indices) {
        currency[i] = Random.nextInt(60, 101)
    }

    println(currency.contentToString())

    var minimum: Int = currency[0]

    for (n in currency.indices) {
        if (currency[n] < minimum){
            minimum = currency[n]
        }
    }
    println("Самый выгодный курс: $minimum")
}