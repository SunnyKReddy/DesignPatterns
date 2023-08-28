package AdapterDesignPattern.adapterdesignpattern3;

public interface Xpay {
    double getBalance();
    String getAccountHolderName();
    long getAccountNumber();
    long getCreditCardNumber();
    long getDebitCardNumber();
    long getLoanDetails();

    void setBalance(double balance);
    void setAccountHolderName(String name);
    void setAccountNumber(long accno);
    void setCreditCardNumber(long ccno);
    void setDebitCardNumber(long dcno);
    void setLoanDetails(long loanaccount);
}
