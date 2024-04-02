package com.example.inheritanceapp

class Offspring : DerivedClass(), Archer, Singer{
    override fun archery() {
        super.archery()
        println("Archery skills enhanced by offspring")
    }

    override fun sing() {
        super.sing()
        println("Singer skills enhanced by offspring")
    }

}