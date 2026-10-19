package org.example
//Kotlin lang.

class Employee(
    val lastName: String,
    val firstName: String,
    val middleName: String,
    val position: String,
    val email: String,
    val phone: String,
    val salary: Double,
    val age: Int
) {
    // Вторичный конструктор для сотрудников на испытательном сроке (без зарплаты)
    constructor(
        lastName: String,
        firstName: String,
        middleName: String,
        position: String,
        email: String,
        phone: String,
        age: Int
    ) : this(lastName, firstName, middleName, position, email, phone, 0.0, age)

    fun printInfo() {
        println("ФИО: $lastName $firstName $middleName")
        println("Должность: $position")
        println("Email: $email")
        println("Телефон: $phone")
        if (salary > 0) {
            println("Зарплата: ${salary.toInt()} руб.")
        } else {
            println("Зарплата: испытательный срок (не указана)")
        }
        println("Возраст: $age лет")
        println("-------------------------------")
    }
}

fun main() {
    val employees = arrayOf(
        Employee("Петров", "Алексей", "Иванович", "Менеджер",
            "petrov@example.ru", "+7 (999) 123-45-67", 60000.0, 35),
        Employee("Сидорова", "Мария", "Сергеевна", "Бухгалтер",
            "sidorova@example.ru", "+7 (999) 234-56-78", 75000.0, 42),
        Employee("Иванов", "Дмитрий", "Петрович", "Программист",
            "ivanov@example.ru", "+7 (999) 345-67-89", 120000.0, 45),
        Employee("Кузнецов", "Андрей", "Олегович", "Стажёр",
            "kuznetsov@example.ru", "+7 (999) 456-78-90", 23),
        Employee("Смирнова", "Ольга", "Викторовна", "Директор",
            "smirnova@example.ru", "+7 (999) 567-89-01", 200000.0, 51)
    )

    println("Сотрудники старше 40 лет:\n")
    for (employee in employees) {
        if (employee.age > 40) {
            employee.printInfo()
        }
    }
}
