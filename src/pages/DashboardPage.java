
package pages;

import framework.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends Page{
    
//    --Admin and Users ProfileClicks--
    
    public void goToAdminLog(){
        clickOnElement(By.cssSelector("a.dropdown-toggle"));
    }

    public void editProfile(){
        clickOnElement(By.linkText("Edit Profile"));
    }
    
    public void changePassword(){
        clickOnElement(By.linkText("Change Password"));
    }
    
    public void logOut(){
        clickOnElement(By.linkText("Logout"));
    }
    
    public void goToUser(){
        clickOnElement(By.linkText("Users"));
    }

    public void goToPortfolios(){
        clickOnElement(By.linkText("Portfolios"));
    }
    
    public void goToViewLive(){
        clickOnElement(By.linkText("View Live"));
    }
    
//  --goToOtherPages--
    
    public IndexSliderPage goToIndexSliderPage(){
        clickOnElement(By.linkText("Index Slider"));
        return PageFactory.initElements(getDriver(), IndexSliderPage.class);
    }
    
    public PhotoGalleriesPage goToPhotoGalleriesPage(){
        clickOnElement(By.linkText("Photo Galleries"));
        return PageFactory.initElements(getDriver(), PhotoGalleriesPage.class);
    }
    
    public SitemapPage goToSitemapPage(){
        clickOnElement(By.linkText("Sitemap"));
        return PageFactory.initElements(getDriver(), SitemapPage.class);
   }
   
    public FilemanagerPage goToFilemanagerPage(){
        clickOnElement(By.linkText("Filemanager"));
        return PageFactory.initElements(getDriver(), FilemanagerPage.class);
   }
   
    public AllUsersPage goToAllUsersPage(){
        clickOnElement(By.linkText("All Users"));
        return PageFactory.initElements(getDriver(), AllUsersPage.class);
    }
    
    public NewUserPage goToNewUserPage(){
        clickOnElement(By.linkText("New User"));
         return PageFactory.initElements(getDriver(), NewUserPage.class);
    }
    
    public AllPortfoliosPage goToAllPortfolios(){
        clickOnElement(By.linkText("All Portfolios"));
        return PageFactory.initElements(getDriver(), AllPortfoliosPage.class);
    }
    
    public NewPortfolioPage goToNewPortfolio(){
        clickOnElement(By.linkText("New Portfolio"));
        return PageFactory.initElements(getDriver(), NewPortfolioPage.class);
    }
   
    public CategoriesPage goToCategories(){
        clickOnElement(By.linkText("Categories"));
        return PageFactory.initElements(getDriver(), CategoriesPage.class);
    }
    
    public ContactInfoPage goToContactInfoPage(){
        clickOnElement(By.linkText("Contact Info"));
        return PageFactory.initElements(getDriver(), ContactInfoPage.class);
    }
      
}
