open class Employee (p: Int){
    private var a:Int = 0
    private lateinit var b:String
    constructor(num: String, nums:Int): this(nums){
        this.a = nums
        this.b = num
        println(a)
        println(b)


    }

    /*constructor(n : Int) :this(n){
        this.a = n
        println(a)

    }*/
}
class Derived(num: Int) : Employee(num){

}
fun pass(): Int{
    return 3 + 6;
}

fun main(agrs: Array<String>){
    Employee("Gaddar", 90)
    Employee(2)

}
