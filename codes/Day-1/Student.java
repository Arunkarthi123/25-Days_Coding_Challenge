public class Student
{
    public String name;
    public int rollnum;
    public int mark;
    void display()
    {
        System.out.println("name: "+name+" \nroll num : "+rollnum+" \nmarks :"+mark);
    }
    Student(String n , int m , int rn)
    {
        this.name=n;
        this.mark=m;
        this.rollnum=rn;
    }
    static public void main(String [] args)
    {
        Student s1 = new Student("Arun",100,77);
        s1.display();
        Student s2 = new Student("Dhandu",95,309);
        s2.display();
    }

}