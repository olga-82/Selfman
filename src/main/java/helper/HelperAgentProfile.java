package helper;

import dto.AgentDTO;
import dto.Availability;
import dto.FactoryDTO;
import dto.Price;
import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import utils.Reader;

import static utils.Reader.getProperty;

public class HelperAgentProfile extends HelperBase {
    public HelperAgentProfile(WebDriver driver) {
        super(driver);
    }


    public void editFeeHourBlockAgent(AgentDTO agent){
        clickButtonEditFeeHourBlock();
        selectFeeHourAgent(agent.getFee_hour());
        fillPriceField(agent);
        selectAvailability(agent.getAvailability(),"CHECK_BOX_AVAILABILITY_NOW_AGENT"
                ,"CHECK_BOX_AVAILABILITY_NEXT_WEEK_AGENT","CHECK_BOX_AVAILABILITY_NEXT_MONTH_AGENT");
        pause(2000);
        fillCategoryField(agent);
        removeAllKeywords("BLOCK_KEYWORDS_AGENT","BUTTON_DELETE_KEYWORDS");
        fillKeywordsField(agent.getKeywords(),"INPUT_KEYWORDS_AGENT");
        clickButtonSaveBlockFeeHourAgent();
    }
    public void editSocialBlockAgent(AgentDTO agent){
        clickButtonEditSocialBlock();
        fillWebsiteField(agent);
        fillFacebookField(agent);
        fillInstagramField(agent);
        fillLinkedinField(agent);
        clickButtonSaveSocialBlock();
        clickButtonCloseSocialBlock();

    }
    public void editAboutBlockAgent(AgentDTO agent){
        clickButtonEditAboutBlock();
        fillAboutField(agent);
        clickButtonSaveAboutBlock();
    }
    public void editInfoBlockAgent(AgentDTO agent){
        clickButtonEditInfoBlock();
        fillFirstNameField(agent);
        fillLastNameField(agent);
        fillCompanyNameField(agent);
        fillEmailField(agent);
        fillLanguageField(agent);
        fillPhoneField(agent);
        fillIndexField(agent);
        fillCountryField(agent);
        fillCityField(agent);
        fillStreetField(agent);
        fillBuildingField(agent);
        clickButtonSaveInfoBlock();
    }
    public void clickButtonEditSocialBlock(){
        click(By.xpath(getProperty("BUTTON_EDIT_BLOCK_SOCIALE_AGENT")));
    }
    public void clickButtonSaveSocialBlock(){
        click(By.xpath(getProperty("BUTTON_SAVE_BLOCK_SOCIALE_AGENT")));
    }
    public void clickButtonCloseSocialBlock(){
        click(By.xpath(getProperty("BUTTON_CLOSE_BLOCK_SOCIALE_AGENT")));
    }


    public void clickButtonEditFeeHourBlock() {
        click(By.xpath(getProperty("BUTTON_EDIT_BLOCK_FEE_HOUR_AGENT")));
    }

    public void selectFeeHourAgent(Price price) {
        switch (price) {
            case FEE:
                click(By.xpath(getProperty("CHECKBOX_FEE_AGENT")));
                break;
            case HOUR:
                click(By.xpath(getProperty("CHECKBOX_HOUR_AGENT")));
                break;

        }
    }
    public void fillPriceField(AgentDTO agent) {
        type(By.xpath(getProperty("INPUT_PRICE_HOUR_AGENT")), agent.getPrice());
    }
    public void selectAvailabilityAgent(Availability availability) {
        switch (availability) {
            case NOW:
              click(By.xpath(getProperty("CHECK_BOX_AVAILABILITY_NOW_AGENT")));
                break;
            case NEXT_WEEK :
                click(By.xpath(getProperty("CHECK_BOX_AVAILABILITY_NEXT_WEEK_AGENT")));
                break;
            case NEXT_MONTH :
                click(By.xpath(getProperty("CHECK_BOX_AVAILABILITY_NEXT_MONTH_AGENT")));
                break;

        }

        }
        public void fillCategoryField(AgentDTO agent) {
        type(By.xpath(getProperty("INPUT_CATEGORY_AGENT")),agent.getCategory());
        }


    public void clickButtonSaveBlockFeeHourAgent(){
        click(By.xpath(getProperty("BUTTON_SAVE_BLOCK_FEE_HOUR_AGENT")));
    }
    public void fillWebsiteField(AgentDTO agent) {
        type(By.xpath(getProperty("INPUT_WEB_SITE_AGENT")), agent.getWebsite());
    }

    public void fillFacebookField(AgentDTO agent) {
        type(By.xpath(getProperty("INPUT_FACEBOOK_AGENT")), agent.getFacebook());
    }

    public void fillInstagramField(AgentDTO agent) {
        type(By.xpath(getProperty("INPUT_INSTAGRAM_AGENT")), agent.getInstagram());
    }

    public void fillLinkedinField(AgentDTO agent) {
        type(By.xpath(getProperty("INPUT_LINKEDIN_AGENT")),agent.getLinkedin());

    }
    public void clickButtonEditAboutBlock(){
        click(By.xpath(getProperty("BUTTON_EDIT_BLOCK_ABOUT_AGENT")));
    }
    public void clickButtonSaveAboutBlock(){
        click(By.xpath(getProperty("BUTTON_SAVE_BLOCK_ABOUT_AGENT")));
    }
public void fillAboutField(AgentDTO agent){
        type(By.xpath(getProperty("INPUT_ABOUT_YOURSELF")),agent.getAbout_yourself());
}
public void clickButtonEditInfoBlock(){
       click(By.xpath(getProperty("BUTTON_EDIT_BLOCK_INFO_AGENT")));
}
    public void clickButtonSaveInfoBlock(){
        click(By.xpath(getProperty("BUTTON_SAVE_BLOCK_INFO_AGENT")));
    }

    public void fillFirstNameField(AgentDTO agent){
        type(By.xpath(getProperty("INPUT_FIRST_NAME_AGENT")),agent.getFirst_name());

    }

    public void fillLastNameField(AgentDTO agent){
        type(By.xpath(getProperty("INPUT_LAST_NAME_AGENT")),agent.getLast_name());

    }
    public void fillCompanyNameField(AgentDTO agent){
        type(By.xpath(getProperty("INPUT_COMPANY_NAME_AGENT")),agent.getCompany_name());
    }
    public void fillEmailField(AgentDTO agent){
        type(By.xpath(getProperty("INPUT_EMAIL1_AGENT")),agent.getEmail());
    }

    public void fillLanguageField(AgentDTO agent){
        type(By.xpath(getProperty("INPUT_LANGUAGE_AGENT")),agent.getLanguage());
    }
    public void fillPhoneField(AgentDTO agent){
        type(By.xpath(getProperty("INPUT_PHONE_AGENT")),agent.getMobile_phone());
    }
    public void fillIndexField(AgentDTO agent){
        type(By.xpath(getProperty("INPUT_INDEX_AGENT")),agent.getIndex());
    }
    public void fillCountryField(AgentDTO agent){
        type(By.xpath(getProperty("INPUT_COUNTRY_AGENT")),agent.getCountry());
    }
    public void fillCityField(AgentDTO agent){
        type(By.xpath(getProperty("INPUT_CITY_AGENT")),agent.getCity());

    }
    public void fillStreetField(AgentDTO agent){
        type(By.xpath(getProperty("INPUT_STREET_AGENT")),agent.getStreet());
    }

    public void fillBuildingField(AgentDTO agent){
        type(By.xpath(getProperty("INPUT_BUILDING_AGENT")),agent.getBuilding());
    }






}

