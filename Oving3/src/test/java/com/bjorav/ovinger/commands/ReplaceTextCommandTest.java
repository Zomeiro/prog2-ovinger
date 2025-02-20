package com.bjorav.ovinger.commands;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReplaceTextCommandTest {

  @Test
  void testExecute() {
    assertEquals("text with replacement and replacement",new ReplaceTextCommand("target", "replacement")
        .execute("text with target and target")
    );
  }
}