import java.util.*;
class Person {
    private final String firstName;
    private final String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

public class FilterNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            persons.add(new Person(sc.next(), sc.next()));
        }

        while (true) {
            System.out.println("1. Print all names");
            System.out.println("2. Print names with first name starting with A");
            System.out.println("3. Print names with last name ending with O");
            System.out.println("4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("All names:");
                    for (Person person : persons) {
                        System.out.println(person);
                    }
                    break;

                case 2:
                    System.out.println("First names starting with A:");
                    for (Person person : persons) {
                        if (person.getFirstName().toUpperCase().startsWith("A")) {
                            System.out.println(person);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Last names ending with O:");
                    for (Person person : persons) {
                        if (person.getLastName().toUpperCase().endsWith("O")) {
                            System.out.println(person);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}