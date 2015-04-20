package com.playgroundapp.app.basics


public enum class State {
    RUNNING
    WALKING
}

public enum class StateWithString (val state: String) {
    RUNNING : StateWithString("Running")
    WALKING : StateWithString("Walking")
}

public enum class StateWithStringAndMethod (val state: String) {
    RUNNING : StateWithStringAndMethod("Running")
    WALKING : StateWithStringAndMethod("Walking")

    fun printState(){
        println(state)
    }
}

fun main(args: Array<String>) {
    StateWithStringAndMethod.RUNNING.printState()
}