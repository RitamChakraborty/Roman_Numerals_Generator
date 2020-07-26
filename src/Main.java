import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number (less than 3999): ");
            int num = scanner.nextInt();

            System.out.println("Enter '0' to exit.");

            if (num == 0) {
                break;
            }
        }
    }
}
