package testpakage;
class Animal{
    void eat(){
        System.out.println("eating");
    }
}
class Dog extends Animal{
    void breaking(){
        System.out.println("breaking");
    }
}
class Employee{
    float slary = 120000;
    void mess(){
        System.out.println("eat");
    }
}
class programmer extends Employee{
    int bouns = 20000;
}
class ashik extends programmer{
    String name = "ashik";
}
class laboni extends Animal  {
    String name = "laboni";
}
public class inheritanceTest{
    public static void main(String[] args) {
        Dog tomy = new Dog();
        tomy.breaking();
        tomy.eat();
    }
}