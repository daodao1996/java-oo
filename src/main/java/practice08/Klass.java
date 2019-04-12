package practice08;

public class Klass {
    private int number;
    private String displayName;
    private String leader;

    Klass(){}

    Klass(int number){
        this.number = number;
        this.displayName = "Class "+number;
    }

    public void assignLeader(Student s){
        this.leader = s.getName();
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

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }
}
