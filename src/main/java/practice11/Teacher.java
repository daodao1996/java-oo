package practice11;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person{
    private LinkedList<Klass> classes = new LinkedList<>();

    Teacher(String name, int age, int id, LinkedList<Klass> klass) {
        super(name, age, id);
        this.classes = klass;
        initTeacher();
    }

    Teacher(String name, int age, int id) {
        super(name, age, id);
    }

    public String introduce(){
        if(classes.size()>0){
            List<String> classesName = new ArrayList<>();
            Iterator<Klass> iter = classes.iterator();
            while(iter.hasNext()){
                classesName.add(String.valueOf(iter.next().getNumber()));
            }
            return super.introduce()+" I am a Teacher. I teach Class "+ StringUtils.join(classesName, ", ")+".";
        }else{
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
    }

    private void initTeacher(){
        for(Klass k:classes){
            k.setTeacher(this);
        }
    }

    public String introduceWith(Student s){
        if(classes.contains(s.getKlass())){
            return super.introduce()+" I am a Teacher. I teach "+s.getName()+".";
        }else{
            return super.introduce()+" I am a Teacher. I don't teach "+s.getName()+".";
        }
    }

    public List<Klass> getClasses(){
        return this.classes;
    }

    public boolean isTeaching(Student s){
        if(this.classes.contains(s.getKlass()) && s.getKlass().isIn(s)){
            return true;
        }else{
            return false;
        }
    }

    public void feedbackAppendClass(Student s){
        System.out.print("I am "+ super.getName() +". I know "+s.getName()+" has joined Class "+s.getKlass().getNumber()+".\n");
    }

    public void feedbackBecomeLeader(Student s){
        System.out.print("I am "+ super.getName() +". I know "+s.getName()+" become Leader of Class "+s.getKlass().getNumber()+".\n");
    }
}
