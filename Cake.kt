fun main() {
//Variables and calling for functions
    val age = 17
    val layers = 5
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
}

//Top cake
fun printCakeTop(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}

//Candles on cake
fun printCakeCandles(age: Int){
    print(" ")
    repeat(age){
        print(",")
    }
    println()
    
    print(" ")
    repeat(age){
        print("|")
    }
    println()
}

//Bottom cake
fun printCakeBottom(age: Int, layers: Int){
    //(repeats layers by repeating age + 2)
    repeat(layers){
    	repeat(age + 2){
        	print("@")
    	}
    	println()
	}
}