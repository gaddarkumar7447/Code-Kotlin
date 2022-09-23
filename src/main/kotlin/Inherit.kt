import java.util.*

open class Inherit {
    inner class A{
        fun method(){
            println("Gaddar")
        }
        init {
            println("Hello")
        }
    }


    open fun a(){
        println("hello")
    }
}
class Delivered : Inherit(){
    override fun a() {
        println("Gaddar")
    }
}
abstract class Honda(num: String) {
    init {
        println(num)
    }
    abstract fun run()
}
class Run: Honda("Gad"){
    override fun run() {

        println("car run safely")
    }
}

abstract class Bank {
    abstract fun simpleInterest(p: Int, r: Double, t: Int) :Double
}

class SBI : Bank() {
    override fun simpleInterest(p: Int, r: Double, t: Int): Double{
        return (p*r*t)/100
    }
}
class PNB : Bank() {
    override fun simpleInterest(p: Int, r: Double, t: Int): Double{
        return (p*r*t)/100
    }
}
data class D(val num: String, val v : Int){

}
class Student{
    fun isPassed(mark: Int): Boolean{
        return mark>40
    }
}
fun Student.isE(mark: Int): Boolean{
    return mark > 90
}

class Person<T>(age: T){
    var age: T = age
    init {
        this.age= age
        println(age)
    }
}

lateinit var myVariable: String
fun initializeName() {
    println("Is myVariable initialized? " + ::myVariable.isInitialized)
    myVariable = "GFG"
    println("Is myVariable initialized? " + ::myVariable.isInitialized)
}
fun add(a: Int, arr: Array<Int>): Int {
    return arr.size;
}
 fun bf() {
    println("hello")
}

fun complexNumberMultiply(num1: String, num2: String): String? {
    val a = num1.split("\\+|i".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
    val b = num2.split("\\+|i".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
    val ar = a[0].toInt()
    val ai = a[1].toInt()
    val br = b[0].toInt()
    val bi = b[1].toInt()
    return String.format("%d+%di", ar * br - ai * bi, ar * bi + ai * br)
}

class myClass(name: String, id: Int) {
    private val name: String
    private var id: Int
    init{
        this.name = name
        this.id = id
        println("Name = $name")
        println("Id = $id")
    }

}
open class SecClass(name1:String){
    constructor(name: String, id: Int,pass: String) : this(name) {
        println("this executes first")
        println("Name = ${name}")
        println("Id = ${id}")
        println("Password = ${pass}")
    }

    constructor(name: String, id: Int): this(name,id, "myPassword"){
        println("this executes next")
        println("Name = ${name}")
        println("Id = ${id}")
    }
}

open class Day{
    open fun display(){
        println("Displaying day")
    }
}
class Night : Day() {
    override fun display(){
        super.display()
        println("Displaying night")
    }
}
class Radius{
    private var value  = 0
    set(value) {
        this.value = value
        field = value
    }


}
fun main() {

    Night().display()
    /*val sc = Scanner(System.`in`)
    val name : String = sc.nextLine()
    val id = sc.nextInt()
    myClass(name, id)*/




    /*val a1 : Inherit = Inherit()
    val arr : Array<Int> = arrayOf(1,2,3,4)
    println(add(1,arr))
    val a = "gaddar"
    val arrayList : ArrayList<Int> = arrayListOf(1,2,3,4,9,8,6)
    arrayList.sort()
    println(arrayList)*/
    /*val chars = a.toCharArray()
    println(chars.contentToString())
    val list: List<List<Int>> = ArrayList(listOf(listOf(1, 2, 3, 4, 5),listOf(2, 7, 8),listOf(2, 9, 5),listOf(4, 5, 6)))
    println(list)*/
}
