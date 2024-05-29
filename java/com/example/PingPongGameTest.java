package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PingPongGameTest {
    private PingPongGame game;
    private Player player1;
    private Player player2;

    @BeforeEach
    public void setUp() {
        player1 = new Player("Player 1");
        player2 = new Player("Player 2");
        game = new PingPongGame(player1, player2, 5);
    }

    @Test
    public void testStartGame() {
        game.startGame();
        // Add assertions to verify the game has started correctly
    }

    @Test
    public void testPlayer1Scores() {
        game.startGame();
        game.player1Scores();
        // Add assertions to verify player 1's score has increased
    }

    @Test
    public void testPlayer2Scores() {
        game.startGame();
        game.player2Scores();
        // Add assertions to verify player 2's score has increased
    }

    @Test
    public void testCheckWinner() {
        game.startGame();
        // Simulate a game where player 1 wins
        for (int i = 0; i < 5; i++) {
            game.player1Scores();
        }
        // Add assertions to verify player 1 is the winner
    }
}
