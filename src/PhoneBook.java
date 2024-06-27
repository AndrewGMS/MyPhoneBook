import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(String name, String phoneNumber, String group) {
        contacts.add(new Contact(name, phoneNumber, group));
    }

    public String findPhoneNumber(String name) {

        for (int i = 0; i < contacts.size(); i++) {
           if (contacts.get(i).contactName == name) {
               return contacts.get(i).contactPhoneNumber;
           }
        }
        return "not found";
    }
}

class Contact {

    String contactName;
    String contactPhoneNumber;
    String contactGroup;

    public Contact(String name, String phoneNumber, String group) {
        contactName = name;
        contactPhoneNumber = phoneNumber;
        contactGroup = group;
    }

}