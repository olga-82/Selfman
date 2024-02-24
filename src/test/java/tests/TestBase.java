package tests;

import config.AppManager;
import dto.Availability;
import dto.FactoryDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.Reader;

import java.io.IOException;

public class TestBase {
    AppManager app = new AppManager();

    Logger logger = LoggerFactory.getLogger(TestBase.class);


    boolean flag_Need_Logout = false;

    FactoryDTO provider = FactoryDTO.builder()
            .email(Reader.getProperty("web.email"))
            .password(Reader.getProperty("web.password"))
            .build();

    FactoryDTO factory = FactoryDTO.builder()
            .company_name("Qwest")
            .country("Italy")
            .city("Verona")
            .email(Reader.getProperty("web.email"))
            .website("https://shetko.online/")
            .facebook("https://www.facebook.com/")
            .instagram("https://www.instagram.com/")
            .linkedin("https://www.linkedin.com/")
            .availability(Availability.NEXT_MONTH)
            .industry("Techologies")
            .keywords("it,test,Innovations in home")
            .about("Electro-Pawer In House is an innovative company dedicated to developing " +
                    "and implementing advanced energy solutions for the home environment." +
                    " Our mission is to transform your home into a smart and energy-efficient " +
                    "oasis where modern technologies serve your comfort and ecological responsibility")
            .founded("1995")
            .languages("English")
            .Shipping_to("domestic")
            .payment_terms("Discounts for upfront payment,milestone payment")
            .product_name("Product")
            .min_order_quantity("23")
            .unit_price("123")
            .build();

    @BeforeSuite
    public void setUp() throws IOException {
        app.init();
        logger.info("Test started");

    }


    @AfterSuite(alwaysRun = true)

    public void stop() {
       // app.tearDown();
        logger.info("Test stopped");


    }

}
