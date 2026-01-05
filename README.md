# Vehicle Management System

## Project Overview
This project demonstrates OOP concepts such as inheritance,
abstraction, composition, and aggregation. A Vehicle system was created with different
types of vehicles and drivers assigned to them.

## Class Hierarchy
Vehicle is an abstract superclass that contains common fields and methods.
Car, Motorcycle and Truck inherit from Vehicle and use override.
The Driver class is associated with vehicles using composition and aggregation.

Protected access was used for shared fields, while private was used for specific data.

## Compile and Run
javac *.java  
java Main

## Screenshots
Screenshots of program output are included in the docs/screenshots folder.

## Reflection
Inheritance simplified the design by allowing common vehicle properties to be reused
without rewriting code. Method overriding made it possible for each vehicle type to
behave differently while using the same method names. 
The only problem I faced, is how to use abstraction, composition, and aggregation in my program

