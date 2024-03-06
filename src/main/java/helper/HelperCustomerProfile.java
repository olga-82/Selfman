package helper;

import dto.AgentDTO;
import dto.CustomerDTO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.Reader.getProperty;

public class HelperCustomerProfile extends HelperBase{
    public HelperCustomerProfile(WebDriver driver) {
        super(driver);
    }


public void editCustomerProfile(CustomerDTO customer){

        UploadFoto("INPUT_AVATAR_CUSTOMER","PATH_AVATAR_CUSTOMER");
        clickButtonEditInfoBlock();
        fillFirstNameField(customer);
        fillLastNameField(customer);
        fillCompanyNameField(customer);
        fillEmailField(customer);
        fillPhoneField(customer);
        fillIndexField(customer);
        fillCountryField(customer);
        fillCityField(customer);
        fillStreetField(customer);
        fillBuildingField(customer);
        clickButtonSaveInfoBlock();
        pause(2000);
        clickButtonEditAboutBlock();
        fillAboutField(customer);
        clickButtonSaveAboutBlock();
        pause(2000);
        uploadFotoFile();
        pause(2000);

}

    public void clickButtonEditAboutBlock(){
        click(By.xpath(getProperty("BUTTON_EDIT_BLOCK_ABOUT_CUSTOMER")));
    }
    public void clickButtonSaveAboutBlock(){
        click(By.xpath(getProperty("BUTTON_SAVE_ABOUT_BLOCK_CUSTOMER")));
    }
    public void fillAboutField(CustomerDTO customer){
        type(By.xpath(getProperty("INPUT_ABOUT_CUSTOMER")), customer.getAbout_yourself());
    }
    public void clickButtonEditInfoBlock(){
        click(By.xpath(getProperty("BUTTON_EDIT_INFO_BLOCK_CUSTOMER")));
    }
    public void clickButtonSaveInfoBlock(){
        click(By.xpath(getProperty("BUTTON_SAVE_INFO_BLOCK_CUSTOMER")));
    }

    public void fillFirstNameField(CustomerDTO customer){
        type(By.xpath(getProperty("INPUT_FIRST_NAME_CUSTOMER")), customer.getFirst_name());

    }

    public void fillLastNameField(CustomerDTO customer){
        type(By.xpath(getProperty("INPUT_LAST_NAME_CUSTOMER")), customer.getLast_name());

    }
    public void fillCompanyNameField(CustomerDTO customer){
        type(By.xpath(getProperty("INPUT_COMPANY_NAME_CUSTOMER")),customer.getCompany_name());
    }
    public void fillEmailField(CustomerDTO customer){
        type(By.xpath(getProperty("INPUT_EMAIL_CUSTOMER")), customer.getEmail());
    }


    public void fillPhoneField(CustomerDTO customer){
        type(By.xpath(getProperty("INPUT_PHONE_CUSTOMER")), customer.getMobile_phone());
    }
    public void fillIndexField(CustomerDTO customer){
        type(By.xpath(getProperty("INPUT_INDEX_CUSTOMER")),customer.getIndex());
    }
    public void fillCountryField(CustomerDTO customer){
        type(By.xpath(getProperty("INPUT_COUNTRY_CUSTOMER")),customer.getCountry());
    }
    public void fillCityField(CustomerDTO customer){
        type(By.xpath(getProperty("INPUT_CITY_CUSTOMER")),customer.getCity());

    }
    public void fillStreetField(CustomerDTO customer){
        type(By.xpath(getProperty("INPUT_STREET_CUSTOMER")),customer.getStreet());
    }

    public void fillBuildingField(CustomerDTO customer){
        type(By.xpath(getProperty("INPUT_BIULDING")),customer.getBuilding());
    }


    public void uploadFotoFile(){
       UploadFoto("ATTACHMENTS_BLOCK_CUSTOMER","PATH_AVATAR_CUSTOMER");
    }




}
