package fundamentals

fun main(){
    val listOfNames = listOf("John","Jeremy","James","Julius")
    println(listOfNames.filter {it.startsWith("Ja") })
    println(listOfNames.filter { it.contains("e") })
    println(listOfNames.filter{it.length >4})
}