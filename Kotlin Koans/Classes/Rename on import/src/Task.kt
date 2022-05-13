import kotlin.random.Random as KRandom
import java.util.Random as JRandom

fun useDifferentRandomClasses(): String {
    return "Kotlin random: " +
            KRandom.nextInt(2) +
            " Java random:" +
            JRandom().nextInt(2) +
            "."
}

fun useDiffRandClasses(): String { //triple strings :D
    return """
        Kotlin random: 
        ${KRandom.nextInt(2)}
        Java random:
        ${JRandom().nextInt(2)}
    """.trimIndent()
}

fun main() {
    println(useDiffRandClasses())
}