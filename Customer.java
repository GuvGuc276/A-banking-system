import java.util.ArrayList;

public abstract class Customer implements AccountManagement {

    protected String name;
    protected String address;
    protected String contactDetails;
    private final ArrayList<Account> accounts;

    public Customer(String name, String address, String contactDetails, ArrayList<Account> accounts) {
        this.name = name;
        this.address = address;
        this.contactDetails = contactDetails;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    public abstract int getTotalCustomer();

    @Override
    public void createAccount(Account account) {
        if (account.getOwner().equals(this)) {
            accounts.add(account);
        }
    }

    @Override
    public void displayAccount(Account account) {
        if (account.getOwner().equals(this)) {
            System.out.println(account);
        }
    }

    @Override
    public void updateContact(String contactDetails) {
        this.contactDetails = contactDetails;
    }
}
