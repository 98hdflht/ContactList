public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Contact List application\n");

        while (true) {
            // Create a new contact
            Contact contact = new Contact();

            // Get user input for contact details
            contact.setFirstName(Console.getString("Enter first name: "));
            contact.setLastName(Console.getString("Enter last name: "));
            contact.setEmail(Console.getString("Enter email: "));
            contact.setPhone(Console.getString("Enter phone: "));

            // Display the contact details
            System.out.println(contact.displayContact());

            // Check if the user wants to continue
            if (!Console.getYesNo("Continue? (y/n): ")) {
                break;
            }
        }
    }
}

