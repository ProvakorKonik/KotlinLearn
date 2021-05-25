fun main() {
    for(i in 0 until 10){
        if(i in 4..6) println("special i value is $i")
        //i is true if the value is 4 to 8 range


        var prefix : String = if(i !in 4..6) "-" else "*"
        //if else data save to string
        println(prefix+i)
    }


    ///////////////////
    var time = 10;
    if(time in 0..11){  //time value 0 to 11 true
        println("Good Morning")
    }else if(time == 12){
        println("Go to Bath")
    }else {
        println("Work Hard")
    }
    ////////////////////
    println("Good ${if (time<12) "Morning " else "Noon" }")
}