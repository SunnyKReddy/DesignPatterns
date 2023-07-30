package SingletonFactoryDesignPattern;

public class JavaCode implements  Code{
    public String code;

    public JavaCode() {
        System.out.println("JavaCode object created...");
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }
}
