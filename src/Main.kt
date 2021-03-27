package com.includehelp.basic

import java.util.*


fun getSumOfDigits(number: Int): Int {
    var number = number
    var sum = 0
    while (number > 0) {
        val r = number % 10
        sum += r
        number /= 10
    }
    return sum
}

fun numberMultiplyDigits(number: Int): Int {
    var number = number

    var result = 1
    while(number > 0) {

        result *= number % 10
        number /= 10
    }
    return result
}

fun difference(number: Int): Int {

    return getSumOfDigits(number) - numberMultiplyDigits(number)

}

fun main(arg: Array<String>) {
    val sc = Scanner(System.`in`)


    println("შეიყვანეთ რიცხვი  : ")
    val num: Int = sc.nextInt()

    val sumOfDigits = getSumOfDigits(num)
    val product0ofDigits = numberMultiplyDigits(num)
    val difference = difference(num)

    println("ციფრთა ჯამი არის : $sumOfDigits")
    println("ციფრთა ნამრავლი არის : $product0ofDigits")
    println("ჯამს მინუს ნამრავლი არის : $difference")

}
