import java.awt.Color

fun main() {
    var cars=Car("V8","kwx123","yellow",20)
cars.carry(10)
    cars.identity()
    cars.carry(30)
    var result = cars.calculateParkingFees(20)
    println(result)

}

//Create a class Car with the following attributes: make, model, color, capacity.
class Car(var make:String,var model:String,var color:String,var capacity:Int) {

    //It has these functions:
//    - carry(people: Int) : Prints out “Carrying $people passengers” if the
//    number of people is within its capacity else it prints out “Over capacity
//    by $x people” where x is the number of people exceeding its capacity
    fun carry(people: Int) {
        if (people <= capacity) {
            println("carrying $people passengers")
        } else {
            var x = (people - capacity)
            println("over capacity by $x people")

        }
    }

    // identity() : Prints out the color, make and model in the following
//format e.g: “I am a white subaru legacy”
    fun identity() {
        println("iam a $color,$make,$model")

    }

    //- calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20
    fun calculateParkingFees(hours:Int):Int{
var calculate=hours*20
        return calculate
    }
}
