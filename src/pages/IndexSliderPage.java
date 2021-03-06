
package pages;

import framework.Helper;
import framework.Page;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class IndexSliderPage extends Page{
    
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
        clickOnElement(By.id("new_indexSlide_submit"));
    }
    
    private void clickOnCancelDeleteButton(){
        clickOnElement(By.cssSelector("div.modal-footer button.btn.btn-default"));
    }
    
    private void clickOnAddNewIndexSlide(){
        clickOnElement(By.linkText("Add index Slide"));
    }
    
    private void clickOnEditButton(WebElement row){
        clickOnElement(row.findElement(By.cssSelector("a[title='edit']")));
    }
    
    private void clickOnDisableButton(WebElement row){
        clickOnElement(row.findElement(By.cssSelector("button[title='disable']")));
    }
    
    private void clickOnConfirmDisableButton(){
        clickOnElement(By.id("disable-warning-dialog"));
    }
    
    private void clickOnDeleteButton(WebElement row){
        clickOnElement(row.findElement(By.cssSelector("button[title='delete']")));
    }
    
    private void clickOnConfirmDeleteButton(){
        clickOnElement(By.cssSelector("div.modal-footer button.btn.btn-danger"));
    }
    
    private void sendTextOnFieldWithClearChoose(String optionId) {
        sendTextOnField(By.id(optionId));
    }
    
    private void sendTextOnFieldWithClearLabel(String optionId){
        sendTextOnFieldLabel(By.id(optionId));
    }
    
//    --Link Methods--
    
    private void clickOnLinkSelect(String optionValue){
        clickOnElement(By.cssSelector("#link_type option[value='" + optionValue + "']"));
    }
    
    private void clickOnFileForNoLink(){
        getDriver().findElement(By.id("index_slide_photo")).sendKeys("C:\\Users\\PC\\Desktop\\workspace\\EcoCMS\\Eco-friendly.jpg");
    }
    
    private void clickOnFileForSitemapPageLink(){
        getDriver().findElement(By.id("index_slide_photo")).sendKeys("C:\\Users\\PC\\Desktop\\workspace\\EcoCMS\\Sitemap.jpg");
    }
    
    private void clickOnFileForInternalLink(){
        getDriver().findElement(By.id("index_slide_photo")).sendKeys("C:\\Users\\PC\\Desktop\\workspace\\EcoCMS\\Internal.jpg");
    }
    
    private void clickOnFileForExternalLink(){
       getDriver().findElement(By.id("index_slide_photo")).sendKeys("C:\\Users\\PC\\Desktop\\workspace\\EcoCMS\\External.jpg");
    }
    
    private void chooseNoLink(){
        clickOnLinkSelect("NoLink");
        clickOnFileForNoLink();
    }
    
    private void chooseSitemapPage(){
        clickOnLinkSelect("SitemapPage");
        sendTextOnFieldWithClearChoose("link_label");
        clickOnFileForSitemapPageLink();
    }
    
    private void chooseInternalLink(){
        clickOnLinkSelect("InternalLink");
        sendTextOnFieldWithClearChoose("link_label");
        clickOnFileForInternalLink();
    }
    
    private void chooseExternalLink(){
        clickOnLinkSelect("ExternalLink");
        sendTextOnFieldWithClearLabel(("link_label"));
        sendTextOnFieldUrl(By.id("external_link_url"));
        clickOnFileForExternalLink();
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

//        WebElement lastRow = rows.get(rows.size() - 1);
//        return lastRow;
        return rows.get(rows.size() - 1);
    }
    
//    --CommonSlider Methods--
    
    private void commonEditFirstSlider(){
        WebElement firstRow = chooseFirstRow();
        clickOnEditButton(firstRow);
        sendTextOnFieldWithClearChoose("title");
        sendTextOnFieldWithClearChoose("description");
    }
    
    private void commonEditRandomSlider(){
        WebElement randomRow = chooseRandomRow();
        clickOnEditButton(randomRow);
        sendTextOnFieldWithClearChoose("title");
        sendTextOnFieldWithClearChoose("description");
    }
    
    private void commonEditLastSlider(){
        WebElement lastRow = chooseLastRow();
        clickOnEditButton(lastRow);
        sendTextOnFieldWithClearChoose("title");
        sendTextOnFieldWithClearChoose("description");
    }
    
    private void commonAddNewIndexSlide(){
        clickOnAddNewIndexSlide();
        sendTextOnFieldWithClearChoose("title");
        sendTextOnFieldWithClearChoose("description");
    }
    
//    --PUBLIC METHODS--
    
//    --FirstSlider--
    public void editFirstSliderWithNoLink(){
        commonEditFirstSlider();
        chooseNoLink();
        clickOnSaveButton();
    }
     
    public void editFirstSliderWithSitemapPageLink(){
        commonEditFirstSlider();
        chooseSitemapPage();
        clickOnSaveButton();
    }
    
    public void editFirstSliderWithInternalLink(){
        commonEditFirstSlider();
        chooseInternalLink();
        clickOnSaveButton();
    }
    
    public void editFirstSliderWithExternalLink(){
        commonEditFirstSlider();
        chooseExternalLink();
        clickOnSaveButton();
    }
    
//    --RandomSlider--
    public void editRandomSliderWithNoLink(){
        commonEditRandomSlider();
        chooseNoLink();
        clickOnSaveButton();
    }
    
    public void editRandomSliderWithSitemapPageLink(){
        commonEditRandomSlider();
        chooseSitemapPage();
        clickOnSaveButton();
    }
    
    public void editRandomSliderWithInternalLink(){
        commonEditRandomSlider();
        chooseInternalLink();
        clickOnSaveButton();
    }
    
    public void editRandomSliderWithExternalLink(){
        commonEditRandomSlider();
        chooseExternalLink();
        clickOnSaveButton();
    }
    
//    --LastSlider--
    public void editLastSliderWithNoLink(){
        commonEditLastSlider();
        chooseNoLink();
        clickOnSaveButton();
    }
    
    public void editLastSliderWithSitemapPageLink(){
        commonEditLastSlider();
        chooseSitemapPage();
        clickOnSaveButton();
    }

    public void editLastSliderWithInternalLink(){
        commonEditLastSlider();
        chooseInternalLink();
        clickOnSaveButton();
    }

    public void editLastSliderWithExternalLink(){
        commonEditLastSlider();
        chooseExternalLink();
        clickOnSaveButton();
    }

//    --Disable Methods--
    
    public void disableFirstSlider(){
        WebElement firstRow = chooseFirstRow();
        clickOnDeleteButton(firstRow);
        clickOnConfirmDisableButton();
    }
    
    public void disableRandomSlider(){
        WebElement randomRow = chooseRandomRow();
        clickOnDisableButton(randomRow);
        clickOnConfirmDisableButton();
    }
    
    public void disableLastSlider(){
        WebElement lastRow = chooseLastRow();
        clickOnDisableButton(lastRow);
        clickOnConfirmDisableButton();
    }
    
//  --DeleteSlider Methods--
    
    public void deleteFirstSlider(){
        WebElement firstRow = chooseFirstRow();
        clickOnDeleteButton(firstRow);
        clickOnConfirmDeleteButton();
    }
    
    public void deleteRandomSlider(){
        WebElement randomRow = chooseRandomRow();
        clickOnDeleteButton(randomRow);
        clickOnConfirmDeleteButton();
    }
    
    public void deleteLastSlider(){
        WebElement lastRow = chooseLastRow();
        clickOnDeleteButton(lastRow);
        clickOnConfirmDeleteButton();
    }
    
    public void cancelDeleteSlider(){
        WebElement lastRow = chooseLastRow();
        clickOnDeleteButton(lastRow);
        clickOnCancelDeleteButton();
    }

// --Save New Order--

    public void saveNewOrder(){
        clickOnChangeOrder();
        clickOnSaveOrder();
    }
    
//  --Cancel New Order--
    
    public void cancelNewOrder(){
        clickOnChangeOrder();
        clickOnCancel();
    }

// --AddNewSlide Mwthods--

    public void addNewIndexSlideWithNoLink(){
        commonAddNewIndexSlide();
        chooseNoLink();
        clickOnSaveButton();
    }
    
    public void addNewIndexSlideWithSitemapPageLink(){
        commonAddNewIndexSlide();
        chooseSitemapPage();
        clickOnSaveButton();
    }
    
    public void addNewIndexSlideWithInternalLink(){
        commonAddNewIndexSlide();
        chooseInternalLink();
        clickOnSaveButton();
    }
    
    public void addNewIndexSlideWithExternalLink(){
        commonAddNewIndexSlide();
        chooseExternalLink();
        clickOnSaveButton();
    }
    
}
