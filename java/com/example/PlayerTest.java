package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    private Player player;

    @BeforeEach
    public void setUp() {
        player = new Player("John");
    }

    @Test
    public void testGetName() {
        Assertions.assertEquals("John", player.getName());
    }

    @Test
    public void testGetScore() {
        Assertions.assertEquals(0, player.getScore());
    }

    @Test
    public void testServeBall() {
        // Add your test logic here
    }

    @Test
    public void testReturnBall() {
        // Add your test logic here
    }

    @Test
    public void testIncreaseScore() {
        // Add your test logic here
    }
}
