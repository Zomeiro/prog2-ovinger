package com.bjorav.ovinger.commands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeSelectionTextCommandTest {

    @Test
    void testExecute() {
        assertEquals("text with Selection and another Selection",new CapitalizeSelectionTextCommand("selection")
                .execute("text with selection and another selection"));
    }
}