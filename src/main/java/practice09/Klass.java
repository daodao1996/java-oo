package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private String displayName;
    private Student leader = null;
    private List<String> students = new ArrayList<>();

    Klass(){}

    Klass(int number){
        this.number = number;
        this.displayName = "Class "+number;
    }

    public void assignLeader(Student s){
        if(students.contains(s.getName())){
            this.leader = s;
        }else{
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student s){
        this.students.add(s.getName());
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
}
