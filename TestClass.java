import java.util.ArrayList;

public class TestClass {

    public static void main(String[] args) {
        IndividualCustomer customer1 = new IndividualCustomer("Oğuz Kerem", "123 Sile Sk.", "oguzkerem@example.com", "Male", "123456789", "Software Engineer", new ArrayList<>());
        FinancialPortfolio portfolio1 = new FinancialPortfolio();
        CheckingAccount checkingAccount1 = new CheckingAccount("CHK001", 1000.0, customer1, true, true, true);
        SavingsAccount savingsAccount1 = new SavingsAccount("SAV001", 5000.0, customer1, "Active");
        SavingsAccount savingsAccount2 = new SavingsAccount("SAV002", 3000.0, customer1, "Active");
        portfolio1.addAccount(savingsAccount1);
        portfolio1.addAccount(savingsAccount2);
        Transaction transaction1 = new Transaction(1000.0, "DEPOSIT");
        Transaction transaction2 = new Transaction(2000.0, "DEPOSIT");
        Transaction transaction3 = new Transaction(1500.0, "DEPOSIT");
        customer1.createAccount(checkingAccount1);
        checkingAccount1.depositsIntoAccounts(transaction1.getAmount());
        checkingAccount1.depositsIntoAccounts(transaction2.getAmount());
        checkingAccount1.depositsIntoAccounts(transaction3.getAmount());
        customer1.displayAccount(checkingAccount1);
        customer1.displayAccount(savingsAccount1);
        customer1.displayAccount(savingsAccount2);
        System.out.println("Total Portfolio Value: $" + portfolio1.calculateTotalValue());
        portfolio1.removeAccount(savingsAccount2);
        System.out.println("Total Portfolio Value after removal: $" + portfolio1.calculateTotalValue());
        portfolio1.printAccountInformation();
        IndividualCustomer customer2 = new IndividualCustomer("Güven Güçlü", "456 DMF sk.", "gucluguven@example.com", "Male", "987654321", "Teacher", new ArrayList<>());
        FinancialPortfolio portfolio2 = new FinancialPortfolio();
        CheckingAccount checkingAccount2 = new CheckingAccount("CHK002", 2000.0, customer2, true, true, true);
        customer2.createAccount(checkingAccount2);
        customer2.displayAccount(checkingAccount2);
        portfolio2.addAccount(checkingAccount2);
        System.out.println("Total Value of Second Portfolio: $" + portfolio2.calculateTotalValue());
        portfolio2.printAccountInformation();
        int comparisonResult = portfolio1.comparePortfolio(portfolio1, portfolio2);
        if (comparisonResult > 0) {
            System.out.println("Portfolio 1 has a higher value.");
        } else if (comparisonResult < 0) {
            System.out.println("Portfolio 2 has a higher value.");
        } else {
            System.out.println("Both portfolios have the same value.");
        }
        Transaction transaction4 = new Transaction(500.0, "DEPOSIT");
        checkingAccount2.depositsIntoAccounts(transaction4.getAmount());
        Transaction transaction5 = new Transaction(1000.0, "TRANSFER");
        checkingAccount1.transfersBetweenAccounts(checkingAccount2, transaction5.getAmount());
        customer1.displayAccount(checkingAccount1);
        customer2.displayAccount(checkingAccount2);
        comparisonResult = portfolio1.comparePortfolio(portfolio1, portfolio2);
        if (comparisonResult > 0) {
            System.out.println("Portfolio 1 has a higher value.");
        } else if (comparisonResult < 0) {
            System.out.println("Portfolio 2 has a higher value.");
        } else {
            System.out.println("Both portfolios have the same value.");
        }
    }
}
