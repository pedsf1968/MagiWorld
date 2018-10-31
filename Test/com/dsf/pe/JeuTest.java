package com.dsf.pe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JeuTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(System.out);
    }

    @Test
    public void Given_MessageAndRangeMinMax_Then_AskSomething_ThenReturnGoodValue(){
        System.setIn(new ByteArrayInputStream("20\n".getBytes()));
        Jeu jeu = new Jeu();
        int result = jeu.askSomething("Affichage message", 10,30);
        String[] output = outContent.toString().replace("\r\n", "\n").split("\n");
        assertEquals("Affichage message", output[0]);
        assertTrue(result>=10 && result<=30 );
    }

    @Test
    public void Given_MessageAndRangeMinMax_Then_AskSomethingOutOfRange_ThenReturnGoodValue() {
        System.setIn(new ByteArrayInputStream("40\n20\n".getBytes()));
        Jeu jeu = new Jeu();
        int result = jeu.askSomething("Affichage message", 10,30);
        String[] output = outContent.toString().replace("\r\n", "\n").split("\n");
        assertEquals("Affichage message", output[0]);
        assertTrue(result>=10 && result<=30 );
    }
}
