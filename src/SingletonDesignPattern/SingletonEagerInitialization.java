package SingletonDesignPattern;

public class SingletonEagerInitialization {
    private static SingletonEagerInitialization ste = new SingletonEagerInitialization();
    private SingletonEagerInitialization(){}

    public static SingletonEagerInitialization getInstance() {
        return ste;
    }
    public void testMethod() {
        System.out.println("Test Method1 -> Singleton Eager Initialization");
    }
}
