import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex2{
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[0-9]{10}");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);
        if(matcher.matches())
        {
            System.out.println("Your input is a valid mobile number !!!");
        }
        else
        {
            System.out.println("Your input is not a valid mobile number !!!");
        }
    }
}