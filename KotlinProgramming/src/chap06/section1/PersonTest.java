package chap06.section1;

class Person{
    private String name;
    private int age;

    //생성자
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //게터와 세터
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Main{
    public static void main(String[] args){
        Person p1 = new Person("song", 29);
        // p1.name = "dooly";
    }
}
public class PersonTest {
}
