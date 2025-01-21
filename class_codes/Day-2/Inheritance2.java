public class Inheritance2
{
    public static void main(String[] args)
    {
        Cse c = new Cse();
        System.out.println(c.num);
        c.display();
    }
}
class Mcet
{
    int num=100;
    void display()
    {
        System.out.println(num);
    }
}
class Cse extends Mcet
{
    int num=10;
}