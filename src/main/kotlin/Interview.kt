class Interview {
    companion object A {
        init {
            println("I'm called.")
        }
    }
}

var lambda = { println("GeeksforGeeks: A Computer Science portal for Geeks") }
var lambda1 = { a: Int, b: Int -> a + b }


fun mul(a: Int, b: Int): Int {
    return a * b;
}

// higher-order function
fun higherfunc(l: (Int, Int) -> Int) {
    val result = l(2, 5)
    println(result)
}

fun heigh(): ((Int, Int) -> Int) {
    return ::mul
}

class User(s: String, b: Int) {

    init {
        println(s)
        println(b)
    }

    init {
        println("Gaddar 1")
    }

    init {
        println("Gaddar 2")
    }

    constructor(a: Int, b: String) : this(b, a) {
        println(b + " " + a)
    }
}

val pi : Float by lazy {
    3.14f
}

fun yoyo(a: Int, b: Array<Int>) {
    b.sort()
}

class Outer{
    inner class Inner{
        init {
            println("Gaddar")
        }
        fun p (){
            println("Kumar")
        }
    }
}

class Constructor(name : String, id : Int){
    private var e_name : String
    private var e_id : Int
    init {
        e_name = name.uppercase()
        e_id = id.plus(10)
    }

    init {
        println(e_name)
        println(e_id)
    }

    constructor(name : String, id: Int , email : String) : this(name, id){
        this.e_name = name
        this.e_id = id
        println(email)
    }
}

class SecondaryConstructor{
    constructor(name : String, id: Int) : this(name, id , "gaddarkumar7447"){
        println("this is call second")
        println("name $name")
        println("id $id")
    }
    constructor(name :String, id : Int , email: String){
        println("This is call first")
        println(name)
        println(id)
        println("email $email")
    }
}

open class Parent{
    constructor(name: String, id: Int){
        println("nameP $name")
        println("idP $id")
    }
    constructor(name: String, id: Int, email: String){
        println("namePS $name")
        println("idPS $id")
        println("emailPS $email")
    }
}
class Child : Parent {
    constructor(name: String, id: Int) : super(name, id){
        println("nameC $name")
        println("idC $id")
    }
    constructor(name: String, id: Int, email: String) : super(name, id, email){
        println("nameCA $name")
        println("idCA $id")
        println("emailCA $email")
    }
}

open class P{
    constructor(name: String, id: Int){
        println("name: $name")
    }
}

class C (name: String, id: Int) : P(name, id){
    init {
        println(name)
        println("id : $id")
    }
}

open class Base{
    val x = 10
}
class base : Base(){
    fun m(){
        println(x)
    }
}

open class B{
    open fun bird(){
        println("Bird is flying")
    }
    open fun swim(){
        println("swimming")
    }
}

class C1 : B(){
    override fun bird(){
        super.bird()
        println("bird is swimming")
    }
    override fun swim(){
        super.swim()
        println("swim is the best exercise of the body")
    }

}

abstract class Bas{
    val a = 10
    abstract fun method()
}
class BS : Bas(){
    override fun method() {
        println("jello")
    }

}

interface Ball {
    val id : Int
    fun method()
    fun method1 (){
        println("Gaddar Kumar chaudhary")
    }
}
interface Basket{
    fun basketPlay()
}
 class Cat : Ball, Basket {
     override val id: Int = 12
    override fun method() {
        println("this is the first method")
    }

     override fun method1() {
         println("nsd")
     }

     override fun basketPlay() {
         println("I'm playing basket")
     }
}

data class DataClas(val id: Int, val name: String, val email: String){

}

fun main(args: Array<String>) {

    val a1 = Cat()
    a1.method()
    a1.basketPlay()

    /*val child = Child("Gaddar", 13)
    val child1 = Child("Gaddar", 13, "gaddarkumar7447@gmail.com")*/


    /*val a = SecondaryConstructor("gaddar", 82)*/
    /*val a = Constructor("Gaddar", 920)
    val a1 = Constructor("Gaddar", 9, "gaddarkumar7447@gmail.com")*/
    /*val a = Outer().Inner().p()*/
    /*val name = Name(12, "Gaddar")*/
    /*fun isPositive(x: Int) = x > 0
    val numbers = listOf(-10, -5, 0, 5, 10)
    println(numbers.filter (::isPositive))*/
    /*val map : Map<Int, String> = mapOf(10 to "gad", 1 to "Ajay", 4 to "Vijay", 3 to "Prakash")
    for (k in map.keys){
        println("$k = ${map[k]}")
    }
    val hash : HashMap<Int, Int> = HashMap()
    hash.put(1,3)
    hash.put(6,30)
    hash.put(9,34)
    hash.put(2,34)
    println(hash)*/


    /*val arrayList : ArrayList<Int> = arrayListOf(1,2,3,4,5,6,6,7)
    val a1 = arrayList.iterator()
    while (a1.hasNext()){
        println(a1.next())
    }

    val a = 10
    val arr : Array<Int> = arrayOf(3,4,5,6,1,2,3,4)*/


    /*val mutable: MutableList<Int> = mutableListOf(2,1,2,4,5,2,6,4,2,93,2,9,3,5)
    for (element in 0 until mutable.size) print(" "+mutable[element])*/

    /*val result = pi * 7 * 7
    println(result)
    val array = arrayOf(23434,3,5,34,654,36,4)
    val arr : Array<Int> = arrayOf(23,43,1,23,3,4,5)
    arr.sort()
    println(arr.contentToString())*/
    /*var inList : List<Int> = listOf(1,2,4,5,67,7,6)
    Collections.sort(inList)
    println(inList)*/


    /*val s : String ?= "Ha"
    println(s!!.length)*/
    /*val m = heigh()
    val re = m(8, 3)
    println(re)*/

    /*val str: String? = "null"
    val s: Int = str?.length ?: -1
    val p: Int = str?.length ?: -1
    println(s)
    println(p)*/
    /*val a = User("Gaddar", 23)
    val b = User("Gaddar", 23)
    println(a.toString())
    if (a == b) println("equal") else println("Not equal")*/

    /*val del = deligationImplimention("Gaddar0")
    del.fun1()
    del.fun2()
    newFeature(del).fun1()*/


    /*val seal1 = Seal.Success("success")
    seal1.fun1()*/

}


sealed class Seal{
    data class Success(val str : String) : Seal(){
        fun fun1(){
            println(str)
        }
    }

    class Failure: Seal(){
        init {
            println("hello world")
        }
    }
}


interface deligation {
    fun fun1()
    fun fun2()
}

class deligationImplimention(val y: String) : deligation {
    override fun fun1() {
        println(y)
    }
    override fun fun2() {
        println(y)
    }

}
class newFeature(m : deligation) : deligation by m{
    override fun fun1() {
        println("Gaddar")
    }
}

class Name constructor(a : Int, b : String){
    init {
        val p = a
        val b = b
        println(p)
        println(b)
    }
}