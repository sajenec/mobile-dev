import kotlin.random.Random

fun main(){

    println("Введите высоту улитки от земли (в см) : ")
    var currentheight: Int = readLine()!!.toInt()

    println("Введите высоту дерева (в м) : ")
    val treeheight = readLine()!!.toInt()

    println("Погода за 7 дней: ")
    for (i in 1..7){
        val weather = Random.nextBoolean()
        if (weather){
            currentheight += 2
            println("В $i день была солнечная погода!")
        } else {
            currentheight -= 1
            println("В $i день была пасмурная погода")
        }
    }
    println("Итоговое местоположение улитки на дереве высотой $treeheight м: $currentheight см")
}