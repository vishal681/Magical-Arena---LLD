# Swiggy Pro Assessment: Magical Arena Game

## Overview

This project simulates a magical arena where two players fight until one of them wins.
Each player has attributes such as health, strength, and attack power, and the outcome
of the fight is determined by random dice rolls for attack and defense.

## Requirements
- Java Development Kit (JDK)
- Eclipse IDE
- JUnit 4.11

## Features

- Players have attributes such as health, strength, and attack.
- Players take turns attacking and defending using dice rolls.
- Damage calculation is based on attack and defense rolls.
- The game ends when one player's health reaches 0.


## Project Structure
- src\main\java\swiggy_pro\assesment (App.java): Contains the main source code files.
- src\test\java\swiggy_pro\assesment (AppTest.java and PlayerTest.java): Contains the test source code files.
- pom.xml: Maven project configuration file.

## How to Build and Run

=>To import the project into Eclipse:
1. Open Eclipse IDE.
2. Select "File" -> "Import" -> "Existing Maven Projects".
3. Browse to the project directory and select it.
4. Click "Finish".

## How to Run

To run the game, follow these steps:

Run the 'App.java'(src/main/java) file as a Java application to start the game.

Right click on App.java class => Run as => select Java Application

## How to Play

1. Two players are created with initial attributes (health, strength, and attack).
2. Players take turns attacking and defending.
3. Each player rolls a 6-sided die for attack and defense.
4. Damage is calculated based on the dice rolls and player attributes.
5. The game continues until one player's health reaches 0.


## Unit Tests
Unit tests are provided to ensure the correctness of the code.

##Steps to do Unit Testing:
Right click on Testing class Name => Run as => select Junit Test Case =>It will show Unit Test cases
