# Bowling Rules
The game consists of 10 frames. In each frame the player has two rolls to knock down 10 pins. The score for the frame is the total number of pins knocked down, plus bonuses for strikes and spares.

A spare is when the player knocks down all 10 pins in two rolls. The bonus for that frame is the number of pins knocked down by the next roll.

A strike is when the player knocks down all 10 pins on his first roll. The frame is then completed with a single roll. The bonus for that frame is the value of the next two rolls.

In the tenth frame a player who rolls a spare or strike is allowed to roll the extra balls to complete the frame. However no more than three balls can be rolled in tenth frame.

## Requirements
All code should be implemented using TDD.
Write a class Game that has two methods

- void roll(int) is called each time the player rolls a ball. The argument is the number of pins knocked down.
- int score() returns the total score for that game.


Advance Content: Add a way to visualize your frames. This can be through the score method or using a new method you create.

## Setup

    git clone https://github.com/gSchool/afc-java-bowling
    cd afc-java-bowling

Open as preexisting project in your favorite IDE and choose between gradle or maven nature

## (optional) IDE Setup

Run `./gradlew idea` to build [idea](https://www.jetbrains.com/idea) project.

## Running Tests

To execute the tests either run `./gradlew test`, `mvn test` or run the tests from the IDE you are using

## Test Libraries Available from the Get-Go
- [JUnit 5.7.2](https://junit.org/junit5/docs/snapshot/release-notes/#release-notes-5.7.2)
- [AssertJ 3.19.0](https://assertj.github.io/doc/#assertj-core-3-19-0-release-notes)
- [Mockito 3.10.0](https://github.com/mockito/mockito/releases)

Have fun!
