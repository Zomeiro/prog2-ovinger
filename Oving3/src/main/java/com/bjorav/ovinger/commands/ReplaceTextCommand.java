package com.bjorav.ovinger.commands;

public class ReplaceTextCommand implements TextCommand {
   String target;
   String replacement;

  public ReplaceTextCommand(String target, String replacement) {
    this.target = target;
    this.replacement = replacement;
  }

  @Override
  public String execute(String text) {
    return text.replace(target, replacement);
  }
}
