package com.bjorav.ovinger.commands;

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand{

  @Override
  public String execute(String text) {
    if (text == null || text.isEmpty()) {
      return text;
    }
    StringBuilder result = new StringBuilder();
    String[] words = text.split(" ");

    for (String word : words) {
      result.append(super.execute(word)).append(" ");
    }
    return result.toString().trim();
  }
}
