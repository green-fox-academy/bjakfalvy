public class Sponsor extends Person{
        private String company;
        private int hiredStudents;


    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender +
                " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    public void hire(){
        hiredStudents += 1;
    }

    public void getGoal(){
        System.out.println("Hire brilliant junior software developers.");
    }

    public Sponsor(String name, int age, String gender, String company){
        super(name, age, gender);
        this.hiredStudents = 0;
    }
    public Sponsor(){
        this.company = "Google";
    }
}
