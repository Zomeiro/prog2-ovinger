package com.bjorav.ovinger.commands;

public class ReplaceFirstTextCommand extends ReplaceTextCommand {

  public ReplaceFirstTextCommand(String target, String replacement) {
    super(target, replacement);
  }

  @Override
  public String execute(String text) {
    return text.replaceFirst(getTarget(), getReplacement());
  }
}