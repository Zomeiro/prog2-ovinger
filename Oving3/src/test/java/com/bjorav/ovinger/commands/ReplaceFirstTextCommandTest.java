package com.bjorav.ovinger.commands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceFirstTextCommandTest {

    @Test
    void testExecute() {
        assertEquals("text with replacement and target",new ReplaceFirstTextCommand("target", "replacement")
                .execute("text with target and target")
        );
    }
}