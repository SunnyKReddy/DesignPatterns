package AdapterDesignPattern.AdapterDesignPatternType1;

public class XpayImpl implements Xpay {
    private String creditCardNo;
    private String customerName;
    private String cardExpMonth;
    private String cardExpYear;
    private short cVVNo;
    private double amount;

    @Override
    public String getCreditCardNo() {
        return this.creditCardNo;
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    @Override
    public String getCutomerName() {
        return this.customerName;
    }

    @Override
    public void setCutomerName(String cutomerName) {
        this.customerName = cutomerName;
    }

    @Override
    public String getCardExpMonth() {
        return this.cardExpMonth;
    }

    @Override
    public void setCardExpMonth(String cardExpMonth) {
        this.cardExpMonth = cardExpMonth;
    }

    @Override
    public String getCardExpYear() {
        return this.cardExpYear;
    }

    @Override
    public void setCardExpYear(String cardExpYear) {
        this.cardExpYear = cardExpYear;
    }

    @Override
    public short getCVVNo() {
        return this.cVVNo;
    }

    @Override
    public void setCVVNo(short cVVNo) {
        this.cVVNo = cVVNo;
    }

    @Override
    public double getAmount() {
        return this.amount;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
