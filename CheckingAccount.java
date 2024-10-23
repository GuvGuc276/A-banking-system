public class CheckingAccount extends Account {

    private boolean debitCard;
    private boolean atmAccess;
    private boolean onlineBankingAccess;
    private static int checkAccounts = 0;

    public CheckingAccount(String accountNumber, double balance, Customer owner, boolean debitCard, boolean atmAccess, boolean onlineBankingAccess) {
        super(accountNumber, balance, owner);
        this.debitCard = debitCard;
        this.atmAccess = atmAccess;
        this.onlineBankingAccess = onlineBankingAccess;
        checkAccounts++;
    }

    public boolean isDebitCard() {
        return debitCard;
    }

    public void setDebitCard(boolean debitCard) {
        this.debitCard = debitCard;
    }

    public boolean isAtmAccess() {
        return atmAccess;
    }

    public void setAtmAccess(boolean atmAccess) {
        this.atmAccess = atmAccess;
    }

    public boolean isOnlineBankingAccess() {
        return onlineBankingAccess;
    }

    public void setOnlineBankingAccess(boolean onlineBankingAccess) {
        this.onlineBankingAccess = onlineBankingAccess;
    }

    public static int getTotalCheckAccounts() {
        return checkAccounts;
    }
}
