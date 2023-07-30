package SingletonFactoryDesignPattern;

public class CodePlatformFactory {
//    private static CodePlatformFactory codePlatformFactoryInstance;
    private String codePlatformType;
    private CodePlatform codePlatformInstance;

    public CodePlatformFactory(String codePlatformType) {
        this.codePlatformType = codePlatformType;
        codePlatformObjectFactory(this.codePlatformType);
    }

//    private CodePlatformFactory(String codePlatformType) {
//        this.codePlatformType = codePlatformType;
//    }

//    public static CodePlatform getCodePlatformFactoryInstance(String codePlatformType){
//        if(codePlatformFactoryInstance == null) {
//            synchronized (CodePlatformFactory.class) {
//                if(codePlatformFactoryInstance == null) {
//                    CodePlatformFactory.codePlatformFactoryInstance = new CodePlatformFactory(codePlatformType);
//                }
//            }
//        }
//        CodePlatformFactory.codePlatformObjectFactory(CodePlatformFactory.codePlatformType);
//        return CodePlatformFactory.codePlatformInstance;
//    }

    private void codePlatformObjectFactory(String codePlatformType) {
        switch (codePlatformType) {
            case "JAVA": this.codePlatformInstance = JavaCodePlatform.getJavaCodePlatformInstance(); break; //For every execution of a Java code only single platform object will be created
            case "PYTHON": this.codePlatformInstance = new PythonCodePlatform(); break; //For every execution of a Python code, different platform objects will be created
            case "CPP": this.codePlatformInstance = CPPCodePlatform.getCPPCodePlatformInstance(); break; //For every execution of a CPP code only single platform object will be created
        }
    }

    public CodePlatform getCodePlatformInstance() {
        return codePlatformInstance;
    }

    public void setCodePlatformInstance(CodePlatform codePlatformInstance) {
        this.codePlatformInstance = codePlatformInstance;
    }
}
