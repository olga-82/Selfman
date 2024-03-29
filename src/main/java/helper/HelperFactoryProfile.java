package helper;

import dto.Availability;
import dto.FactoryDTO;
import dto.Yes_No;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.Reader;

import java.time.Duration;

import static utils.Reader.getProperty;


public class HelperFactoryProfile extends HelperBase implements HelperNavigation{
    public HelperFactoryProfile(WebDriver driver) {
        super(driver);
    }
    Logger logger= LoggerFactory.getLogger(HelperFactoryProfile.class);

    public void editProfileFactory(FactoryDTO factory) {
        UploadFoto("INPUT_AVATAR","PATH_FOTO");
        fillCompanyNameField(factory);
        fillCountryField(factory);
        fillCityField(factory);
        fillEmailField(factory);
        fillWebsiteField(factory);
        fillFacebookField(factory);
        fillInstagramField(factory);
        fillLinkedinField(factory);
        selectAvailability(Availability.NEXT_MONTH);
        fillIndustryField(factory);
        removeAllKeywords("KEYWORDS", "DELETE_KEYWORDS");
        fillKeywordsField(factory.getKeywords());
        fillAboutField(factory);
        fillFoundedField(factory);
        fillLanguagesField(factory);
        fillShippingToField(factory);
        fillPaymentTermsField(factory);
        selectCheckBoxCustomizationCapacity(Yes_No.NO);
        selectCheckBoxRDCapacity(Yes_No.YES);
        selectCheckBoxSpecialPacking(Yes_No.NO);
        selectCheckBoxWhiteLabel(Yes_No.YES);
        selectCheckBoxCertification(Yes_No.NO);
        selectCheckBoxSample(Yes_No.YES);
    }

    public void ClickButtonEditProfile() {
        click(By.xpath(getProperty("EDIT_PROFILE_BUTTON")));

    }

    public void OpenSettingsPage() {
        click(By.xpath(BUTTON_SETTINGS));

    }

    public void fillCompanyNameField(FactoryDTO provider) {
        type(By.xpath(getProperty("INPUT_COMPANY_NAME")), provider.getCompany_name());
    }

    public void fillCountryField(FactoryDTO provider) {
        type(By.xpath(getProperty("INPUT_COUNTRY")), provider.getCountry());
    }

    public void fillCityField(FactoryDTO provider) {
        type(By.xpath(getProperty("INPUT_CITY")), provider.getCity());

    }

    public void fillEmailField(FactoryDTO provider) {
        type(By.xpath(getProperty("INPUT_EMAIL")), provider.getEmail());
    }

    public void fillWebsiteField(FactoryDTO provider) {
        type(By.xpath(getProperty("INPUT_WEB_SITE")), provider.getWebsite());
    }

    public void fillFacebookField(FactoryDTO provider) {
        type(By.xpath(getProperty("INPUT_FACEBOOK")), provider.getFacebook());
    }

    public void fillInstagramField(FactoryDTO provider) {
        type(By.xpath(getProperty("INPUT_INSTAGRAM")), provider.getInstagram());
    }

    public void fillLinkedinField(FactoryDTO provider) {
        type(By.xpath(getProperty("INPUT_LINKEDIN")), provider.getLinkedin());

    }

    public void selectAvailability(Availability availability) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        switch (availability) {
            case NOW:

                js.executeScript("document.querySelector('#root > div.sc-bdfCDU.ctpicw > div.sc-gsTDqH.ftZrOe > div:nth-child(3) > div:nth-child(5) > div > div:nth-child(1) > div > div').click();");
                break;
            case NEXT_WEEK :

               js.executeScript("document.querySelector('#root > div.sc-bdfCDU.ctpicw > div.sc-gsTDqH.ftZrOe > div:nth-child(3) > div:nth-child(5) > div > div:nth-child(2) > div > div').click();");
                break;
            case NEXT_MONTH :

                js.executeScript("document.querySelector('#root > div.sc-bdfCDU.ctpicw > div.sc-gsTDqH.ftZrOe > div:nth-child(3) > div:nth-child(5) > div > div:nth-child(3) > div > div').click();");
                break;

        }

    }

    public void fillIndustryField(FactoryDTO provider) {
        type(By.xpath(getProperty("INPUT_INDUSTRY")), provider.getIndustry());
    }

    public void fillKeywordsField(String keywords) {
        String[] split = keywords.split(",");
        click(By.xpath(getProperty("INPUT_KEYWORDS")));
        for (String keyword : split) {
            driver.findElement(By.xpath(getProperty("INPUT_KEYWORDS"))).sendKeys(keyword);
            driver.findElement(By.xpath(getProperty("INPUT_KEYWORDS"))).sendKeys(Keys.ENTER);

        }
    }

    public void fillAboutField(FactoryDTO provider) {
        type(By.xpath(getProperty("INPUT_ABOUT")), provider.getAbout());
    }

    public void fillFoundedField(FactoryDTO provider) {
        type(By.xpath(getProperty("INPUT_FOUNDED")), provider.getFounded());
    }

    public void fillLanguagesField(FactoryDTO provider) {
        type(By.xpath(getProperty("INPUT_LANGUAGE")), provider.getLanguages());
    }

    public void fillShippingToField(FactoryDTO provider) {
        type(By.xpath(getProperty("INPUT_SHIPPING_TO")), provider.getShipping_to());
    }

    public void fillPaymentTermsField(FactoryDTO provider) {
        type(By.xpath(getProperty("INPUT_PAYMENTS_TERMS")), provider.getPayment_terms());
    }

    public void selectCheckBoxCustomizationCapacity(Yes_No capacity) {
        if (capacity.equals(Yes_No.YES)) {
            click(By.xpath(getProperty("CHECKBOX_CUSTOMIZATION_CAPACITY_YES")));
        } else if (capacity.equals(Yes_No.NO)) {
            click(By.xpath(getProperty("CHECKBOX_CUSTOMIZATION_CAPACITY_NO")));
        }
    }

    public void selectCheckBoxRDCapacity(Yes_No capacity) {
        if (capacity.equals(Yes_No.YES)) {
            click(By.xpath(getProperty("CHECKBOX_RD_CAPACITY_YES")));
        } else if (capacity.equals(Yes_No.NO)) {
            click(By.xpath(getProperty("CHECKBOX_RD_CAPACITY_NO")));
        }
    }

    public void selectCheckBoxSpecialPacking(Yes_No packing) {
        if (packing.equals(Yes_No.YES)) {
            click(By.xpath(getProperty("CHECKBOX_SPECIAL_PACKING_YES")));
        } else if (packing.equals(Yes_No.NO)) {
            click(By.xpath(getProperty("CHECKBOX_SPECIAL_PACKING_NO")));
        }
    }

    public void selectCheckBoxWhiteLabel(Yes_No label) {
        switch (label) {
            case YES:
                click(By.xpath(getProperty("CHECKBOX_WHITE_LABEL_YES")));
                break;
            case NO:
                click(By.xpath(getProperty("CHECKBOX_WHITE_LABEL_NO")));
                break;

        }
    }

    public void selectCheckBoxCertification(Yes_No certification) {
        switch (certification) {
            case YES :click(By.xpath(getProperty("CHECKBOX_SERTIFICATION_YES")));
            break;
            case NO :click(By.xpath(getProperty("CHECKBOX_SERTIFICATION_NO")));
            break;

        }
    }

    public void selectCheckBoxSample(Yes_No sample) {
        switch (sample) {
            case YES : click(By.xpath(getProperty("CHECKBOX_SAMPLE_YES")));
            break;
            case NO : click(By.xpath(getProperty("CHECKBOX_SAMPLE_NO")));
            break;

        }
    }

    public void clickButtonPreview() {
        click(By.xpath(getProperty("BUTTON_PREVIEW")));
    }

    public void clickButtonReturnToEditing() {
        click(By.xpath(getProperty("BUTTON_RETURN_TO_EDITTING")));
    }

    public void clickButtonSave() {
        click(By.xpath(getProperty("BUTTON_SAVE")));
    }
    public void AddProduct(FactoryDTO provider){
        clickButtonEditProduct();
        pause(2000);
        clickButtonAddProduct();
        fillNameProductField(provider);
        fillOrderQuantityField(provider);
        fillPriceyField(provider);
        pause(2000);
        UploadProductFoto();
        pause(2000);
        clickButtonSaveCompany();
        pause(2000);
        clickButtonCloseProduct();
    }
    public void AddCompany(FactoryDTO provider){
        clickButtonEditBlockCompany();
        clickButtonAddCompany();
        fillNameCompanyField(provider);
        UploadFoto("UPLOAD_FOTO", "COMPANY_FOTO");
        pause(2000);
        clickButtonSaveCompany();
        pause(2000);
       clickButtonSaveCompany();
    }

    public void clickButtonEditBlockCompany() {
        click(By.xpath(getProperty("BUTTON_ADD_COMPANY")));
    }
    public void clickButtonCloseBlockCompany(){
        click(By.xpath(getProperty("BUTTON_CLOSE_COMPANY")));
    }
    public void clickButtonAddCompany(){
        click(By.xpath(getProperty("BUTTON_OPEN_FORM_COMPANY")));
    }

    public void fillNameCompanyField(FactoryDTO provider) {
        type(By.xpath(getProperty("INPUT_NAME_COMPANY")), provider.getCompany_name());
    }
    public void clickButtonSaveCompany() {
        click(By.xpath(getProperty("BUTTON_SAVE_COMPANY")));
    }
    public void clickButtonCloseFormCompany(){
        click(By.xpath(getProperty("BUTTON_CLOSE_FORM_COMPANY")));
    }
    public void clickButtonReturnToFactoryPage(){
        click(By.xpath(getProperty("BUTTON_RETURN_BACK")));
    }


    public void clickButtonEditProduct() {
        click(By.xpath(getProperty("BUTTON_ADIT_PRODUCT")));
    }
    public void clickButtonAddProduct(){
        click(By.xpath(getProperty("BUTTON_ADD_PRODUCT")));
    }
    public void clickButtonCloseProduct(){
        click(By.xpath(getProperty("CLOSE_PRODUCT_FORM")));
    }
    public void fillNameProductField(FactoryDTO provider){
        type(By.xpath(getProperty("INPUT_NAME_PRODUCT")), provider.getProduct_name());
    }
    public void fillOrderQuantityField(FactoryDTO provider){
        type(By.xpath(getProperty("INPUT_QUANTITY_ORDER")), provider.getMin_order_quantity());
    }
    public void fillPriceyField(FactoryDTO provider){
        type(By.xpath(getProperty("INPUT_PRICE")), provider.getUnit_price());
    }
    public void UploadProductFoto (){
        WebElement uploadElement=driver.findElement(By.xpath(Reader.getProperty("UPLOAD_FOTO")));
        uploadElement.sendKeys(Reader.getProperty("PATH_FOTO"));
        pause(2000);

    }




}