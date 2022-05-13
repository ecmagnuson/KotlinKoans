fun eval(expr: Expr): Int =
        when (expr) {
            is Num -> expr.value
            is Sum -> eval(expr.left) + eval(expr.right)
        }

sealed interface Expr //no longer need to throw exception with sealed interface
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr
