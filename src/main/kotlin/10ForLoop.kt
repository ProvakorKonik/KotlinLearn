fun main() {
    var nameArray :Array<String>
        = arrayOf("Apple", "Banana", "Cup", "Dalim", "Eggplant", "Flog")
    for (word in nameArray){
        println(word)
    }
    for(index in nameArray.indices){
        println("Index: $index Value: ${nameArray[index]}")
    }
    println("Printing array by Index no: ")
    //for(i in 0.rangeTo(5))   //Similar
    for(i in 0..5){   //0,1,2,3,4,5 that means it includes 5
        println(nameArray.get(i))
    }
    println("Printing array by Index no unitl reach to 6: ")
    for(i in 0 until 6){   //0,1,2,3,4,5 that means it will run before 6
        println(nameArray.get(i))
    }
    println("Printing array by Index i+2: ")
    for(i in 0 until 6 step(2)){   //0,1,2,3,4,5 that means it will run before 6
        println(nameArray.get(i))
    }
    println("Printing Decreasing order")
    for(i in 10 downTo  1) print("$i ") //reverse print = i--
    println("\nPrinting a to z series")
    for(i in 'a'..'z') print("$i ") //print series a to z
    println("\nPrinting 1.0 to 9.9 series")
    //for(i in 1.0.rangeTo(9.9)) print("$i ") //print series a to z

}