package AdapterDesignPattern.AdapterDesignPatternType1;

public class XpaytoPayDAdapter implements PayD{
    private String customerCardNo;
    private String cardOwnerName;
    private String cardExpMonthDate;
    private int cVVNo;
    private double totalAmount;

    private final Xpay xpay;

    public XpaytoPayDAdapter(Xpay xpay) {
        this.xpay = xpay;
        initializePayment(this.xpay);
    }

    private void initializePayment(Xpay xpay) {
        setCustomerCardNo(xpay.getCreditCardNo());
        setCardOwnerName(xpay.getCutomerName());
        setCardExpMonthDate(xpay.getCardExpMonth() + "/" + xpay.getCardExpYear());
        setCVVNo((int)xpay.getCVVNo());
        setTotalAmount(xpay.getAmount());
    }

    @Override
    public String getCustomerCardNo() {
        return customerCardNo;
    }

    @Override
    public void setCustomerCardNo(String customerCardNo) {
        this.customerCardNo = customerCardNo;
    }

    @Override
    public String getCardOwnerName() {
        return cardOwnerName;
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }

    @Override
    public String getCardExpMonthDate() {
        return cardExpMonthDate;
    }

    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {
        this.cardExpMonthDate = cardExpMonthDate;
    }

    public int getCVVNo() {
        return cVVNo;
    }

    public void setCVVNo(int cVVNo) {
        this.cVVNo = cVVNo;
    }

    @Override
    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
