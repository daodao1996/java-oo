package practice10;

public class Person {
    private String name;
    private int age;
    private int id;

    Person(String name,int age,int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String introduce(){
        return "My name is "+name+". I am "+age+" years old.";
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
