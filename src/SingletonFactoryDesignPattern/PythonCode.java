package SingletonFactoryDesignPattern;

public class PythonCode implements Code{
    private String code;

    public PythonCode() {
        System.out.println("PythonCode object created...");
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
