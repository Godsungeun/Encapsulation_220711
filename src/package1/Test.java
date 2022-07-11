package package1;

public class Test {
    public static void main(String[] args) {
        Parent p = new Parent();

        // System.out.println(p.a);  동일 클래스가 아니기 때문에 에러!
        System.out.println(p.b);
        System.out.println(p.c);
        System.out.println(p.d);
    }
}
