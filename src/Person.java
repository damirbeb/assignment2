public abstract class Person implements Payable, Comparable<Person> {
    //Creating an id
    private static int idCount = 1;

    private final int id;
    private String name;
    private String surname;

    public Person(){
        this.id = idCount++;
    }
    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }

    //Constructor
    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }

    //Getters and setters
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    //Represents a person
    @Override
    public String toString(){
        return getPosition() + ": " + getID() + ". " + getName() + " " + getSurname();
    }
    public abstract String getPosition();
}
