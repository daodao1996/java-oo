package practice02;

public class Student extends Person{
    private int klass;

    Student(String name, int age ,int klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce(){
        return "I am a Student. I am at Class "+klass+".";
    }

    public int getKlass(){
        return this.klass;
    }
}
