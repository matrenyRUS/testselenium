package ru.stw.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stw.model.GrougData;

public class GroupHelper extends HelpBase {

  public GroupHelper(WebDriver wd) {
    super(wd);
  }

  public void returnToGroupPage() {
    click(By.linkText("Logout"));
  }

  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  public void fillGroupForm(GrougData grougData) {
    type(By.name("group_name"), grougData.getName());
    type(By.name("group_header"), grougData.getHeader());
    type(By.name("group_footer"), grougData.getFooter());
  }

  public void initGroupCreation() {
    click(By.name("new"));
  }

  public void deleteSelectedGroups() {
    click(By.name("delete"));
  }

  public void selectGroup() {
    click(By.name("selected[]"));
  }

  public void initGroupModification() {
 click(By.name("edit"));
  }

  public void submitGroupModification() {
    click(By.name("update"));
  }
}
