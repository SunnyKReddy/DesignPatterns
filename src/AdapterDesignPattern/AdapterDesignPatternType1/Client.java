package AdapterDesignPattern.AdapterDesignPatternType1;

public class Client {
    public static void main(String[] args) {
        System.out.println("Initializing payment and redirecting to Payment Gateway");
        Xpay xpay = new XpayImpl();
        Payment payment = new Payment(xpay);

        //usgae with Xpay
        System.out.println(xpay.getCreditCardNo());
        System.out.println(xpay.getCutomerName());
        System.out.println(xpay.getCardExpMonth());
        System.out.println(xpay.getCardExpYear());
        System.out.println(xpay.getCVVNo());
        System.out.println(xpay.getAmount());

        //Using details with XpaytoPayDAdapter
        PayD payD = new XpaytoPayDAdapter(xpay);
        System.out.println("Xpay to PayD Adapter: ");
        System.out.println(payD.getCustomerCardNo());
        System.out.println(payD.getCardOwnerName());
        System.out.println(payD.getCardExpMonthDate());
        System.out.println(payD.getCVVNo());
        System.out.println(payD.getTotalAmount());

    }
}
