package com.bjorav.ovinger.commands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrapTextCommandTest {
    @Test
    void testExecute() {
        assertEquals("<p>text to be wrapped</p>",new WrapTextCommand("<p>", "</p>").execute("text to be wrapped")
        );
    }
}