import java.util.Scanner;
import java.util.regex.*;
public class Regex3
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern1 = Pattern.compile("[0-9]{10}");
        Pattern pattern2 = Pattern.compile("^9|^6|^7|^8");
        Matcher matcher1 = pattern1.matcher(input);
        Matcher matcher2 = pattern2.matcher(input);        
        if(matcher1.matches())
        {
            if(matcher2.find())
                System.out.println("The mobile number belongs to South India ...");
            else
                System.out.println("Other States ...");
        }
        else
            System.out.println("Not a valid number ...");
    }
}