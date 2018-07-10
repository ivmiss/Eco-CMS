
package pages;

import framework.Helper;
import framework.Page;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class PhotoGalleriesPage extends Page{
    
//    --Private Methods--
    
    private void clickOnChangeOrder(){
            clickOnElement(By.cssSelector("div.panel-heading div.btn-group button.btn.btn-default"));
    }
    
    private void clickOnSaveOrder(){
            clickOnElement(By.cssSelector("div.panel-heading div.btn-group button.btn.btn-success"));
    }
    
    private void clickOnCancel(){
            clickOnElement(By.cssSelector("div.btn-group button.btn.btn-default.active"));
    }
    
    private void clickOnSaveButton(){
            clickOnElement(By.id("new_photoGallery_submit"));
    }
    
    private void clickOnAddNewIndexSlide(){
            clickOnElement(By.linkText("Add photoGallery"));
    }
    
    private void clickOnEditButton(WebElement row){
            clickOnElement(row.findElement(By.cssSelector("a[title='edit']")));
    }
    
    private void clickOnDisableButton(WebElement row){
            clickOnElement(row.findElement(By.cssSelector("button[title='disable']")));
    }
    
    private void clickOnConfirmDisableButton(){
            clickOnElement(By.cssSelector("#disable-warning-dialog div.modal-footer button.btn.btn-danger"));
    }
    
    private void clickOnCancelDisableButton(){
            clickOnElement(By.cssSelector("#disable-warning-dialog div.modal-footer button.btn.btn-default"));
    }
    
    private void clickOnDeleteButton(WebElement row){
            clickOnElement(row.findElement(By.cssSelector("button[title='delete']")));
    }
    
    private void clickOnConfirmDeleteButton(){
            clickOnElement(By.cssSelector("div.modal-footer button.btn.btn-danger"));
    }
    
    private void clickOnLeadingPhoto(){
        getDriver().findElement(By.id("photo_gallery_leading_photo")).sendKeys("C:\\Users\\PC\\Desktop\\workspace\\EcoCMS\\LeadingPhoto.jpg");
    }
    
    private void sendTextOnFieldWithClearChoose(String optionId) {
            sendTextOnField(By.id(optionId));
    }
    
//    --Table Methods--
    
    private List<WebElement> getRowsFromTable() {
        WebElement tableBody = waitForElementVisibility(By.cssSelector("#rows-table tbody"));
        List<WebElement> rows = tableBody.findElements(By.tagName("tr"));

        System.out.println("Number of rows: " + rows.size());

        return rows;
    }
    
    private WebElement chooseFirstRow() {
        List<WebElement> rows = getRowsFromTable();

        WebElement firstRow = rows.get(0);

        return firstRow;
    }

    private WebElement chooseRandomRow() {
        List<WebElement> rows = getRowsFromTable();

        WebElement randomRow = rows.get(Helper.getRandomIntiger(rows.size()));

        return randomRow;
    }

    private WebElement chooseLastRow() {
        List<WebElement> rows = getRowsFromTable();
        
        return rows.get(rows.size() - 1);
    }
    
//   --PUBLIC METHODS--
    
    public void editFirstPhoto(){
       WebElement firstRow = chooseFirstRow();
       clickOnEditButton(firstRow);
       sendTextOnFieldWithClearChoose("title");
       sendTextOnFieldWithClearChoose("description");
       clickOnLeadingPhoto();
       clickOnSaveButton();
    }
    
    public void editRandomPhoto(){
       WebElement randomRow = chooseRandomRow();
       clickOnEditButton(randomRow);
       sendTextOnFieldWithClearChoose("title");
       sendTextOnFieldWithClearChoose("description");
       clickOnLeadingPhoto();
       clickOnSaveButton();
    }
    
    public void editLastPhoto(){
       WebElement lastRow = chooseLastRow();
       clickOnEditButton(lastRow);
       sendTextOnFieldWithClearChoose("title");
       sendTextOnFieldWithClearChoose("description");
       clickOnLeadingPhoto();
       clickOnSaveButton();
    }
}
