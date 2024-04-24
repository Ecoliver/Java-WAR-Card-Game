Java WAR Card Game

Description
This project is an implementation of the classic card game "WAR" in Java. The game simulates a simple two-player card game where each player draws cards from their deck, compares them, and the player with the higher card wins the round. The goal is to collect all the cards or to win by having the most cards after a certain number of rounds.

Table of Contents
- [Description](#description)
- [Features](#features)
- [How to Play](#how-to-play)
- [Installation](#installation)
- [Usage](#usage)

Features
- Simulates the classic "WAR" card game with two players.
- Randomly shuffles and distributes a standard deck of 52 playing cards between the players.
- Implements the rules of the game, including comparing cards, resolving ties, and determining the winner of each round.
- Tracks the number of rounds played and displays the winner at the end of the game.
- Provides an option to play multiple rounds or until one player collects all the cards.

How to Play
The game follows the basic rules of the "WAR" card game:

1. Each player is dealt half of the shuffled deck, face down.
2. Both players reveal the top card of their deck simultaneously.
3. The player with the higher card wins the round and collects both cards, placing them at the bottom of their deck.
4. In case of a tie (i.e., both players draw cards of the same rank), a "WAR" occurs:
   - Each player places three additional cards face down and then reveals a fourth card.
   - The player with the higher fourth card wins all the cards in the war.
5. The game continues until one player collects all the cards or until a predetermined number of rounds is reached.

Installation
1. Clone this repository to your local machine.
2. Ensure you have Java Development Kit (JDK) installed.
3. Compile the Java files using a Java compiler.
   ```
   javac *.java
   ```
4. Create a WAR (Web ARchive) file using the compiled classes.
   ```
   jar -cvf WarGame.war *
   ```

 Usage
1. Deploy the WAR file to a Java servlet container, such as Apache Tomcat.
2. Access the deployed application through a web browser.
3. Follow the on-screen instructions to play the game.
