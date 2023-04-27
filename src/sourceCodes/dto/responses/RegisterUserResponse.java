package sourceCodes.dto.responses;

public class RegisterUserResponse {
    private String firstName;
    private int id;
    private String address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RegisterUserResponse{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append("address='").append(address).append('\'');
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
