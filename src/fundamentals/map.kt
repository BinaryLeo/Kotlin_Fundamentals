package fundamentals

fun main() {
    val countries = mapOf("FR" to 1, "CA" to 2, "BR" to 3, "NO" to 4)
    println(countries["FR"])
    println(countries["CA"])

    println(countries) //All countries

    println(countries.keys) //All keys
    println(countries.values) //All values

    for( item in countries){
        if( item.value % 2 == 0 )
            println(  item.key + "  has an even value.")
    }

    val teachers = mutableMapOf("Alice" to 1, "Bob" to 2, "Bill" to 3) //mutable
    println(teachers)
    teachers["William"] = 5
    println(teachers)

}
