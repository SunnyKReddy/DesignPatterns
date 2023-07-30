package SingletonFactoryDesignPattern;

public class CPPCodePlatform implements CodePlatform{
    private static CPPCodePlatform cppCodePlatformInstance = null;

    private CPPCodePlatform(){}

    public static CPPCodePlatform getCPPCodePlatformInstance(){
        if(cppCodePlatformInstance == null) {
//            CPPCodePlatform.cppCodePlatformInstance = new CPPCodePlatform();
            synchronized (CPPCodePlatform.class) {
                if(cppCodePlatformInstance == null) {
                    CPPCodePlatform.cppCodePlatformInstance = new CPPCodePlatform();
                }else {
                    return CPPCodePlatform.cppCodePlatformInstance;
                }
            }
        }
        return CPPCodePlatform.cppCodePlatformInstance;
    }
    @Override
    public void execute(Code code) {
        System.out.println("CPP Platform executing C++ Code provided in CPPCode Object...");
    }
}
