package com.bjorav.ovinger.commands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeWordsTextCommandTest {

    @Test
    void testExecute() {
        assertEquals("Text To Be Capitalized",new CapitalizeWordsTextCommand()
                .execute("text to be capitalized"));
    }
}