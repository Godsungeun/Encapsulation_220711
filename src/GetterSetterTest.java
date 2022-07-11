public class GetterSetterTest {
    public static void main(String[] args){
        Worker w = new Worker();
        w.setName("김코딩");
        w.setAge(30);
        w.setId(5);

        String name = w.getName(); // name에 w.Worker의 name을 가져온다
        /*Worker 안의 name은 private 여서 바로 가져올 수가 없지만,
        public인 getName 메서드를 통해 가져올 수 있다.
        이후에 이 name을 바꾸어도 Worker 안의 name은 바뀌지 않음 */
        System.out.println("근로자의 이름은 " + name);
        int age = w.getAge();
        System.out.println("근로자의 나이는 " + age);
        int id = w.getId();
        System.out.println("근로자의 ID는 " + id);
    }
}

class Worker {
    private String name;
    private int age;
    private int id;

    public String getName(){ // 위에서 같은 String 타입..리턴name
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age < 1) return;
        this.age = age;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
}