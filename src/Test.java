import java.util.InputMismatchException;
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Podaj imię:");
            String firstName = scanner.nextLine();
            System.out.println("Podaj nazwisko:");
            String lastName = scanner.nextLine();
            System.out.println("Podaj wiek:");
            int age = scanner.nextInt();
            System.out.println("Podaj pesel:");
            int pesel = scanner.nextInt();
            Person person = new Person(firstName, lastName, age, pesel);
            System.out.println(person);
        } catch (InputMismatchException e) {
            System.err.println("Podana wartość jest nieprawidłowa");
        } catch (NameUndefinedException | IncorrectAgeException e) {
            System.err.println(e.getMessage());
        }

    }
}
