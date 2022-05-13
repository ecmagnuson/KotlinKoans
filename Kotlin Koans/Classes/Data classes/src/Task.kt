class Person(var name: String, var age: Int) {
    //the properties name and age have implicitly created getters and setters
    //That also happen to be exactly the sameway that java accesses fields within class, so it's confusing at first
    override fun equals(that: Any?): Boolean = (that is Person) && that.name == this.name && that.age == this.age
}

fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}

fun comparePeople(): Boolean {
    val p1 = Person("Alice", 29)
    val p2 = Person("Alice", 29)
    return p1 == p2  // This returns true because of our override. Otherwise it would return false.
    //Interesting note: w/o the override and w/ the 'data' modifyer of class - it returns true...
}

fun main() {
    println("comparePeople: ${comparePeople()}") //returns false
}