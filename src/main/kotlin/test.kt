
import java.util.*
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
    /*val set1 = mutableSetOf<Int>()
    val set2 = mutableSetOf<Int>()
    (1..n1).forEach { set1.add(input.nextInt()) }
    (1..n2).forEach { set2.add(input.nextInt()) }
    if (set1.intersect(set2).isNotEmpty()){
        println(set1.intersect(set2).min())
    } else {
        println(min(set1.min()!!, set2.min()!!)*10+ max(set1.min()!!, set2.min()!!))
    }
}*/
