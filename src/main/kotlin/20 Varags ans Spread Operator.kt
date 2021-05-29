var StringConstantWord = "I am constant"
fun main() {
    var result  = getSum(1,2,3,4,5)
    println("RESULT: $result")
    println(StringConstantWord);
    StringConstantWord = "I AM CHANGED";
    val array = intArrayOf(1,2,3,4,5,6) //limit less array
    var result_array = getArraySum(*array)
    println("Array sum: $result_array")

    //// passing multiple parameters
    result = getSumMultipleParameters(1,2,3,4,5, age  = 21)
    ////Excercise Get max value
    var maxValue = largestvalue(10,200,1,5,6,123, myNumber = 123)
    //var maxValue = largestvalue(number = *intArrayOf(10,200,1,5,123), myNumber = 123) //by passing limit less array
    println("Largest Value: $maxValue")
}
fun getSum(vararg numbers: Int): Int{
    var sum = 0;
    for(i in numbers)   sum += i
    return sum
}
fun getArraySum(vararg numbers: Int): Int {
    var sum = 0
    for(item in numbers)    sum += item
    return sum
}
fun getSumMultipleParameters(vararg numbers: Int, age: Int): Int {
    var sum = 0
    for(item in numbers)    sum += item
    return sum + age
}
fun largestvalue(vararg number:Int, myNumber: Int):Int{
    var max = 0;    max = myNumber;
    for(item in number) if(item>max) max = item
    return max
}
