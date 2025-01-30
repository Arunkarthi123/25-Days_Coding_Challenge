import java.util.Scanner;
import java.util.regex.*;
public class Regex1
{
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(".+Karigalan$");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        Matcher m = pattern.matcher(sentence);
        if(m.matches())
        {
            System.out.println("Your name ends with Karigalan !!");
        }
        else
        {
            System.out.println("Your name does not ends with Karigalan !!");
        }
9    }
}