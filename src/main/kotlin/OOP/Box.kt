package OOP

class Box (
            var right :Int,
            var left:Int
){
    init {
        println("Primary Constructor Init")
    }

    constructor(color:String = "RED"):this(0,0){
        println("Secandary Constructor")
    }
    init {
        println("Secandary Constructor Init")
    }
    var volume :Int = 0
        get() = wide*length
        set(value){
            if(value == 0){
                println("NO POSSIBLE")
            }else{
                field = value
            }
        }
    var length :Int = 20;
    var wide :Int = 10

    fun displayValues(){
        println("Area = ${length*wide}")
    }

}