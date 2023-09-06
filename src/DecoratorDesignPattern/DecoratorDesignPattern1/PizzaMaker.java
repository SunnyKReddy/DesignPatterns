package DecoratorDesignPattern.DecoratorDesignPattern1;

public class PizzaMaker {
    public static void main(String[] args) {
        //Making Wheat Base Pizza
        Pizza pizzaBase = new WheatBasePizza();
        pizzaBase = new Chicken(pizzaBase);
        pizzaBase = new Cheese(pizzaBase);
        pizzaBase = new Brocolli(pizzaBase);
        PizzaMaker.generateBill(pizzaBase);
        //Making MultiGrain -VEG Pizza
        Pizza pizzaBase2 = new MultiGrainBasePizza();
        pizzaBase2 = new Brocolli(pizzaBase2);
        pizzaBase2 = new Cheese(pizzaBase2);
        PizzaMaker.generateBill(pizzaBase2);

        //Pizza making - Decorator
        //Pizza pizzaBase3 = new MaidaBasePizza();
        Pizza pizzaBase3 = new Brocolli(new Chicken(new Cheese(new MaidaBasePizza())));
        generateBill(pizzaBase3);

        //Pizza4
        Pizza pizzaBase4 = new Cheese(
                                new Brocolli(
                                    new Tomato(
                                        new Chicken(
                                            new Meat(
                                                new MultiGrainBasePizza())))));
        generateBill(pizzaBase4);

    }

    public static void generateBill(Pizza pizza) {
        System.out.println("PIZZA VEG/ NON-VEG (GREEN/ RED)");
        System.out.println(pizza.getDesc());
        System.out.println("***************************");
        System.out.println("*  " + "Pizza Cost : " + pizza.getPrice() + "     *");
        System.out.println("***************************");
        System.out.println("-----------------------------------------");
        System.out.println();
    }
}
