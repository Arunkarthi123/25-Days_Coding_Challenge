class Vote
{
    String name;
    private int id;
    private int age;
    private boolean eligible;
    public Vote(String name)
    {
        this.name=name;
    }
}
public class Citizen
{
    static public void main(String[] args)
    {
        Vote c1 = new Vote("Arun");

    }
}