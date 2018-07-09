package io.designpatterns.creational.builder

import io.designpatterns.creational.builder.team.KotlinDeveloper

fun main(args: Array<String>) {

    // The client wants an application written in Kotlin
    val squareTheDeveloper = KotlinDeveloper()

    // The director instructs the developer with client's requisites
    val pentagonTheDirector = Director(squareTheDeveloper)

    pentagonTheDirector.orderCreateApplication()

    // The developer delivers the result
    val applicationResult = squareTheDeveloper.deliverApplication()

    println(applicationResult)

}