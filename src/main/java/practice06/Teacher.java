package practice06;

public class Teacher extends Person{
    private int klass;

    Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    Teacher(String name, int age) {
        super(name, age);
        this.klass = -1;
    }

    public String introduce(){
        if(klass!=-1){
            return super.introduce()+" I am a Teacher. I teach Class "+klass+".";
        }else{
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
    }

    public int getKlass(){
        return klass;
    }
}
