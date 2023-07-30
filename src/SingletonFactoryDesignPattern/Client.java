package SingletonFactoryDesignPattern;

import java.util.HashMap;

public class Client {
    public static HashMap<String, CodePlatformFactory> codePlatformFactoryHashMap = new HashMap<>();
    public static CodePlatformFactory codePlatformFactory;
    public static void main(String[] args) {
//        CodeTypeOptions inputCodeType;
//        CodeTypeOptions inputCode;
//        CodeFactory codeFactory = new CodeFactory("JAVA");
//        Code code = codeFactory.getCodeTypeInstance();
//        code.setCode("Java Code { } test.java");
//        CodePlatformFactory codePlatformFactory = new CodePlatformFactory("JAVA");
//        CodePlatform codePlatform = codePlatformFactory.getCodePlatformInstance();
//        codePlatform.execute(code);

        // Java Compiler, Java Code
        String inputCodeType = "JAVA";
        String inputCode = "Java Code { System.out.println('Hello World!'); } -> test.java";
        Client.exeuteCode(inputCodeType, inputCode);

        // Python Compiler, Python Code
        inputCodeType = "PYTHON";
        inputCode = "def: print('Python Code')";
        Client.exeuteCode(inputCodeType, inputCode);

        //CPP Compiler, CPP Code
        inputCodeType = "CPP";
        inputCode = "std::cout << \'Hello World!\'";
        Client.exeuteCode(inputCodeType, inputCode);

        // Java Compiler, Java Code
        inputCodeType = "JAVA";
        inputCode = "Java Code { System.out.println('Programmers World!'); } -> FirstCode.java";
        Client.exeuteCode(inputCodeType, inputCode);

        // Python Compiler, Python Code
        inputCodeType = "PYTHON";
        inputCode = "def: print('Django Web Development Framework')";
        Client.exeuteCode(inputCodeType, inputCode);

        //CPP Compiler, CPP Code
        inputCodeType = "CPP";
        inputCode = "std::cout << \'C Object oriented features, Let's develop games!\'";
        Client.exeuteCode(inputCodeType, inputCode);
    }
    public static void exeuteCode(String inputCodeType, String inputCode){
        CodeFactory codeFactory = new CodeFactory(inputCodeType);
        Code code = codeFactory.getCodeTypeInstance();
        code.setCode(inputCode);
        if(!codePlatformFactoryHashMap.containsKey(inputCodeType)) {
            codePlatformFactory = new CodePlatformFactory(inputCodeType);
            codePlatformFactoryHashMap.put(inputCodeType, codePlatformFactory);
        }else {
            codePlatformFactory = codePlatformFactoryHashMap.get(inputCodeType);
        }
        System.out.println("Code Platform Factory of: " + inputCodeType + " is -> " + codePlatformFactory);
        CodePlatform codePlatform = codePlatformFactory.getCodePlatformInstance();
        System.out.println("Code Platform of: " + inputCodeType + " is -> " + codePlatform);
        codePlatform.execute(code);
        System.out.println(code.getCode());
        System.out.println("--------------------------------------");
        System.out.println();
    }
}
