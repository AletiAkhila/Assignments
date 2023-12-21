import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Contact {
    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String state;
    private String email;
    private String phonenumber;
    private String zipcode;

    public Contact(String firstname, String lastname, String address, String city, String state,
                   String email, String phonenumber, String zipcode) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.phonenumber = phonenumber;
        this.zipcode = zipcode;
    }
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getZipcode() {
        return zipcode;
    }
}
class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}
public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address Book Program!!");
        AddressBook ab = new AddressBook();
        System.out.println("Enter Details:");
        System.out.println("Enter firstname:");
        String firstname = sc.nextLine();
        System.out.println("Enter lastname:");
        String lastname = sc.nextLine();
        System.out.println("Enter address:");
        String address = sc.nextLine();
        System.out.println("Enter city:");
        String city = sc.nextLine();
        System.out.println("Enter state:");
        String state = sc.nextLine();
        System.out.println("Enter email:");
        String email = sc.nextLine();
        System.out.println("Enter Phonenumber:");
        String phonenumber = sc.nextLine();
        System.out.println("Enter zipcode:");
        String zipcode = sc.nextLine();
        // ... (remaining input collection)

        Contact newContact = new Contact(firstname, lastname, address, city, state, email, phonenumber, zipcode);
        ab.addContact(newContact);

        System.out.println("Contacts in Address Book:");
        List<Contact> contactList = ab.getContacts();
        for (Contact contact : contactList) {
            System.out.println(contact.getFirstname() + " " + contact.getLastname() + ", " + contact.getEmail() + ", " +
                    contact.getAddress() + ", " + contact.getCity() + ", " + contact.getState()+ ", " + contact.getPhonenumber() + ", " +
                    contact.getZipcode());
        }
    }
}
