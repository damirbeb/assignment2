public class Employee extends Person{
    private String position;
    private double salary;

    //Constructor
    public Employee(String name, String surname, String position, double salary){
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }
    //Getters and setters
    @Override
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    //Earnings is salary
    @Override
    public double getPaymentAmount(){
        return salary;
    }
}
