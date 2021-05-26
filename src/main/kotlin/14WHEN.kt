fun main() {

    var time = 17
    var welcomeNote =  when(time){ //if time == 0 then its false
                            in 0 .. 11 -> "Good Morning"
                            12  -> "Time for Lunch"
                            14  -> "Good Noon"
                            16,18 -> "Sondha bela"
                            17    -> {  //you can execute more conditions here
                                println("Khokono rath, khokono bikal")
                                "time 17"
                            }
                    /*        (time == 19 && time == 20) -> {
                                "sdf"
                            }*/
                            else -> "Rather bela"
                        }
    println(welcomeNote)
    ////////////String.
    var mode = "GOOD"
    var myMode =  when(mode){ //if time == 0 then its false
        "GOOD" -> "Welcome Bro"
        "Bad"  -> "Dont be sad"
        "Off"  -> "watch some move"

        "NULL"    -> {  //you can execute more conditions here
            println("make some friend")
            "create beautiful moments"
        }
        else -> "Finding mode"
    }
    println(myMode)
}

























