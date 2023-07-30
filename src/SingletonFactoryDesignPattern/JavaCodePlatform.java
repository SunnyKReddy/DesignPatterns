package SingletonFactoryDesignPattern;

public class JavaCodePlatform implements CodePlatform{
    private static JavaCodePlatform javaCodePlatformInstance = null;
    private JavaCodePlatform() {}

    public static JavaCodePlatform getJavaCodePlatformInstance(){
        if(javaCodePlatformInstance == null) {
            synchronized (CPPCodePlatform.class) {
                if(javaCodePlatformInstance == null) {
                    JavaCodePlatform.javaCodePlatformInstance = new JavaCodePlatform();
                }else {
                    return JavaCodePlatform.javaCodePlatformInstance;
                }
            }
        }
        return JavaCodePlatform.javaCodePlatformInstance;
    }
    @Override
    public void execute(Code code) {
        System.out.println("Java Platform executing Java Code provided in JavaCode Object...");
    }
}
