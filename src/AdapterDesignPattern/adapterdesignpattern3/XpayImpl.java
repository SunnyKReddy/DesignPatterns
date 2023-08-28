package AdapterDesignPattern.adapterdesignpattern3;

public class XpayImpl implements Xpay{
    private double balance;
    private String accountHolderName;
    private long accountNumber;
    private long creditCardNumber;
    private long debitCardNumber;
    private long loanDetails;

    @Override
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    @Override
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public long getDebitCardNumber() {
        return debitCardNumber;
    }

    public void setDebitCardNumber(long debitCardNumber) {
        this.debitCardNumber = debitCardNumber;
    }

    @Override
    public long getLoanDetails() {
        return loanDetails;
    }

    public void setLoanDetails(long loanDetails) {
        this.loanDetails = loanDetails;
    }
}
