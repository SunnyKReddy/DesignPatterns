package SingletonDesignPattern;

public class SingletonLazyInitialization {
    private static SingletonLazyInitialization stl = null;

    private SingletonLazyInitialization() {}

    public static SingletonLazyInitialization getInstance(){
        if(stl == null) {
            stl = new SingletonLazyInitialization();
        }
        return stl;
    }

    public void testMethodLazy(){
        System.out.println("Test Method -> Singleton Lazy Initialization");
    }
}
