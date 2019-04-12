package practice05;

public class Worker extends Person{
    Worker(String name, int age) {
        super(name, age);
    }

    public String introduce(){
        return super.introduce()+" I am a Worker. I have a job.";
    }
}
