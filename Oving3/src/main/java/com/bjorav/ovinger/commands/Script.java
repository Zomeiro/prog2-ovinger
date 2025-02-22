package com.bjorav.ovinger.commands;
import java.util.List;

public class Script implements TextCommand {
  private List<TextCommand> commands;

  public Script(List<TextCommand> commands) {
    this.commands = commands;
  }

  @Override
  public String execute(String text) {
    String result = text;
    for (TextCommand command : commands) {
      result = command.execute(result);
    }
    return result;
  }
}