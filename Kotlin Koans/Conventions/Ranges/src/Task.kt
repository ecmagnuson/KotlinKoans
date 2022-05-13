fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first..last
}

fun main() {

    //ranges are interesting here
    val lst: ArrayList<Int> = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    //Kotlin doesn't have the standard C for loop

    for (num in lst) {
        print("$num ")
    }
    println()
    for (num in lst[5]..lst[lst.size - 1]) {
        print("$num ")
    }
    println()
//    for (num in lst.reversed()) {
//        print("$num ")
//    }
    println()
    for (i in 6 downTo 0 step 2) {
        print(i)
    }
    println()
    for (i in 0 until lst.size) {
        print("${lst[i]} ")
    }
}
