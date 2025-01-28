import java.util.Scanner;

public class Input1
{
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String val = s.nextLine();
        String[] arr = val.split("\\s+");
        for (int i=0; i<arr.length; i++){
            System.out.print(" " + Integer.parseInt(arr[i]) );
        }
    }
}