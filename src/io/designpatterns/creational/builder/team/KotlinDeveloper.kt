package io.designpatterns.creational.builder.team

import io.designpatterns.creational.builder.Developer

/**
 * @author Noe Luaces
 */

class KotlinDeveloper : Developer() {

    override fun createBackend() {
        println("[Kotlin developer] Backend created!")
    }

    override fun createUserInterface() {
        println("[Kotlin developer] User Interface created!")
    }

    override fun createDatabase() {
        println("[Kotlin developer] Database created!")
    }

    override fun deliverApplication(): String {
        return "Here you go! Your Kotlin Application."
    }
}