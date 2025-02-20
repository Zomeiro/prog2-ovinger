package com.bjorav.ovinger.commands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeTextCommandTest {

    @Test
    void testExecute() {
        assertEquals("Text to be capitalized",new CapitalizeTextCommand()
                .execute("text to be capitalized"));
    }
}