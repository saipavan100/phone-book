import java.util.List;
public class View {
    public void displayContactList(List<Contact> contacts) {
        System.out.println("Address Book:");
        for (Contact contact : contacts) {
            System.out.println("Name: " + contact.getName());
            System.out.println("Phone: " + contact.getPhoneNumber());
            System.out.println("Email: " + contact.getEmailAddress());
            System.out.println("-------------------");
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
