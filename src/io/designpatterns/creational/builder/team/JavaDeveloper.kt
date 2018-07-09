package io.designpatterns.creational.builder.team

import io.designpatterns.creational.builder.Developer

/**
 * @author Noe Luaces
 */

class JavaDeveloper(): Developer() {

    override fun createBackend() {
        println("[Java developer] Backend created!")
    }

    override fun createUserInterface() {
        println("[Java developer] User Interface created!")
    }

    override fun createDatabase() {
        println("[Java developer] Database created!")
    }

    override fun deliverApplication(): String {
        return "Here you go! Your Java Application."
    }
}