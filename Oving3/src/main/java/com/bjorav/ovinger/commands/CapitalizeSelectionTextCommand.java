package com.bjorav.ovinger.commands;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {

  private String selection;

  public CapitalizeSelectionTextCommand(String selection) {
    this.selection = selection;
  }

  @Override
  public String execute(String text) {
    return text.replace(selection, super.execute(selection));
  }

}