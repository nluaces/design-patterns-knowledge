package io.designpatterns.creational.builder

/**
 * @author Noe Luaces
 */

open class Developer {

    open fun createDatabase() {}
    open fun createBackend() {}
    open fun createUserInterface() {}
    open fun deliverApplication(): String? { return null}
}