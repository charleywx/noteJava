package bean;

public class ClassA implements OneInterface {
    public ClassA() {
        System.out.println("进入ClassA的构造方法");
    }

    public void doSomeThing() {
        System.out.println("进入ClassA的doSomeThing方法");
    }

    public void init() {
        System.out.println("进入ClassA的init方法");
    }
}