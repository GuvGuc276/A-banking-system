import java.util.Date;

public class Transaction {

    private static int totalTransaction = 0;
    private final double amount;
    private final Date date;
    private final String type;
    private final int transactionId;


    public Transaction(double amount, String type) {
        totalTransaction++;
        this.transactionId = totalTransaction;
        this.amount = amount;
        this.date = new Date();
        this.type = type;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionId + ", Type: " + type + ", Amount: " + amount + ", Date: " + date;
    }
}
