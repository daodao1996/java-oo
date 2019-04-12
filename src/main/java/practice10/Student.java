package practice10;

public class Student extends Person{
    private Klass klass;

    Student(String name, int age , int id,Klass klass) {
        super(name, age,id);
        this.klass = klass;
    }

    public String introduce(){
        if(klass.getLeader() == null || !klass.getLeader().getName().equals(super.getName())) {
            return super.introduce()+" I am a Student. I am at Class "+klass.getNumber()+".";
        }else{
            return super.introduce()+" I am a Student. I am Leader of Class "+klass.getNumber()+".";
        }
    }

    public Klass getKlass(){
        return this.klass;
    }
}
