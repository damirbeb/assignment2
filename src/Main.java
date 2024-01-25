import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.SortedMap;

public class Main {
    public static void welcome(){
        System.out.println("Welcome! What do you want to do? (Choose number)");
        System.out.println("1. Add student");
        System.out.println("2. Add employee");
        System.out.println("3. See people");
        System.out.println("4. Break");
        System.out.print("Here: ");
    }
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int choice;
        welcome();
        choice = scanner.nextInt();

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

    public static void outList(Iterable<Person> people){
        for(Person person : people){
            System.out.println(person.toString() + " has a " + person.getPaymentAmount() + " tenge");
        }
    }
}