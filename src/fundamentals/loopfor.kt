package fundamentals
fun main(){
    for(i in 1..3){ // loop through each element between 1 and 3
        println(i)
    }

    for (i in 1..100){
        if( i % 2 == 0 ) println("$i is an even number")
        else println("$i is an odd number")
    }
}