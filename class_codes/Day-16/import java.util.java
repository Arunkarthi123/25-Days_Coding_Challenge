import java.util.*;
public class Main 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    int num =0;
    List<Integer> arr1 = new ArrayList<>();
    List<Integer> arr2 = new ArrayList<>();
    for(int i =0;i<s1.length();i++)
    {
      char ch =s1.charAt(i);
      if('0'<=ch && ch <= '9')
      {
        num = (num * 10)+ (ch - '0');
      }
      else
      {
        if(num !=0)
        	arr1.add(num);
        num = 0;
      }
    }
    if(num != 0)
      arr1.add(num);
    num =0;
    for(int i =0;i<s2.length();i++)
    {
      char ch =s2.charAt(i);
      if('0'<=ch && ch <= '9')
      {
        num = (num * 10)+ (ch - '0');
      }
      else
      {
        if(num !=0)
        	arr2.add(num);
        num = 0;
      }
    }
    if(num != 0)
      arr2.add(num);
    int i =0 , j =0;
    while(i != arr1.size() && j != arr2.size())
    {
      if(arr1.get(i) < arr2.get(j))
      {
        System.out.print(arr1.get(i++)+"->");
      }
      else
      {
        System.out.print(arr2.get(j++)+"->");
      }
    }
    for(int k = i ; k< arr1.size() ; k++)
    {
      System.out.print(arr1.get(k)+"->");
    }
    for(int k = j ; k< arr2.size() ; k++)
    {
      System.out.print(arr2.get(k)+"->");
    }
    System.out.print("null");
  }
}