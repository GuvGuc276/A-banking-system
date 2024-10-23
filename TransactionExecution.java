public interface TransactionExecution {
    void depositsIntoAccounts(double money);
    void withdrawalsFromAccounts(double money);
    void transfersBetweenAccounts(Account account, double money);
}
