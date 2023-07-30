package SingletonFactoryDesignPattern;

public class CodePlatformFactory {
    private String codePlatformType;
    private CodePlatform codePlatformInstance;

    public CodePlatformFactory(String codePlatformType) {
        this.codePlatformType = codePlatformType;
        codePlatformObjectFactory(this.codePlatformType);
    }

    private void codePlatformObjectFactory(String codePlatformType) {
        switch (codePlatformType) {
            case "JAVA": this.codePlatformInstance = JavaCodePlatform.getJavaCodePlatformInstance(); break;
            case "PYTHON": this.codePlatformInstance = new PythonCodePlatform(); break;
            case "CPP": this.codePlatformInstance = CPPCodePlatform.getCPPCodePlatformInstance(); break;
        }
    }

    public CodePlatform getCodePlatformInstance() {
        return codePlatformInstance;
    }

    public void setCodePlatformInstance(CodePlatform codePlatformInstance) {
        this.codePlatformInstance = codePlatformInstance;
    }
}
