package helper;

import dto.AgentDTO;
import dto.Availability;
import dto.FactoryDTO;
import dto.Price;
import utils.Reader;

public interface ObjectDTO {


    FactoryDTO factory = FactoryDTO.builder()
            .company_name("Qwest")
            .country("Italy")
            .city("Verona")
            .email(Reader.getProperty("web.email"))
            .password(Reader.getProperty("web.password"))
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


    AgentDTO agent= AgentDTO.builder()
            .email(Reader.getProperty("web.email"))
            .password(Reader.getProperty("web.password"))
            .first_name("John")
            .last_name("OWNER")
            .company_name("Fantasy Company")
            .language("english")
            .mobile_phone("+9756478364")
            .index("5463")
            .country("Spain")
            .city("Madrid")
            .street("street")
            .building("54")
            .fee_hour(Price.HOUR)
            .price("15.00")
            .availability(Availability.NEXT_MONTH)
            .category("Customers goods")
            .keywords("Customer goods ,test1,test2")
            .website("https://shetko.online/")
            .facebook("https://www.facebook.com/")
            .instagram("https://www.instagram.com/")
            .linkedin("https://www.linkedin.com/")
            .about_yourself("I am agent")
            .build();

}
