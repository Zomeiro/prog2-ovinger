package com.bjorav.ovinger.commands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrapLinesTextCommandTest {

    @Test
    void testExecute() {
        assertEquals("<p>first line</p>\n<p>second line</p>",new WrapLinesTextCommand("<p>", "</p>").execute("first line\nsecond line")
        );
    }
}