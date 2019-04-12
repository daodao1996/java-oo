package practice07;

public class Klass {
    private int number;
    private String displayName;

    Klass(){}

    Klass(int number){
        this.number = number;
        this.displayName = "Class "+number;
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
}
