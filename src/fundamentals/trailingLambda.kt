package fundamentals

fun main(){
enhancedMessage(message="Hello There"){
    println(it)
    12
}
}

fun enhancedMessage(message:String, funAsParameter: (String) -> Int){
    println("$message ${funAsParameter("Hey")}")
}