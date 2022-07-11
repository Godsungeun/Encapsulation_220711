package practicepack.test2;
import practicepack.test.ExampleImport; //import문 사용

public class PackageImp {
    public static void main(String[] args){
        /*practicepack.test.ExampleImport example = new practicepack.test.ExampleImport();
        example.print();*/
        ExampleImport x = new ExampleImport(); //패키지명 생략 가능
        x.print();
    }
}
