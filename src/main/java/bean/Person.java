package bean;

public class Person {
    
    public String name;
    
    public int age;
    
    Person() {
    
    }
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public static Person getPerson(String name, int age) {
        Person p = new Person();
        p.name = name;
        p.age  = age;
        return p;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}
