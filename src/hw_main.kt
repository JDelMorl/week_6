fun main() {
    var emp1 = Employee("Jane Doe", PositionTitle.ADMINISTRATION, true, 27.00, 1)
    var emp3 = Employee("John Smith", PositionTitle.MAINTENANCE, false, 21.00, 3)
    var emp2 = Employee("Larry Jackson", PositionTitle.PRODUCTION, false, 22.00, 2)

    emp1.display()
    emp1.calculate(45)
    emp2.display()
    emp2.calculate(50)
    emp3.display()
    emp3.calculate(35)
}