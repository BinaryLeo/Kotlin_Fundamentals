package Advanced

fun main(){
    val listOfItems = listOf("Rafael", "Lucas", "Gustavo")
    val finder = Finder( list = listOfItems)
    finder.findItem(element= "Lucas"){
        println("Item found: $it")
    }

    val listOfNames = listOf("Diogo","Matias", "Lucius")
    val finderNames = genericFinder(list = listOfNames)
    finderNames.findItem(element= "Matias"){
        println("Item found: $it")
    }
}

class Finder (private val list : List<String>){
    fun findItem(element:String,foundItem:(element:String?) -> Unit) {
        val itemFoundList = list.filter {
            it == element
        }
        if (itemFoundList.isNotEmpty()) {
            foundItem(itemFoundList[0])
        } else {
            foundItem(null)
        }

    }}

class genericFinder<T> (private val list : List<T>){
    fun findItem(element:T,foundItem:(element:T?) -> Unit) {
        val itemFoundList = list.filter {
            it == element
        }
        if (itemFoundList.isNotEmpty()) {
            foundItem(itemFoundList[0])
        } else {
            foundItem(null)
        }

    }}