package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class CustomerDTO {
    String first_name;
    String last_name;
    String company_name;
    String email;
    String password;
    String mobile_phone;
    String index;
    String country;
    String city;
    String street;
    String building;
    String about_yourself;

}
