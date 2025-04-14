package fundamentals

fun main(){
    var name = "Kotlin" // Mutable.
    name = "Jetpack Compose" //var can be assigned multiple times.
    val myName = "BinaryLeo" // Immutable.
    //myName = "Another User" // Error -> Val cannot be reassigned.
    println("Hello World $name!")
    println("Welcome $myName!")

    //Initializing variables:
    var age: Int = 41 // Explicitly given type is redundant here
    println( "$myName has $age years old!")


    //Variables types
    val user = "James" //String
    println("user has a " + user.javaClass.kotlin.simpleName.toString().lowercase() + " type!")
    println("Age has a " + age.javaClass.kotlin.simpleName.toString().lowercase() + " type!")

    //FLoat - Decimal numbers. Holds 32 bits
    //Double - Holds 64 bits (Hold  more precision than 32 bits)
    val p = 3.14159
    val temperature = 28.5f

    //Get types
    println("Temperature has a " + temperature.javaClass.kotlin.simpleName.toString().lowercase() + " type!")
    println("p or pi has a " + p.javaClass.kotlin.simpleName.toString().lowercase() + " type!")

    /*
    types and sizes : small | medium | large | x-large
    Int - A whole number . Holds 32 bits
    Byte holds 8 bits
    Short holds 16 bits
    Long holds 64 bits
     */

    val myByte: Byte = 127
    //myByte = 128 -> the integer literal does not conform to the expected type Byte

    val number = 1000000000000000000
    val oneLong = 1L
    println("number has a " + number.javaClass.kotlin.simpleName.toString().lowercase() + " type!")
    println("oneLong has a " + oneLong.javaClass.kotlin.simpleName.toString().lowercase() + " type!")

}