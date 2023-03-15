import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double number;
        boolean anyNumber = false;
        double minNumber = Double.MAX_VALUE;
        double maxNumber = Double.MIN_VALUE;

        while (true) {
            System.out.println("Enter a number, or any character to quit:");

            try {
                number = Double.parseDouble(scanner.nextLine());

                if (number > maxNumber) {
                    maxNumber = number;
                }

                if (number < minNumber) {
                    minNumber = number;
                }

                anyNumber = true;

            } catch (NumberFormatException nfe) {
                break;
            }
        }

        if (anyNumber) {
            System.out.println("Min = " + minNumber + ", Max = " + maxNumber);
        } else {
            System.out.println("No valid data entered");
        }
    }
}
