package midtermcarrental;

 /*
 * @Modifier -  Palampreet Kaur
 * Student Number - 991715999
 */


public class Customer {
    private String lastName;
    private String firstName;
    private int birthYear;

    public Customer(String lastName, String firstName, int birthYear) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthYear = birthYear;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}



