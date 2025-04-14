package fundamentals

// Functions: A set of instructions bundled together to achieve a certain outcome
fun main() {
    sayHello()
    sum(1, 2)
    calculate(
        11,
        89,
        evenMessage = "is a multiple of",
        oddMessage = "is not a multiple of",
        multipleOf = 11
    )

    println("Your cat has " + calculateCatAge(2) + " yrs old.")
    val catAge = calculateCatAge(age = 12)
    if (checkCatAge(catAge))
        println("This cat is very old.")
    else
        println("This cat is young.")
}

fun sayHello() {
    println("Hello!")
}

fun sum(a: Int, b: Int) { // simple function using parameters
    println(a + b);
}

fun calculate(
    first: Int,
    second: Int,
    evenMessage: String,
    oddMessage: String,
    multipleOf: Int

) {
    for (i in first..second) {
        if (i % multipleOf == 0) {
            println("$i $evenMessage $multipleOf")
        } else {
            println("$i $oddMessage $multipleOf")
        }


    }
}

fun calculateCatAge(age: Int): Int = age * 7
fun checkCatAge(catAge: Int): Boolean {
    return catAge > 14
}

