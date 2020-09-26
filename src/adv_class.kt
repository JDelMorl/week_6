class Person constructor(firstName: String,
                         lastName: String,
                         var middleInitial: Char,
                         var age: Int){
    var fullName: String = ""
    var firstName: String = firstName
        get() = field
        set(value) {
            field = value
            fullName = "$firstName $middleInitial $lastName"
        }
    var lastName: String = lastName
        get() = field
        set(value) {
            field = value
            fullName = "$firstName $middleInitial $lastName"
        }

    init {
        fullName = "$firstName $middleInitial $lastName"

    }
    fun printAll(){
        println("$fullName is $age")
    }
}