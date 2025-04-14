package fundamentals

fun main(){
println(sum(2,3))

    name("Paul") //Lambda expression
    showName("Paul") //Function
}

//Lambda expression is a shorter way of describing a function
val sum:(Int,Int)-> Int = {a,b->a+b}
//---1-|-----------2------|-3--|--4-|
//variable| ---- type ----| params | body|



fun showName(name:String){
    println(name)
}

val name:(String)-> Unit = {name -> println(name) }//Unit type corresponds to thr void type in java