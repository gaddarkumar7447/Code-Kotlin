import java.util.HashSet
import kotlin.math.sqrt

fun find(str : String) = str == "kotlin"
val x = 12
val y = 2

class  Practices (val nums: String,val n : Int){
    init {
        val n2 = nums
        val n1 = n
        println(n2)
        println(n1)
    }


    private var name: String = "Ashu"
    class nestedClass{
        var description: String = "code inside nested class"
        private var id: Int = 101
        fun foo(){
            println("Id is ${id}")
        }
    }
}

fun main(args:Array<String>) {
    val obj = Practices("Gaddar", 1)

    /*val list : List<String> = listOf("kotl", "kotin", "pri")
    println(list.filter(::find))*/

    /*val a = Employee::id
    println(a.get(Employee(4)))*/

    /*val num = 25
    print(funName(num.toDouble()))*/
  /* funN()
    println(funName(25.0))*/

    /*var ch = charArrayOf('1','3','s')

    val a1 = String(ch)
    println(a1)*/

   /* val a = listOf(1, 2, 3, 4)
    for (element in a){
        println(element)
    }*/

   /* val list : List<String> = listOf("Gadda", "Kuma", "Cha")
    for (a in list.indices){
        println("$a "+list[a])
    }*/

    /*val l: List<Int> = listOf()
    val mutable: MutableList<Int> = mutableListOf()
    mutable.add(1)*/

    /*val a : ArrayList<Int> = arrayListOf(1,2,3)
    val ite = a.iterator()
    while (ite.hasNext()){
        println(ite.next())
    }*/

    /*val a : Map<Int, Int> = mapOf(1 to 1, 2 to 3, 4 to 10)
    for (a1 in a.values)
        println(a[a1])*/

    /*val hashmap : HashMap<Int, Int> = hashMapOf();
    hashmap.put(1,11)
    hashmap.put(2,1111)
    hashmap.put(3,111)
    hashmap.put(4,100)
    for (a in hashmap.values)
        println(a)*/

    /*val hashSet = HashSet<Int>()
    hashSet.add(2)
    hashSet.add(13)
    hashSet.add(6)
    hashSet.add(5)
    hashSet.add(21)
    hashSet.add(22)
    hashSet.add(29)
    hashSet.add(8)
    println(hashSet.size)
    println("......traversing hashSet......")
    for (element in hashSet){
        println(element)
    }*/

    /*val hashSet : HashSet<Int> = hashSetOf()
    val setif : Set<Int> = setOf(1,2,3)
    hashSet.add(3)
    println(setif)*/
    /*val set : Set<Any> = setOf(1,2,3,3,4,5, "gaddar", "gaddar", "kumar")
    println(set)*/
    /*val arrayList: ArrayList<Employee> = arrayListOf<Employee>()
    val a = Employee(1,"agay",4435, "de")*/
    /*val a = Array<Int>(4){19}
    println(a.contentToString())*/

    /*fun isPositive(x : Int) = x > 0
    fun ispos(x : Int) = x < 0
    val number = listOf(-10,-5,0,5,10)
    print(number.filter(::isPositive))
    println(number.filter(::ispos))*/



}

/*fun Employee(id: Int): Employee {
    return Employee(2)
}*/


fun funName(num:Double): Int {
    return sqrt(num.toDouble()).toInt()
}
 fun funN(num: Int = 2, num2 : Char = '0') : Int{
    println("Gaddar")
    return 4;
}

fun rotate(matrix: Array<IntArray>) {
    val copy = Array(matrix.size) { IntArray(matrix[0].size) }
    for (i in matrix.indices) {
        for (j in matrix[0].indices) {
            copy[j][matrix.size - i - 1] = matrix[i][j]
        }
    }

    for (i in matrix.indices) {
        for (j in matrix[0].indices) {
            matrix[i][j] = copy[i][j]
        }
    }
}

/*
fun findSubarrays(nums: IntArray): Boolean {
    if (nums.size < 2) return false
    val set = HashSet<Int>()
    for (i in nums.indices - 1) {
        println(set)
        if (!set.add(nums[i] + nums[i + 1])) return true
    }
    return false
}*/
