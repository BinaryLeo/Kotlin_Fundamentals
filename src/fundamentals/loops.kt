package fundamentals

fun main (){
   /* Loops  and branching
    if amount is equal to 1000, then you're wealthy, else you are getting by just fine
    */
    val amount = 1001
    if(amount == 1000) {
        println("you're wealthy")
    }else if(amount >= 1000){
        println("Wow .. you are very wealthy")
    }else{
        println("you are getting by just fine")
    }
    //When expression
    when(amount){
        100-> println("you have 100")
        125-> println("you are getting there..")

        in 300..380 -> println("you have a great progress ..")
        !in 300..380 -> println("you need to work more than now")

        999-> println("Really close")
        1000-> println("Rich but not there")
        1100 -> println("you've made it")
        else ->{
            println("$amount is just not going to work")
        }
    }
}