package PhoneBook;

public class Address {

    private Integer homeNum;
    private String street;
    private String city;
    private String state;
    private Integer zipCode;

    public Address() {
    }

    public Address(Integer homeNum, String street, String city, String state, Integer zipCode) {
        this.homeNum = homeNum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Integer getHomeNum() {
        return homeNum;
    }

    public void setHomeNum(Integer homeNum) {
        this.homeNum = homeNum;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return homeNum + " " + street + ", " + city + ", " + state + ", " + zipCode + "";
    }

}
