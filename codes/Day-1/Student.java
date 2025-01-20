public class Student
{
    public String name;
    public int rollnum;
    public int mark;
    void display()
    {
        System.out.println("name: "+name+" roll num : "+rollnum+" marks :"+mark);
    }
    static public void main(String [] args)
    {
        Student s1 = new Student();
        System.out.println(s1);
        Student s2 = new Student();
        System.out.println(s2);
    }

}