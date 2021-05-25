fun main() {
    var i = 0
    while(i < 5){
        println(++i);// i++ it increase value after the round complete
    }
    println("Do loop start without conditions")

    //do loop benefits is it has no condiftion for first round
    outer@do{         //outer is with break, it can break multiple loop by this
        println(i); i++;
        var j = 0
        while(j<5){
            j++
            println("value of j: $j")
            break@outer //BREAK WHILE LOOP THAN DO LOOP ALSO
        }
    }while(i<5)
    
}