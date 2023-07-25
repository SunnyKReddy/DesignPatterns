package SingletonDesignPattern;

public class Client {
    public static void main(String[] args) {
        //SingletonEagerInitialization
        SingletonEagerInitialization ste = SingletonEagerInitialization.getInstance();
        ste.testMethod();
        //SingletonEagerInitialization ste1 = new SingletonEagerInitialization(); //--> ERROR: Can't initialize with constructor, as it's private

        //SingletonLazyInitialization
        //SingletonLazyInitialization stl = new SingletonLazyInitialization(); //--> ERROR: Can't be initialized as constructor is private.
        SingletonLazyInitialization stl = SingletonLazyInitialization.getInstance();
        stl.testMethodLazy();

        //SingletonSynchronizedMultithreaded
        SingletonSynchronizedMultithreaded stsm = SingletonSynchronizedMultithreaded.getInstance();
        stsm.testMethodLazyMT();

        //SingletonDoubleCheckLock
        SingletonDoubleCheckLock stdcl = SingletonDoubleCheckLock.getInstance();
        stdcl.testMethodLazyDoubleCheck();

    }
}
