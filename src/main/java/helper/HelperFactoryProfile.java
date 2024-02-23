package helper;

import dto.Availability;
import dto.FactoryDTO;
import dto.Yes_No;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utils.Reader;

import static helper.HelperNavigation.BUTTON_SETTINGS;

public class HelperFactoryProfile extends HelperBase {
    public HelperFactoryProfile(WebDriver driver) {
        super(driver);
    }

    // private final String EDIT_PROFILE_BUTTON ="//*[@id='root']//div[2]/div[3]/div[1]/button[1]";
    private final String CHANGE_PASSWORD_BUTTON = "//*[@id='root']//div[2]/div[3]/div[1]/button[2]";
    // private final String INPUT_COMPANY_NAME =" //*[@id='root']//div[2]/div[2]/div/input";
    // private final String INPUT_COUNTRY =" //*[@id='root']//div[2]/div[3]/div/input";
    // private final String INPUT_CITY =" //*[@id='root']//div[2]/div[3]/div[2]/input";
    // private final String INPUT_EMAIL =" //*[@id='root']//div[2]/div[3]/div[3]/input";
    // private final String INPUT_WEB_SITE =" //*[@id='root']//div[2]/div[3]/div[4]/div[1]/input";
//    private final String INPUT_FACEBOOK =" //*[@id='root']//div[2]/div[3]/div[4]/div[2]/input";
//    private final String INPUT_INSTAGRAM =" //*[@id='root']//div[2]/div[3]/div[4]/div[3]/input";
//    private final String INPUT_LINKEDIN =" //*[@id='root']//div[2]/div[3]/div[4]/div[4]/input";
//    private final String CHECK_BOX_AVAILABILITY_NOW =" //*[@class='sc-jxgRln JHglX']";
//    private final String CHECK_BOX_AVAILABILITY_NEXT_WEEK ="//*[@id='root']//div[2]/div[3]/div[5]/div/div[2]/div/div";
//    private final String CHECK_BOX_AVAILABILITY_NEXT_MONTH ="//*[@id='root']//div[2]/div[3]/div[5]/div/div[3]/div/div";
//    private final String INPUT_INDUSTRY = " //*[@id='root']//div[2]/div[3]/div[6]/input";
//    private final String INPUT_KEYWORDS = " //*[@id='root']//div[2]/div[3]/div[7]/input";
//    private final String INPUT_ABOUT = " //*[@id='AboutProvider']";
//    private final String INPUT_FOUNDED = "//*[@id='root']//div[2]/div[5]/div[1]/input";
//    private final String INPUT_LANGUAGE = "//*[@id='root']//div[2]/div[5]/div[2]/input";
//    private final String INPUT_SHIPPING_TO = "//*[@id='root']//div[2]/div[5]/div[3]/input";
//    private final String INPUT_PAYMENTS_TERMS = "//*[@id='root']//div[2]/div[5]/div[4]/input";
//    private final String CHECKBOX_CUSTOMIZATION_CAPACITY_YES = "//*[@id='root']/div[1]/div[2]/div[6]/div[1]/div/div[1]/div/div/div";
//    private final String CHECKBOX_CUSTOMIZATION_CAPACITY_NO = "//*[@id='root']/div[1]/div[2]/div[6]/div[1]/div/div[2]/div/div/div";
//    private final String CHECKBOX_RD_CAPACITY_YES = "//*[@id='root']/div[1]/div[2]/div[6]/div[2]/div/div[1]/div/div/div";
//    private final String CHECKBOX_RD_CAPACITY_NO = "//*[@id='root']/div[1]/div[2]/div[6]/div[2]/div/div[2]/div/div/div";
//    private final String CHECKBOX_SPECIAL_PACKING_YES = "//*[@id='root']/div[1]/div[2]/div[6]/div[3]/div/div[1]/div/div/div";
//    private final String CHECKBOX_SPECIAL_PACKING_NO = "//*[@id='root']/div[1]/div[2]/div[6]/div[3]/div/div[2]/div/div/div";
//    private final String CHECKBOX_WHITE_LABEL_YES = "//*[@id='root']/div[1]/div[2]/div[6]/div[4]/div/div[1]/div/div/div";
//    private final String CHECKBOX_WHITE_LABEL_NO = "//*[@id='root']/div[1]/div[2]/div[6]/div[4]/div/div[2]/div/div/div";
//    private final String CHECKBOX_SERTIFICATION_YES = "//*[@id='root']/div[1]/div[2]/div[6]/div[5]/div/div[1]/div/div/div";
//    private final String CHECKBOX_SERTIFICATION_NO = "//*[@id='root']/div[1]/div[2]/div[6]/div[5]/div/div[2]/div/div/div";
//    private final String CHECKBOX_SAMPLE_YES = "//*[@id='root']/div[1]/div[2]/div[6]/div[6]/div/div[1]/div/div/div";
//    private final String CHECKBOX_SAMPLE_N0 = "//*[@id='root']/div[1]/div[2]/div[6]/div[6]/div/div[2]/div/div/div";
//    private final String BUTTON_PREVIEW = " //*[@id='root']/div[1]/div[2]/div[7]/button";
//    private final String BUTTON_RETURN_TO_EDITTING = "//*[@id='root']/div[1]/div[2]/div[2]/div[1]/button";
//    private final String BUTTON_SAVE = "//*[@id='root']/div[1]/div[2]/div[2]/div[2]/button";


    //div[@class='sc-iQviOx hkGxeg']//div[@class='sc-fePcEy cZfHCq']//*[name()='svg'] edit product
    //div[@class='sc-iQviOx hkGxeg']//div[@class='sc-iaEFAN iNUINm']//*[name()='svg']
    //*[@id="root"]/div[1]/div[2]/div[3]/div[2]/div[1]/div/div[1] add product
    //div[@class='sc-iOTpNu kjTrFZ']//*[name()='svg'] close product

    //input[@value='No name product'] name product
    //*[@id="root"]/div[1]/div[2]/div[3]/div[2]/div[1]/div/div[3]/div[4]/input quantity
    //*[@id="root"]/div[1]/div[2]/div[3]/div[2]/div[1]/div/div[3]/div[5]/input prise
    //button[@class='sc-iyjcSV lkrIHE'] upload foto
    //div[@class='sc-iOTpNu kjTrFZ']//*[name()='svg'] clouse form

    //div[@class='sc-HUpva nvGQK']//div[@class='sc-fePcEy cZfHCq']//*[name()='svg'] add company
    //div[@class='sc-iOTpNu kjTrFZ']//*[name()='svg'] close company
    //div[@class='sc-HUpva nvGQK']//div[@class='sc-iaEFAN iNUINm'] open form
    //input[@value='No name photo'] add foto
    //button[@class='sc-iyjcSV lkrIHE'] upload foto
    //div[@class='sc-HUpva nvGQK']//div[@class='sc-fePcEy cZfHCq']//*[name()='svg'] close form comp
    //button[normalize-space()='Save']  button save compani

    //*[@id="root"]/div[1]/div[2]/div[1]/button return to

    public void ClickButtonEditProfile() {
        click(By.xpath(Reader.getProperty("EDIT_PROFILE_BUTTON")));

    }

    public void OpenSettingsPage() {
        click(By.xpath(BUTTON_SETTINGS));

    }

    public void fillCompanyNameField(FactoryDTO provider) {
        type(By.xpath(Reader.getProperty("INPUT_COMPANY_NAME")), provider.getCompany_name());
    }

    public void fillCountryField(FactoryDTO provider) {
        type(By.xpath(Reader.getProperty("INPUT_COUNTRY")), provider.getCountry());
    }

    public void fillCityField(FactoryDTO provider) {
        type(By.xpath(Reader.getProperty("INPUT_CITY")), provider.getCity());

    }

    public void fillEmailField(FactoryDTO provider) {
        type(By.xpath(Reader.getProperty("INPUT_EMAIL")), provider.getEmail());
    }

    public void fillWebsiteField(FactoryDTO provider) {
        type(By.xpath(Reader.getProperty("INPUT_WEB_SITE")), provider.getWebsite());
    }

    public void fillFacebookField(FactoryDTO provider) {
        type(By.xpath(Reader.getProperty("INPUT_FACEBOOK")), provider.getFacebook());
    }

    public void fillInstagramField(FactoryDTO provider) {
        type(By.xpath(Reader.getProperty("INPUT_INSTAGRAM ")), provider.getInstagram());
    }

    public void fillLinkedinField(FactoryDTO provider) {
        type(By.xpath(Reader.getProperty("INPUT_LINKEDIN")), provider.getLinkedin());

    }

    public void selectAvailability(Availability availability) {
        switch (availability) {
            case NOW -> click(By.xpath(Reader.getProperty("CHECK_BOX_AVAILABILITY_NOW ")));
            case NEXT_WEEK -> click(By.xpath(Reader.getProperty("CHECK_BOX_AVAILABILITY_NEXT_WEEK")));
            case NEXT_MONTH -> click(By.xpath(Reader.getProperty("CHECK_BOX_AVAILABILITY_NEXT_MONTH ")));

        }

    }

    public void fillIndustryField(FactoryDTO provider) {
        type(By.xpath(Reader.getProperty("INPUT_INDUSTRY")), provider.getIndustry());
    }

    public void fillKeywordsField(String keywords) {
        String[] split = keywords.split(",");
//        JavascriptExecutor js = (JavascriptExecutor) wd;
//        js.executeScript("document.querySelector('#subjectsInput').click();");

        click(By.xpath(Reader.getProperty("INPUT_KEYWORDS")));
        for (String keyword : split) {
            driver.findElement(By.xpath(Reader.getProperty("INPUT_KEYWORDS"))).sendKeys(keyword);
            driver.findElement(By.xpath(Reader.getProperty("INPUT_KEYWORDS"))).sendKeys(Keys.ENTER);

        }
    }

    public void fillAboutField(FactoryDTO provider) {
        type(By.xpath(Reader.getProperty("INPUT_ABOUT")), provider.getAbout());
    }

    public void fillFoundedField(FactoryDTO provider) {
        type(By.xpath(Reader.getProperty("INPUT_FOUNDED")), provider.getFounded());
    }

    public void fillLanguagesField(FactoryDTO provider) {
        type(By.xpath(Reader.getProperty("INPUT_LANGUAGE")), provider.getLanguages());
    }

    public void fillShippingToField(FactoryDTO provider) {
        type(By.xpath(Reader.getProperty("INPUT_SHIPPING_TO")), provider.getShipping_to());
    }

    public void fillPaymentTermsField(FactoryDTO provider) {
        type(By.xpath(Reader.getProperty("INPUT_PAYMENTS_TERMS ")), provider.getPayment_terms());
    }

    public void selectCheckBoxCustomizationCapacity(Yes_No capacity) {
        if (capacity.equals(Yes_No.YES)) {
            click(By.xpath(Reader.getProperty("CHECKBOX_CUSTOMIZATION_CAPACITY_YES")));
        } else if (capacity.equals(Yes_No.NO)) {
            click(By.xpath(Reader.getProperty("CHECKBOX_CUSTOMIZATION_CAPACITY_NO")));
        }
    }

    public void selectCheckBoxRDCapacity(Yes_No capacity) {
        if (capacity.equals(Yes_No.YES)) {
            click(By.xpath(Reader.getProperty("CHECKBOX_RD_CAPACITY_YES")));
        } else if (capacity.equals(Yes_No.NO)) {
            click(By.xpath(Reader.getProperty("CHECKBOX_RD_CAPACITY_NO")));
        }
    }

    public void selectCheckBoxSpecialPacking(Yes_No packing) {
        if (packing.equals(Yes_No.YES)) {
            click(By.xpath(Reader.getProperty("CHECKBOX_SPECIAL_PACKING_YES")));
        } else if (packing.equals(Yes_No.NO)) {
            click(By.xpath(Reader.getProperty("CHECKBOX_SPECIAL_PACKING_NO")));
        }
    }

    public void selectCheckBoxWhiteLabel(Yes_No label) {
        switch (label) {
            case YES -> click(By.xpath(Reader.getProperty("CHECKBOX_WHITE_LABEL_YES")));
            case NO -> click(By.xpath(Reader.getProperty("CHECKBOX_WHITE_LABEL_NO")));

        }
    }
    public void selectCheckBoxCertification(Yes_No certification) {
        switch (certification) {
            case YES -> click(By.xpath(Reader.getProperty("CHECKBOX_SERTIFICATION_YES")));
            case NO -> click(By.xpath(Reader.getProperty("CHECKBOX_SERTIFICATION_NO")));

        }
    }
    public void selectCheckBoxSample(Yes_No sample) {
        switch (sample) {
            case YES -> click(By.xpath(Reader.getProperty("CHECKBOX_SAMPLE_YES")));
            case NO -> click(By.xpath(Reader.getProperty("CHECKBOX_SAMPLE_NO")));

        }
    }
    public void clickButtonPreview(){
        click(By.xpath(Reader.getProperty("BUTTON_PREVIEW")));
    }


}