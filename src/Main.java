import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    //Main menu
    public static void welcome(){
        System.out.println("Welcome! What do you want to do? (Choose number)");
        System.out.println("1. Add student");
        System.out.println("2. Add employee");
        System.out.println("3. See people");
        System.out.println("4. Break");
        System.out.print("Here: ");
    }
    public static void main(String[] args) {
        //Creating an array for people
        ArrayList<Person> people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int choice;
        welcome();
        choice = scanner.nextInt();

        //Switch case for menu options
        switch(choice){
            case 1:
                addStudent(scanner, people);
                break;
            case 2:
                addEmployee(scanner, people);
                break;
            case 3:
                Collections.sort(people);
                outList(people);
                break;
            case 4:
                break;
            default:
                System.out.println("Try again");
                break;
        }
    }

    //Takes user input with student details (name, surname, GPA) and adds a new 'Student' object to array 'people'.
    private static void addStudent(Scanner scanner, ArrayList<Person> people){
        System.out.print("Name: ");
        String name = scanner.next();

        System.out.print("Surname: ");
        String surname = scanner.next();

        System.out.print("GPA: ");
        double gpa = scanner.nextDouble();

        people.add(new Student(name, surname, gpa));
        System.out.println("Added successfully!");
    }

    //Takes user input with employee details (name, surname, position, salary) and adds a new 'Employee' object to array 'people'.
    private static void addEmployee(Scanner scanner, ArrayList<Person> people){
        System.out.print("Name: ");
        String name = scanner.next();

        System.out.print("Surname: ");
        String surname = scanner.next();

        System.out.print("Position: ");
        String position = scanner.next();

        System.out.print("Salary: ");
        double salary = scanner.nextDouble();

        people.add(new Employee(name, surname, position, salary));
        System.out.println("Added successfully!");
    }

    //Iterates through array and prints people's info with their earnings
    public static void outList(Iterable<Person> people){
        for(Person person : people){
            System.out.println(person.toString() + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}