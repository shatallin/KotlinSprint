package org.example.utils.Lesson_2

fun main () {

    val employee = 50
    val intern = 30
    val employeeSalaries = 30000
    val employeeIntern= 20000

    val sumSalariesEmployee = employee * employeeSalaries

    val sumInternEmployee = intern * employeeIntern

    val sum = sumInternEmployee + sumSalariesEmployee

    val averageSalary = sum / (intern + employee)

    //ЗП постоянных сотрудников
    println(sumSalariesEmployee)

    //ЗП после прихода стажеров
    println(sum)

    //Cредняя ЗП
    println(averageSalary)


}