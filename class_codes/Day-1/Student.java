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
<<<<<<< HEAD:class_codes/Day-1/Student.java
        Student s2 = new Student("Dhandam",95,309);
=======
        Student s2 = new Student("Dhandapani",95,309);
>>>>>>> 341c5eb0a30e7e3217a7944ab49ce14678854235:codes/Day-1/Student.java
        s2.display();
    }

}
