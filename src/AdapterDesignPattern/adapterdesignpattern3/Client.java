package AdapterDesignPattern.adapterdesignpattern3;

public class Client {


    public static void main(String[] args) {
        Xpay xpayCustomer1 = new XpayImpl();
        xpayCustomer1.setAccountHolderName("Sunny");
        xpayCustomer1.setAccountNumber(123456);
        xpayCustomer1.setBalance(12234.50);
        xpayCustomer1.setCreditCardNumber(952932);
        xpayCustomer1.setDebitCardNumber(3297863);
        xpayCustomer1.setLoanDetails(24567);

//        System.out.println(xpayCustomer1.getAccountNumber());
//        System.out.println(xpayCustomer1.getAccountHolderName());
//        System.out.println(xpayCustomer1.getBalance());
//        System.out.println(xpayCustomer1.getCreditCardNumber());
//        System.out.println(xpayCustomer1.getDebitCardNumber());
//        System.out.println(xpayCustomer1.getLoanDetails());
        PayD payD = new XpayToPayDImpl(xpayCustomer1);
        System.out.println(payD.getAccountInfo());
        System.out.println(payD.getBalance());
    }
}
