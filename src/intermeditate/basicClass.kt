package intermeditate

fun main() {
    val car = Car()//New instance of Car
    println(car.color  + " " +  car.model)
    car.drive()
    car.speed(0, 200)
    val truck = Truck()
    truck.drive()
    truck.speed(0, 160)
    val button = Button(label="Button one")
    button.onClick("Hello dev")
}

open class Car ( var color :String = "green" , var model :String = "rampage") {
    init{
     if(
         color == "green"
     ){
         println(
                 "This is a green car")}else
        {
            println("This is not a green car")
        }

    }
    open fun speed(minSpeed:Int, maxSpeed:Int){
        println("This car can go from $minSpeed to $maxSpeed")
    }

    fun drive(){
        println(this.color + " " +  this.model  +  " makes vroooom when you drive")
    }

}

class Truck: Car ( color = "silver" , model = "ford") {
override fun speed(minSpeed:Int, maxSpeed: Int) {
    val truckSpeed = maxSpeed * 1.5
    println("$maxSpeed speed is $truckSpeed km/h")
}

}
class Button(private val label:String):ClickEvent{
    override fun onClick(message: String) {
       println("Clicked on $label this is a message: $message")
    }

}

interface ClickEvent{
    fun onClick(message:String)
}
