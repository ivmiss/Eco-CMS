
package pages;

import static framework.Configuration.adminPanelLogin;
import static framework.Configuration.adminPassword;
import static framework.Configuration.adminUsername;
import framework.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends Page{
    
      public DashboardPage logIn(){
        WebDriver drajver = getDriver();
        drajver.get(adminPanelLogin);
        sendTextOnField(By.name("username"), adminUsername);
        sendTextOnField(By.name("password"), adminPassword);   
        clickOnElement(By.className("btn-success"));
    
       return PageFactory.initElements(getDriver(), DashboardPage.class);
    }
}
