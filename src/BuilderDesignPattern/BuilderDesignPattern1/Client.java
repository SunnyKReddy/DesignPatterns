package BuilderDesignPattern.BuilderDesignPattern1;

public class Client {
    public static void main(String[] args) {
        Form form = new Form.FormBuilder("Sunny", "Reddy", "sunny@gmail.com", "dontHack").setDob("15th August, 1997").setCity("Nellore").build();
        System.out.println(form);

    }
}
