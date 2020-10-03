package lectures.part2oop

object eight_AbstractClass extends App {
  // abstract
  abstract class Animal {
    val creatureType: String
    def eat()
  }
  class Dog extends Animal {
    val creatureType : String = "Dog"
    def eat(): Unit = println("Chomp, chomp !!")
  }
  trait Carnivore {
    def eat(animal: Animal)
  }
  class Crocodile extends Animal with Carnivore {
    val creatureType : String = "Croc"
    def eat(): Unit = println("Chomp, chomp !!")
    def eat(animal: Animal) = println(s"I am a $creatureType and I eat ${animal.creatureType}")
  }
  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  abstract class Example {
    def hey(): Unit = println("Heyyy")
  }

  val exxp = new Example {
    override def hey(): Unit = println("hello")
  }
  exxp.hey()
  println(exxp.getClass())
}
