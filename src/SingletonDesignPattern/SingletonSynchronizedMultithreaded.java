package SingletonDesignPattern;

public class SingletonSynchronizedMultithreaded {
    private static SingletonSynchronizedMultithreaded stsm = null;

    private SingletonSynchronizedMultithreaded(){}

    public static synchronized SingletonSynchronizedMultithreaded getInstance(){
        if(stsm == null){
            stsm = new SingletonSynchronizedMultithreaded();
        }
        return stsm;
    }

    public void testMethodLazyMT(){
        System.out.println("Test Method -> SingletonSynchronizedMultithreaded");
    }
}
