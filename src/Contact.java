public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // 3 methods
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // static means we don't have to create a new object instance for this Contact class
    // don't need new Contact()... can be Contacts.createContact(name, phoneNumber);
    public static Contact createContact(String name, String phoneNumber) {
        // it's calling the constructor to create a new Contact record
        return new Contact(name, phoneNumber);
    }
}
