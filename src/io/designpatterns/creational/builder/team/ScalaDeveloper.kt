package io.designpatterns.creational.builder.team

import io.designpatterns.creational.builder.Developer

/**
 * @author Noe Luaces
 */

class ScalaDeveloper : Developer() {

    override fun createBackend() {
        println("[Scala developer] Backend created!")
    }

    override fun createUserInterface() {
        println("[Scala developer] User Interface created!")
    }

    override fun createDatabase() {
        println("[Scala developer] Database created!")
    }

    override fun deliverApplication(): String {
        return "Here you go! Your Scala Application."
    }
}