package sourceCodes.data.model;

import lombok.*;


//@Data  if you don't want to have getters and setters for all the fields
@Data
@AllArgsConstructor // For all args constructor
//@NoArgsConstructor // For No Args constructor
@RequiredArgsConstructor // For required args constructor
public class User {
//    @Getter if you want to have just getter for this field
    private String firstName;
//    @Getter @Setter if you want to have getter and setter for this particular field
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;
    private int id;

}
