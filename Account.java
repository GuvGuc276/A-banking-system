import java.util.ArrayList;

public abstract class Account implements TransactionExecution {

    private String accountNumber;
    protected double balance;
    // Normally, sub classes should be able to use owner (and other parameters), so it is better to be protected. However, since the project is not detailed, it is safer to make it private.
    private Customer owner;
    private static int totalAccounts = 0;
    private ArrayList<Transaction> transactionHistory;

    public Account(String accountNumber, Customer owner) {
        this(accountNumber, 0, owner);
        this.transactionHistory = new ArrayList<>();
    }

    public Account(String accountNumber, double balance, Customer owner) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
        totalAccounts++;
        this.transactionHistory = new ArrayList<>();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    @Override
    public String toString() {
        StringBuilder transactionHistory = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            if (this.transactionHistory.size() - i - 1 > -1) {
                transactionHistory.append(this.transactionHistory.get(this.transactionHistory.size() - i - 1)).append(", ");
            } else {
                transactionHistory.append("EMPTY").append(", ");
            }
        }
        return "Account Number: " + accountNumber + ", Balance: $" + balance + ", Transaction History: " + transactionHistory;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Account other = (Account) obj;
        return Double.compare(balance, other.balance) == 0;
    }

    @Override
    public void depositsIntoAccounts(double money) {
        if (owner instanceof IndividualCustomer) {
            balance += money;
            transactionHistory.add(new Transaction(money, "DEPOSIT"));
        } else {
            System.out.println("Customer must be individual.");
        }
    }

    @Override
    public void withdrawalsFromAccounts(double money) {
        if (owner instanceof IndividualCustomer) {
            if (balance >= money) {
                balance -= money;
                transactionHistory.add(new Transaction(money, "WITHDRAWAL"));
            } else {
                System.out.println("You don't have enough money.");
            }
        } else {
            System.out.println("Customer must be individual.");
        }
    }

    @Override
    public void transfersBetweenAccounts(Account account, double money) {
        if (owner instanceof IndividualCustomer) {
            if (balance >= money) {
                balance -= money;
                transactionHistory.add(new Transaction(money, "TRANSFER"));
                account.setBalance(account.getBalance() + money);
            } else {
                System.out.println("You don't have enough money.");
            }
        } else {
            System.out.println("Customer must be individual.");
        }
    }
}
