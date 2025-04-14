package fundamentals

fun main() {
// A collection usually contains a number of objects/items in a certain order of the same type.
//List / ArrayList/ ListOf()

    val myListOfNames = listOf("Leonardo", "Luigi", "Matteo")
    println(myListOfNames[1])
    for (item in myListOfNames) {
        println("$item you are the index " + myListOfNames.indexOf(item) + " of our developers list")
    }

    val yourListOfNames = listOf("Jeremy", "Luke", "Michel") //immutable
    yourListOfNames.forEach {
        println(it)
    }
    val yourMutableListOfNames = mutableListOf("Greg", "John") //mutable
    yourMutableListOfNames.add("Stuart") // add th string STUART to yourMutableListOfNames;

    println(yourMutableListOfNames)

    yourMutableListOfNames.removeAt(1)//Remove the item at index 1
    println(yourMutableListOfNames)

    for(item in yourMutableListOfNames) {
        println("$item you are the index " + yourMutableListOfNames.indexOf(item) )
    }
    println(yourMutableListOfNames.size)
    println(yourMutableListOfNames[1])

    val listofNames = mutableListOf<String>()
    listofNames.add("John")
    listofNames.add("James")
    for(i in 1 .. 10){
        listofNames.add("added $i")
    }
    println(listofNames)
   
}
