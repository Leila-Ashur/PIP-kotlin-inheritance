import java.awt.Color
import kotlin.math.PI

fun main() {
    var cars=Car("V8","kwx123","yellow",20)
cars.carry(10)
    cars.identity()
    cars.carry(30)
    var result = cars.calculateParkingFees(20)
    println(result)
    var ride= Bus("subaru","kwxt","pink",60)
     ride.capacity
    var speed =ride.maxTripFare(300.8)
    println(speed)
    var all=ride.calculateParkingFees(30)

    var move = Vehicle("BMW","kwx",2020)
    move.drive()
    var use = BankAccount(1234,300,3)
    use.deposit(200)
    use.withdraw(100)
    var me =Person("leila",20)
    me.celebrateBirthday()
    var shapes = circle(2.4,3.5)
    shapes.getArea()
    var shape=triangle(0.5,20,4.5)
    shape.getArea()

    var shap=rectangle(40,40)
    shap.getArea()
    var wildlife=Animal("lion",40)
    var dogs =Dog("puppy",10)
    dogs.eat()
    dogs.makesSound()
    var cats=Cat("kitten",5)
    cats.eat()
    cats.makesSound()
    var birds=Bird("eagle",15)
    birds.makesSound()
    birds.eat()

}

//Create a class Car with the following attributes: make, model, color, capacity.
open class Car(var make:String,var model:String,var color:String,var capacity:Int) {

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
   open fun calculateParkingFees(hours:Int):Int{
var calculate=hours*20
        return calculate
    }
}


//2. Create a class Bus with the same attributes and functions as the Car class. In addition, it has another method called
// maxTripFare(fare: Double) that calculates and returns the maximum amount of fare that can be collected per trip
//The bus’ calculateParkingFees method returns the product of hours and the capacity of the bus (3 points)
//Make use of inheritance to avoid duplication. Also be sure to instantiate both classes
//and call each of the functions on the objects.


class Bus(make: String,model: String,color: String,capacity:Int):Car(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double{
        return capacity * fare

    }

    override fun calculateParkingFees(hours: Int): Int {
        return hours * capacity
    }
}
//Create a class called BankAccount with properties accountNumber, balance, and interestRate, and methods deposit()
// and withdraw(). The deposit() method should add money to the account balance, and the withdraw() method should subtract
// money from the account balance. Add validation to the withdraw() method to ensure that the balance does not go negative.

//input- money: int, out put- 2:validation,  process - a class,
class BankAccount (var accountNumber:Int,var balance:Int,var IntrestRate:Int){
    fun deposit(Amount:Int){
        balance += Amount
        println(balance)

    }
    fun withdraw(Amount: Int) {
        if (Amount >= balance) {
            println("Not enough money")
        }
        else{
            balance-=Amount
            println(balance)
        }
    }

}

//Create a class called Vehicle with properties make, model, and year, and a method drive(). The drive() method should
// print a message indicating that the vehicle is being driven.
class Vehicle(var make: String,var model: String,var year:Int) {
    fun drive() {
        println("vehicle is  driven")
    }
}
//Create a class called Person with properties name and age, and methods introduce() and celebrateBirthday(). The
//introduce() method should print a message introducing the person, and the celebrateBirthday() method should increment
// the person's age by 1.
class Person(var name:String,var age:Int){
    fun introduce(){
      println("Introducing the person")
    }
    fun celebrateBirthday (){
    age++
        println("its my birthday am $age years old")
    }

}
//Create a class called Shape with a method getArea(). Create subclasses for different shapes, such as Circle,
// Rectangle, and Triangle, and override the getArea() method to calculate the area of each shape.
open class Shape(){
    open fun getArea(){

    }
}
 class circle(var radius:Double,var height:Double):Shape() {
     override fun getArea() {
         var area = PI * radius * radius * height
         println(area)

     }
 }

class triangle(var half: Double, var base: Int, var height: Double) : Shape() {
         override fun getArea() {
             var area = half * base * height
             println(area)
         }
     }

 class rectangle(var legnth:Int,var width:Int):Shape(){
     override fun getArea() {
         var area=legnth * width
         println(area)
     }
 }

//Create a class hierarchy for animals. Create a base class called Animal with properties name and age, and methods
// makeSound() and eat(). Create subclasses for different types of animals, such as Dog, Cat, and Bird, and override
// the makeSound() and eat() methods to be appropriate for each subclass.

open class Animal(var name: String,var age: Int,)  {

 open fun makesSound(){


}
  open  fun eat(){

    }

}
class Dog(name: String,age: Int):Animal(name, age){
    override fun eat() {
        println("meat,meat")
    }
    override fun makesSound() {
      println("wooh!,wooh!")
    }
}
class Bird(name: String,age: Int):Animal(name, age){
    override fun eat() {
        println("insect")
    }
    override fun makesSound() {
     println("Koh,koh",)
    }
}
class Cat(name: String,age: Int):Animal(name, age){
    override fun eat() {
        println("milk")
    }

    override fun makesSound() {
        println("meaaww,meaaw")
    }
}













