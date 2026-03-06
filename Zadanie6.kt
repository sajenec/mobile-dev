fun main() {
    val hours: Int = 24
    var cells: Int = 1

    println("0 часов - 1 амеба")

    for (i in 1..hours) {
        if (i % 3 == 0) {
            cells = cells * 2
            println("$i часов - $cells амебы")
        }
    }
}