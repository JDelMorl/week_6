class Employee(
    var name: String,
    var position: PositionTitle,
    var salary: Boolean,
    var rate: Double,
    var shift: Int){
    fun display(){
        println("\n$name" +
                "\n$position is salary: $salary " +
                "\nShift: $shift" +
                "\nRate of pay is: $$rate")
    }

    fun calculate(hoursIn: Int) {
        var check = 0.00
        var realPay = 0.00
        when (shift) {
            1 -> {
                realPay = rate
            }
            2 -> {
                realPay = rate + (rate * .05)
            }
            3 -> {
                realPay = rate + (rate * .1)
            }
        }
        check = if (salary){
            realPay * hoursIn
        } else{
            if(hoursIn > 40){
                (40 * realPay) + ((hoursIn - 40) * (realPay * 1.5))
            } else{
                realPay * hoursIn
            }
        }
        println("$name earned $$check this week")
    }
}
enum class PositionTitle {
    ADMINISTRATION {override fun displayIt(){
        println("Administration")}
    },
    MAINTENANCE {override fun displayIt(){
        println("Maintenance")}
    },
    PRODUCTION {override fun displayIt(){
        println("Production")}
    },
    SALES {override fun displayIt(){
        println("Sales")}
    },
    TECHNICAL {override fun displayIt(){
        println("Technical")}
    },
    SECRETARIAL {override fun displayIt(){
        println("Secretarial")}
    };
    abstract fun displayIt()
}