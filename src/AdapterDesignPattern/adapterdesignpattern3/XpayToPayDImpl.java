package AdapterDesignPattern.adapterdesignpattern3;

public class XpayToPayDImpl implements PayD{
    double balance;
    String creditCardInfo;
    String debitCardInfo;
    String accountInfo;
    String loanInfo;

    private final Xpay xpay;

    XpayToPayDImpl(Xpay xpay) {
        this.xpay = xpay;
        convertXpayToPayD();
    }

    private void convertXpayToPayD() {
        setBalance(this.xpay.getBalance());
        setAccountInfo((String) this.xpay.getAccountHolderName(), String.valueOf(this.xpay.getAccountNumber()));
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void setCreditCardInfo(String creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }

    @Override
    public void setDebitCardInfo(String debitCardInfo) {
        this.debitCardInfo = debitCardInfo;
    }

    public void setAccountInfo(String accountName, String accountNo) {
        this.accountInfo = accountName + "-" + accountNo;
    }

    @Override
    public void setLoanInfo(String loanInfo) {
        this.loanInfo = loanInfo;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getCreditCardInfo() {
        return creditCardInfo;
    }

    @Override
    public String getDebitCardInfo() {
        return debitCardInfo;
    }

    @Override
    public String getAccountInfo() {
        return accountInfo;
    }

    @Override
    public String getLoanInfo() {
        return loanInfo;
    }
}
