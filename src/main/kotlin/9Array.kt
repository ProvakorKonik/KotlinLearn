fun main() {
    val names = arrayOf("Apple", "BANANA", "CUP", "DALIM")
    names[0] = "APP"
    println("First element ${names[0]}")
    println("Size of the array: ${names.size}")
    println("Size of first index: ${names[0].length}")
    names.set(1, "BALL")
    println(names[1])
    if(names[1].equals("BALL")){
        println("Yes its Ball")
    }else{
        println("Condition False")
    }
    /////////////////////////////////////////////////////////
    var everyTypeOfElecement = arrayOf(1,"A", 'b')   //every types of element in array
    var arrayInsideArray = arrayOf(
        arrayOf(1,  "2",    3),   //mixing data type
        arrayOf(5,  '6',    7),
        arrayOf(8,  9.2,    0)
    )
    println("First index of 2d array: ${arrayInsideArray[0][0]}")
    println("Last  index of 2d array: ${arrayInsideArray[0][arrayInsideArray[0].size - 1]}")

    ////Dedicated Array Declared
    var integerArray :Array<Int> = arrayOf(1,2,3)
    var arrayindex5 = IntArray(5)   //declared array with 5 index
    arrayindex5.set(0, 1)   //set value


}