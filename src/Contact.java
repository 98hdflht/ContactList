public class Contact {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    // Setter for first name
    public void setFirstName(String name) {
        this.firstName = name;
    }

    // Getter for first name
    public String getFirstName() {
        return this.firstName;
    }

    // Setter for last name
    public void setLastName(String name) {
        this.lastName = name;
    }

    // Getter for last name
    public String getLastName() {
        return this.lastName;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for email
    public String getEmail() {
        return this.email;
    }

    // Setter for phone
    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Getter for phone
    public String getPhone() {
        return this.phone;
    }

    // Method to display the contact information
    public String displayContact() {
        return "--------------------------------------------\n" +
                "---- Current Contact -----------------------\n" +
                "--------------------------------------------\n" +
                "Name:           " + getFirstName() + " " + getLastName() + "\n" +
                "Email Address:  " + getEmail() + "\n" +
                "Phone Number:   " + getPhone() + "\n" +
                "--------------------------------------------\n";
    }
}

