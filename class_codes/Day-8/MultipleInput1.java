import java.util.Scanner;

public class MultipleInput1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter some numbers (separated by spaces):");

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("Read: " + number);
        }

        scanner.close();
    }
    
}