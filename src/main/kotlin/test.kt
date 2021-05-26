
/*import java.util.*
import kotlin.math.max
import kotlin.math.min

fun main(args :Array<String>) {
    val input = Scanner(System.`in`)
    val n1 = input.nextInt()
    val n2 = input.nextInt()
    var i :Int = 1;
    var ch :Int = 0
    for(i in i ..n1){
        val num = input.nextInt()
        if(num > 0 && num > n2){
            ch++
        }
    }
    println(ch)

}
    *//*val set1 = mutableSetOf<Int>()
    val set2 = mutableSetOf<Int>()
    (1..n1).forEach { set1.add(input.nextInt()) }
    (1..n2).forEach { set2.add(input.nextInt()) }
    if (set1.intersect(set2).isNotEmpty()){
        println(set1.intersect(set2).min())
    } else {
        println(min(set1.min()!!, set2.min()!!)*10+ max(set1.min()!!, set2.min()!!))
    }
}*/
/*

fun main() {
    var i: Int = 0
    var a: Int
    var b: Int
    var c: Int
    var x = 0
    var q: Int
    val input = Scanner(System.`in`)
    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();

    for(i in 1 .. c){
            q = i * a
            x = x + q
    }
    var konik = x - b
    if (konik < 0) {
        konik = 0
    }
    println(konik)
}*/
import java.util.*
fun main(args :Array<String>) {
    val input = Scanner(System.`in`)
    var t  = input.nextInt()
    while(t > 0){
        t--
        var n  = input.nextInt()
        var myarray :IntArray = IntArray(n )
        for(i in 0 until n){
            var value = input.nextInt()
            myarray.set(i,value)
        }
        myarray.sort()
        var lowest_distance = myarray[n-1]
        for(i in 0 until n-1){
            if(lowest_distance > myarray[i+1]-myarray[i]){
                lowest_distance = myarray[i+1]-myarray[i]
            }
        }
        println(lowest_distance)
    }

}
