public class SavingsAccount extends Account {

    private static final double INTEREST_RATE = 3.0;
    private String accountStatus;
    private static int saveAccounts = 0;

    public SavingsAccount(String accountNumber, double balance, Customer owner, String accountStatus) {
        super(accountNumber, balance, owner);
        this.accountStatus = accountStatus;
        saveAccounts++;
    }

    public double calculateBalanceAfterOneYear() {
        double interestRate = INTEREST_RATE / 100;
        double interest = balance * interestRate;
        return balance + interest;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public static int getTotalSavAccounts() {
        return saveAccounts;
    }

    @Override
    public String toString() {
        return super.toString() + "Calculated balanced after one year: " + calculateBalanceAfterOneYear() + ", Status: " + accountStatus;
    }
}
