package SingletonFactoryDesignPattern;

public class CodeFactory {
    private String codeType;
    private Code codeTypeInstance;

    public CodeFactory(String codeType) {
        this.codeType = codeType;
        codeTypeObjectFactory(this.codeType);
    }

    private void codeTypeObjectFactory(String codeType) {
        switch(codeType){
            case "JAVA": this.codeTypeInstance = new JavaCode(); break;
            case "PYTHON": this.codeTypeInstance = new PythonCode(); break;
            case "CPP": this.codeTypeInstance = new CPPCode(); break;
        }
        //setCodeTypeInstance(this.codeTypeInstance);
    }

    public Code getCodeTypeInstance() {
        return codeTypeInstance;
    }

    public void setCodeTypeInstance(Code codeTypeInstance) {
        this.codeTypeInstance = codeTypeInstance;
    }
}
