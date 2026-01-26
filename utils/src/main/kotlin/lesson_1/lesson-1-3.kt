package org.example.utils.lesson_1

fun main () {

    // год объявляем val, так как он не будет меняться
    val year : Int = 1961

    // время полета объявляем var, так как потом оно будет меняться
    var hour : Int = 9
    var minute : Int = 7


    val stringValue : String = ":"

    // println для вывода в столбик
    println(year)
    println(hour)
    println(minute)

    hour = 10
    minute = 55

    // print для вывода в строчку
    print(hour)
    print(stringValue)
    print(minute)

}
