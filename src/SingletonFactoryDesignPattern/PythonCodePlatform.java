package SingletonFactoryDesignPattern;

public class PythonCodePlatform implements CodePlatform{
    @Override
    public void execute(Code code) {
        System.out.println("Python Platform executing Python Code provided in PythonCode Object...");

    }
}
