package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class AgentDTO {
    String first_name;
    String last_name;
    String company_name;
    String email;
    String password;
    String language;
    String mobile_phone;
    String index;
    String country;
    String city;
    String street;
    String building;
    Price fee_hour;
    String price;
    Availability availability;
    String category;
    String keywords;
    String website;
    String facebook;
    String instagram;
    String linkedin;
    String about_yourself;

}
