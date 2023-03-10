package ru.stw.model;

public class GrougData {
  private final String name;
  private final String header;
  private final String footer;

  public GrougData(String name, String header, String footer) {
    this.name = name;
    this.header = header;
    this.footer = footer;
  }

  public String getName() {
    return name;
  }

  public String getHeader() {
    return header;
  }

  public String getFooter() {
    return footer;
  }
}
