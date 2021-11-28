fun main() {
    //variables
    val border = "`-._,-'"
    val timesToRepeat = 2
    
    //Happy Birthday lines
    printBorder(border, timesToRepeat)
    println("Happy Birthday!")
    printBorder(border, timesToRepeat)
}

//function for border and repeating
fun printBorder(border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(border)
    }
    println()
}