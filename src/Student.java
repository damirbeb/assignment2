public class Student extends Person{
    private double gpa;

    //Constructor
    public Student(String name, String surname, double gpa){
        super(name, surname);
        setGpa(gpa);
    }

    //Getters and setters
    public double getGpa(){
        return gpa;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    //Payment based on GPA
    @Override
    public double getPaymentAmount(){
        return (getGpa() > 2.67) ? 36660 : 0;
    }
    @Override
    public String getPosition(){
        return "Student";
    }
}
