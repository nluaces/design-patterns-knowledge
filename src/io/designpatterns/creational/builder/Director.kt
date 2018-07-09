package io.designpatterns.creational.builder

/**
 * @author Noe Luaces
 */

class Director(val developer: Developer){

    fun orderCreateApplication() {

        developer.createDatabase()
        developer.createBackend()
        developer.createUserInterface()
    }

}