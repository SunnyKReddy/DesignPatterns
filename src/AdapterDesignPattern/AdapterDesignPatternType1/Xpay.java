package AdapterDesignPattern.AdapterDesignPatternType1;

public interface Xpay {
    public  String getCreditCardNo();
    public void setCreditCardNo(String creditCardNo);
    public String getCutomerName();
    public void setCutomerName(String cutomerName);
    public String getCardExpMonth();
    public void setCardExpMonth(String cardExpMonth);
    public String getCardExpYear();
    public void setCardExpYear(String cardExpYear);
    public short getCVVNo();
    public void setCVVNo(short cVVNo);
    public double getAmount();
    public void setAmount(double amount);
}

