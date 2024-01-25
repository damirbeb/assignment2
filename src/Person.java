import java.util.Scanner;
public abstract class Person {
    protected static idCount;
    static{
        idCount = 1;
    }
    protected int id;
    protected String name;
    protected String surname;

    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }

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
    public void setSurname(){
        this.surname = surname;
    }

    @Override
    public String toString(){
        return getPosition() + ": " + id + ". " + name " " + surname;
    }
    public abstract String getPosition()
}
