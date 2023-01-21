package ru.stw.tests;

import org.testng.annotations.*;

public class GroupDeletionsTests extends TestBase {

  @Test
  public void testUntitled() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();  }


}
