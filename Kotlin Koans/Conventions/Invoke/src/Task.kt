class Invokable {
    var numberOfInvocations: Int = 0
        private set //private setter

    operator fun invoke(): Invokable {
        numberOfInvocations++
        return this
    }
}

fun invokeTwice(invokable: Invokable) = invokable()()

fun main() {
    var invok = Invokable().invoke()
    println(invok)
    println(invok.numberOfInvocations)
}