package SingletonDesignPattern;

public class SingletonDoubleCheckLock {
    private static SingletonDoubleCheckLock stdcl = null;
    private SingletonDoubleCheckLock(){}

    public static SingletonDoubleCheckLock getInstance(){
        if(stdcl == null){
            synchronized (SingletonDoubleCheckLock.class){
                if(stdcl == null){
                    stdcl = new SingletonDoubleCheckLock();
                }
            }
        }
        return  stdcl;
    }

    public void testMethodLazyDoubleCheck(){
        System.out.println("Test Method -> Singleton Double Check Lock");
    }
}
