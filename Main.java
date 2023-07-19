import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add contact");
            System.out.println("2. Display all contacts");
            System.out.println("3. Update contact");
            System.out.println("4. Delete contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email address: ");
                    String emailAddress = scanner.nextLine();
                    controller.addContact(name, phoneNumber, emailAddress);
                    break;
                case 2:
                    List<Contact> contacts = controller.getAllContacts();
                    View ob = new View();
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts found.");
                    } else {
                    	List<Contact> obj=controller. getAllContacts();
                    	ob.displayContactList(contacts);
                        
                    }
                
                    break;
                case 3:
                    System.out.print("Enter the index of the contact to update: ");
                    int indexToUpdate = scanner.nextInt();
                    scanner.nextLine();
                    if (indexToUpdate >= 0 && indexToUpdate < controller.getAllContacts().size()) {
                        System.out.print("Enter new name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter new phone number: ");
                        String newPhoneNumber = scanner.nextLine();
                        System.out.print("Enter new email address: ");
                        String newEmailAddress = scanner.nextLine();
                        controller.updateContact(indexToUpdate, newName, newPhoneNumber, newEmailAddress);
                    } else {
                        System.out.println("Invalid contact index!");
                    }
                    break;
                case 4:
                    System.out.print("Enter the index of the contact to delete: ");
                    int indexToDelete = scanner.nextInt();
                    scanner.nextLine();
                    controller.deleteContact(indexToDelete);
                    break;
                case 5:
                    System.out.println("Exiting the application.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
