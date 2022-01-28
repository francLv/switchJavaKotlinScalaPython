import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InputMismatchException {
        System.out.println("Введите язык, который изучаете: \n" +
                "1. Java \n" +
                "2. Kotlin\n" +
                "3. Scala \n" +
                "4. Python");
        try (Scanner scanner = new Scanner(System.in)) {
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    System.out.println("YES!");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("NO!");
                    break;
                default:
                    System.out.println("Unknown number");
            }
        } catch (InputMismatchException err) {
            System.out.println("Введенные данные не верны");
        }
    }
}
