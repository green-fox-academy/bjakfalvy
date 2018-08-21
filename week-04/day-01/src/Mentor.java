public class Mentor extends Person {
    private String level;

    public void getGoal(){
        System.out.println("Educate brilliant junior software developers.");
    }

    public void introduce(){
        System.out.println("Hi, I'm " + name + ", a " + name + " year old "
                + gender + level + " mentor.");
    }

    public Mentor(String name, int age, String gender, String level){
        super(name,age,gender);
        this.level = "intermediate";
    }
    public Mentor(){
        this.level = "intermediate";
    }
}
