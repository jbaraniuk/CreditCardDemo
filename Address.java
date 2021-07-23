/**
 * Justin Baraniuk
 * October 19, 2018
 * This class defines an address using a street, city, state, and zipcode.
 */

public class Address {
    private String street; // The street number and name
    private String city; 
    private String state;
    private String zip;
   
    /**
    Constructor
    @param road Describes the street number and name.
    @param town Describes the city.
    @param st Describes the state.
    @param zipCode Describes the zip code.
     */
    public Address(String road, String town, String st, String zipCode) {
        this.street = road;
        this.city = town;
        this.state = st;
        this.zip = zipCode;
    }

    /**
    The toString method
    @return Information about the address.
     */
    public String toString() {
        return (street + ", " + city + ", " + state + " " + zip);
    }
}