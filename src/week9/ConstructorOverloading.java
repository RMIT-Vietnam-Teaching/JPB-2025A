import java.util.Scanner;

public class ConstructorOverloading {
    // Create a class called `Person` with the following fields:
    // - `name` of type `String`
    // - `age` of type `int`
    // - Provide a constructor that takes in `name` and `age` as parameters
    public static class Person {
        private String name;
        private int age;

        // Default constructor
        public Person() {
            name = "Default Name";
            age = 20;
        }

        // Constructor with parameters
        public Person(String name, int age) {
            name = name;
            age = age;
        }

        // Provide getter and setter for the fields
        public void setName(String intputName) {
            name = intputName;
        }

        public String getName() {
            return name;
        }

        public void setAge(int inputAge) {
            age = inputAge;
        }

        public int getAge() {
            return age;
        }

        public void printPersonDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("--------------------");
        }
    }

    // - In the `main` method, create an instance of `Person` using the constructor and pass the `name` and `age` as arguments
    // - Print the `name` and `age` fields
    public static void main(String[] args) {
        // Use scanner to get the name and age from the user
        Scanner scanner = new Scanner(System.in);

        // Create the first person object using the default constructor
        Person person1 = new Person();
        System.out.println("Enter name 1: ");
        String name1 = scanner.nextLine();
        person1.setName(name1);
        System.out.println("Enter age 1: ");
        int age1 = scanner.nextInt();
        person1.setAge(age1);
        System.out.println("Person 1 details:");
        person1.printPersonDetails();

        // Create the second person object using the constructor with parameters
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter name 2: ");
        String name2 = scanner.nextLine();
        System.out.println("Enter age 2: ");
        int age2 = scanner.nextInt();
        Person person2 = new Person(name2, age2);
        System.out.println("Person 2 details:");
        person2.printPersonDetails();

        scanner.close();
    }
}
