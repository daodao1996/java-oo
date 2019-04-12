package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private String displayName;
    private Student leader = null;
    private List<Integer> students = new ArrayList<>();
    private Teacher teacher=null;

    Klass(){}

    Klass(int number){
        this.number = number;
        this.displayName = "Class "+number;
    }

    public void assignLeader(Student s){
        if(students.contains(s.getId())){
            this.leader = s;
            if(this.teacher != null){
                this.teacher.feedbackBecomeLeader(s);
            }
        }else{
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student s){
        this.students.add(s.getId());
        if(this.teacher != null){
            teacher.feedbackAppendClass(s);
        }
    }

    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public String getDisplayName(){
        return displayName;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public boolean isIn(Student s){
        if(this.students.contains(s.getId())){
            return true;
        }else{
            return false;
        }
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
