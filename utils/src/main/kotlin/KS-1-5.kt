package org.example.utils

fun main () {

//колличество секунд Гагарина в космосе
    var seconds : Int = 6480

//находим колличество минут
    var minets : Int = seconds / 60

//находим целые час
    var hours : Int = seconds / 3600

//Вычитаем 1 час из всех минут
   var minets1 : Int = minets - 60

    var seconds1 : Int = minets % 60

//char для одного символа
    val char : Char = ':'

    print("0"+hours)
    print(char)
    print(minets1)
    print(char)
    print("00")

}


