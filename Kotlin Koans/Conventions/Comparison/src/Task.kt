data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {

    override fun compareTo(other: MyDate) = //implementing Comparable so must have compareTo
        when {
            year != other.year -> year - other.year
            month != other.month -> month - other.month
            else -> dayOfMonth - other.dayOfMonth
        }

}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}

fun main() {
    val date1 = MyDate(1990, 1, 1)
    val date2 = MyDate(2000, 12, 31)

    test(date1, date2)
}
