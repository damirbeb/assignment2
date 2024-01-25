public class Student extends Person{
    private double gpa;

    public Student(){
        super();
    }

    public Student(String name, String surname, double gpa){
        super(name, surname);
        this.gpa = gpa;
    }

    public double getGpa(){
        return gpa;
    }
    public void setGpa(){
        this.gpa = gpa;
    }

    public double hetPaymentAmount(){
        return (gpa > 2.67) ? 36660 : 0;
    }
    @Override
    public String getPosition(){
        return "Student";
    }
}
