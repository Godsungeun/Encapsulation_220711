package package2;
import package1.Parent;


class Child extends package1.Parent {
    public void printEach(){
/*            System.out.println(a); 에러 발생
        System.out.println(b);*/
        System.out.println(c); // 다른패키지의 하위 클래스이므로 가능
        System.out.println(d);
    }
}


public class Test2 {
    public static void main(String[] args){
        Parent p = new Parent();

        /*System.out.println(p.a);
        System.out.println(p.b); //
        System.out.println(p.c); // 하위클래스도 아니므로 불가 */
        System.out.println(p.d);
    }
}