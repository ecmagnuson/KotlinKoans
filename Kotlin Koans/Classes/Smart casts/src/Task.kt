fun eval(expr: Expr): Int =
        when (expr) {
            is Num -> expr.value
            is Sum -> eval(expr.left) + eval(expr.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }

interface Expr
class Num(val value: Int) : Expr  {

    //2ndary constructor must call primary constructor.
    //i have the secondary one that accepts no params and defaults value to 0
    constructor(): this(0)

}
class Sum(val left: Expr, val right: Expr) : Expr //really weird to see a class on just one line
// but the fact that the parameters have 'val' (var would also work) means that they are
//properties of the class and have implicit getters and setters created. no need to make our own.. weird

fun main() {

    val variable1 = Num() //num is 0
    println(eval(variable1)) //returns 0 because is Num

    //Num class is of type Expr because it inherits from it?
    val variable2 = Sum(Num(10), Num(20))
    println(eval(variable2))


}



