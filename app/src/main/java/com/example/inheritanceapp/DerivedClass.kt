package com.example.inheritanceapp

// derived class inherit the properties of baseclass
open class DerivedClass : BaseClass(){

    override fun role() {
        super.role()
        println("Knight of the house of baseclass")
    }
}