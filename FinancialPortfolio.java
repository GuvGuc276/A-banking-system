import java.util.ArrayList;

public class FinancialPortfolio {

    private final ArrayList<Account> accounts;

    public FinancialPortfolio() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public double calculateTotalValue() {
        double totalValue = 0;
        for (Account account : accounts) {
            totalValue += account.getBalance();
        }
        return totalValue;
    }

    public void printAccountInformation() {
        for (Account account : accounts) {
            System.out.println(account.toString());
        }
    }

    public int comparePortfolio(FinancialPortfolio portfolio1, FinancialPortfolio portfolio2) {
        double val1 = portfolio1.calculateTotalValue();
        double val2 = portfolio2.calculateTotalValue();
        if (val1 > val2) {
            return 1;
        } else if (val1 == val2) {
            return 0;
        }
        return -1;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}
