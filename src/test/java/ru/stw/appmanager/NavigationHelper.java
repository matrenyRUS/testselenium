package ru.stw.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelpBase{


  public NavigationHelper(WebDriver wd) {

    super(wd);
  }

  public void gotoGroupPage() {
click(By.linkText("groups"));
  }
}
