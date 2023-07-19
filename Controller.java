import java.util.ArrayList;
import java.util.List;
public class Controller {
    private List<Contact> contacts;
    private View view;

    public Controller() {
        contacts = new ArrayList<>();
        view = new View();
    }

    public void addContact(String name, String phoneNumber, String emailAddress) {
        Contact newContact = new Contact(name, phoneNumber, emailAddress);
        contacts.add(newContact);
        view.displayMessage("Contact added successfully!");
    }

    public void updateContact(int index, String name, String phoneNumber, String emailAddress) {
        if (index >= 0 && index < contacts.size()) {
            Contact contact = contacts.get(index);
            contact.setName(name);
            contact.setPhoneNumber(phoneNumber);
            contact.setEmailAddress(emailAddress);
            view.displayMessage("Contact updated successfully!");
        } else {
            view.displayMessage("Invalid contact index!");
        }
    }

    public void deleteContact(int index) {
        if (index >= 0 && index < contacts.size()) {
            contacts.remove(index);
            view.displayMessage("Contact deleted successfully!");
        } else {
            view.displayMessage("Invalid contact index!");
        }
    }

    public List<Contact> getAllContacts() {
        return contacts;
    }

    public void displayContactList(List<Contact> contacts) {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            System.out.println("Address Book:");
            for (Contact contact : contacts) {
                System.out.println("Name: " + contact.getName());
                System.out.println("Phone: " + contact.getPhoneNumber());
                System.out.println("Email: " + contact.getEmailAddress());
                System.out.println("-------------------");
            }
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
