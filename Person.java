/**
 * Justin Baraniuk
 * October 19, 2018
 * This class defines a person by name and address.
 */

public class Person {
    private String lastName;
    private String firstName;
    private Address residence;
    
    /**
    Constructor
    @param last The person's last name.
    @param first The person's first name.
    @param residence The person's address.
     */
    public Person(String lastName, String firstName, Address residence) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.residence = residence;
    }

    /**
    The toString method
    @return Information about the person.
     */
    public String toString() {
        return(firstName + " " + lastName + ", " + residence.toString());
    }
}