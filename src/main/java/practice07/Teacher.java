package practice07;

public class Teacher extends Person{
    private Klass klass = new Klass();

    Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    Teacher(String name, int age) {
        super(name, age);
        this.klass.setNumber(-1);
    }

    public String introduce(){
        if(klass.getNumber()!=-1){
            return super.introduce()+" I am a Teacher. I teach Class "+klass.getNumber()+".";
        }else{
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
    }

    public String introduceWith(Student s){
        if(s.getKlass().getNumber() == klass.getNumber()){
            return super.introduce()+" I am a Teacher. I teach "+s.getName()+".";
        }else{
            return super.introduce()+" I am a Teacher. I don't teach "+s.getName()+".";
        }
    }

    public Klass getKlass(){
        return this.klass;
    }
}
