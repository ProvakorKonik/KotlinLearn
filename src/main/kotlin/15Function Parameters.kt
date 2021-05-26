
fun main() {
    //greet("Moring", 4)
    var max : Int = getMax(4,2);
    max = getMax(num2 = 12, num1 = 8)   //changing the order of parameters
    var max2 : Double= getMax(4.0,2.0)  //method overloading
    max2 = getMax(4.0)  //Default value set
    max  = getMaxSingleExpression(4,2)
}

fun getMax(num1: Int, num2: Int): Int {
    val max = if(num1 > num2) num1 else  num2
    return max
}
fun getMax(num1: Double, num2: Double = 1.2): Double {
    val max :Double= if(num1 > num2) num1 else  num2
    return max
}

fun getMaxSingleExpression (num1 :Int, num2 : Int):Int = if(num1>num2) num1 else num2

fun greet(s: String, i: Int) {
   for(i in 0 until 4) println("Good $s!")
}


