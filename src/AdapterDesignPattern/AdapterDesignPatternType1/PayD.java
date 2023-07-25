package AdapterDesignPattern.AdapterDesignPatternType1;

public interface PayD {
    public  String getCustomerCardNo();
    public void setCustomerCardNo(String creditCardNo);
    public String getCardOwnerName();
    public void setCardOwnerName(String cutomerName);
    public String getCardExpMonthDate();
    public void setCardExpMonthDate(String cardExpMonth);
    public int getCVVNo();
    public void setCVVNo(int cVVNo);
    public double getTotalAmount();
    public void setTotalAmount(double amount);
}
