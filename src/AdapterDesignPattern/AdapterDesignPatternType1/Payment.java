package AdapterDesignPattern.AdapterDesignPatternType1;

public class Payment {
    public Xpay xpay;
    public Payment(Xpay xpay){
        this.xpay = xpay;
        System.out.println("Credit card details: ");
        this.xpay.setCreditCardNo("1234 5678 9101 1121");
        this.xpay.setCutomerName("Sunny K R");
        this.xpay.setCardExpMonth("03");
        this.xpay.setCardExpYear("29");
        this.xpay.setCVVNo((short) 123);
        this.xpay.setAmount(1000.19);
        System.out.println("Processing Payment with below details: ");
    }
}
