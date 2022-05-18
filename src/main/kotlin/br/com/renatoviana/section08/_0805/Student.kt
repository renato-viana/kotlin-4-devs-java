package br.com.renatoviana.section08._0805

data class Student(val name: String, var age: Int)

fun getStudents(): List<Student> {
    return listOf(
        Student("Adam", 19),
        Student("Manuel", 23),
        Student("Maria", 20),
        Student("Pedro", 30),
        Student("Ana", 33)
    )
}
