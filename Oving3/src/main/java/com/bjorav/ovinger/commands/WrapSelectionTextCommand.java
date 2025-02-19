package com.bjorav.ovinger.commands;

public class WrapSelectionTextCommand extends WrapTextCommand {
  private String selection;

  public WrapSelectionTextCommand(String opening, String end, String selection) {
    super(opening, end);
    this.selection = selection;
  }

  @Override
  public String execute(String text) {
    return text.replace(selection, getOpening() + selection + getEnd());
  }

}