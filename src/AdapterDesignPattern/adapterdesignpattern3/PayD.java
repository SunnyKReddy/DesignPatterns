package AdapterDesignPattern.adapterdesignpattern3;

public interface PayD {
    double getBalance();
    String getCreditCardInfo();
    String getDebitCardInfo();
    String getAccountInfo();
    String getLoanInfo();

    void setBalance(double balance);
    void setCreditCardInfo(String creditCardInfo);
    void setDebitCardInfo(String debitCardInfo);
    void setAccountInfo(String accountName, String accountNo);
    void setLoanInfo(String loanInfo);
}
