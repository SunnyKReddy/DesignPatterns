package SingletonFactoryDesignPattern;

public class CPPCode implements Code{
    private String code;

    public CPPCode() {
        System.out.println("CPP object created...");
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
