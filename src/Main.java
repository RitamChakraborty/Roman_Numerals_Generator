import controller.RomanNumeralConvector;
import exceptions.NumberOverflowException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean correctInput = false;
            int num = 0;

            while (!correctInput) {
                System.out.println("Enter number (less than 3999): ");
                String numStr = scanner.next();

                try {
                    num = Integer.parseInt(numStr);

                    if (num < 0 || num > 3999) {
                        throw new NumberOverflowException();
                    } else if (num != 0) {
                        correctInput = true;
                        RomanNumeralConvector romanNumeralConvector = new RomanNumeralConvector();
                        String roman = romanNumeralConvector.convertToRoman(num);

                        System.out.println(num + " in roman numeral is: " + roman);
                    } else {
                        correctInput = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a number!\n");
                } catch (NumberOverflowException e) {
                    System.out.println(e.getMessage() + "\n");
                }
            }

            if (num == 0) {
                break;
            } else {
                System.out.println("Enter '0' to exit.\n");
            }
        }
    }
}
