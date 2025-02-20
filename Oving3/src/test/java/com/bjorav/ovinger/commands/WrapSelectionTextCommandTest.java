package com.bjorav.ovinger.commands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class WrapSelectionTextCommandTest {

    @Test
    void testExecute() {
    assertEquals("text with <p>selection</p>",new WrapSelectionTextCommand("<p>", "</p>", "selection").execute("text with selection"));
    }
}