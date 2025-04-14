package fundamentals

fun main(){
    val myIntegerList = emptyList<Int>()
    var myStringList = emptyList<String>()
    val myBooleanList = emptyList<Boolean>()
    println(myStringList)

    val nonEmptyList = listOf<String> ("Leonardo","William")
    myStringList = nonEmptyList
    println(myStringList)

}
