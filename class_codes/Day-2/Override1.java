public class Override1
{
    public static void main(String[] args)
    {
        Lion l1 = new Lion();
        l1.name();

    }
}
class Animal
{
    void name()
    {
        System.out.println("Name is animal");
    }
}
class Lion extends Animal
{
    @Override
    void name()
    {
        System.out.println("Name is lion");
    }
}