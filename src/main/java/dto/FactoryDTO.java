package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@Builder
@ToString
public class FactoryDTO {
    String company_name;
    String email;
    String password;
    String country;
    String city;
    String website;
    String facebook;
    String instagram;
    String linkedin;
    Availability availability;
    String industry;
    String keywords;
    String about;
    String founded;
    String languages;
    String Shipping_to;
    String payment_terms;
    Yes_No Customization_capacity;
    Yes_No RD_capacity;
    Yes_No  Special_packing;
    Yes_No  White_label;
    Yes_No Certification;
    Yes_No Sample;
    String product_name;
    String min_order_quantity;
    String unit_price;




}
