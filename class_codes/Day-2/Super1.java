public class Super1
{
    public static void main(String[] args)
    {
        Son s1 = new Son();
        s1.setDetails("Arun", 20, "Briyani", "Student");
        s1.setFatherdetails("Kandasamy", 54, "Parusadam", "Farmer");
        s1.setGrandfatherdetails("Sellamuthu", 87, "chicken", "BussinessMan");
        System.out.println("Son Details : ");
        s1.getDetails();
        System.out.println("Father Details : ");
        s1.getFatherDetails();
        System.out.println("Grandfather Details :");
        s1.getGrandfatherDetails();      
        // System.err.println(s1.getFatherName());  
    }
} 
class Son extends Father
{
    String name;
    int age;
    String favfood;
    String occupation;
    void setDetails(String name,int age,String favfood,String occ)
    {
        this.name = name;
        this.age = age;
        this.favfood = favfood;
        this.occupation = occ;
    }
    void setFatherdetails(String name,int age,String favfood,String occ)
    {
        super.setDetails(name, age, favfood, occ);
    }
    void setGrandfatherdetails(String name,int age,String favfood,String occ)
    {
        super.setFatherdetails(name, age, favfood, occ);
    }
    void getDetails()
    {
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("Favourite : "+this.favfood);
        System.out.println("Occupation : "+this.occupation);
    }
    void getFatherDetails()
    {
        super.getDetails();
    }
    void getGrandfatherDetails()
    {
        super.getFatherDetails();
    }
    String getName()
    {
        return this.name;
    }
    int getAge()
    {
        return this.age;
    }
    String getFavfood()
    {
        return this.favfood;
    }
    String getOcc()
    {
        return this.occupation;
    }
    String getFatherName()
    {
        return super.name;
    }
    int getFatherAge()
    {
        return super.age;
    }
    String getFatherFavfood()
    {
        return super.favfood;
    }
    String getFatherOcc()
    {
        return super.occupation;
    }
    String getGrandfatherName()
    {
        return super.getFatherName();
    }
    int getGrandfatherAge()
    {
        return super.getFatherAge();
    }
    String getGrandfatherFavfood()
    {
        return super.getFatherFavfood();
    }
    String getGrandfatherOcc()
    {
        return super.getFatherOcc();
    }

}
class Father extends Grandfather
{
    protected String name;
    protected int age;
    protected String favfood;
    protected String occupation;
    void setDetails(String name,int age,String favfood,String occ)
    {
        this.name = name;
        this.age = age;
        this.favfood = favfood;
        this.occupation = occ;
    }
    void setFatherdetails(String name,int age,String favfood,String occ)
    {
        super.setDetails(name, age, favfood, occ);
    }
    void getDetails()
    {
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("Favourite : "+this.favfood);
        System.out.println("Occupation : "+this.occupation);
    }
    void getFatherDetails()
    {
        super.getDetails();
    }
    
    String getName()
    {
        return this.name;
    }
    int getAge()
    {
        return this.age;
    }
    String getFavfood()
    {
        return this.favfood;
    }
    String getOcc()
    {
        return this.occupation;
    }
    String getFatherName()
    {
        return super.name;
    }
    int getFatherAge()
    {
        return super.age;
    }
    String getFatherFavfood()
    {
        return super.favfood;
    }
    String getFatherOcc()
    {
        return super.occupation;
    }


}
class Grandfather 
{
    protected  String name;
    protected int age;
    protected String favfood;
    protected String occupation;
    void setDetails(String name,int age,String favfood,String occ)
    {
        this.name = name;
        this.age = age;
        this.favfood = favfood;
        this.occupation = occ;
    }
    void getDetails()
    {
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("Favourite : "+this.favfood);
        System.out.println("Occupation : "+this.occupation);
    }
    String getName()
    {
        return this.name;
    }
    int getAge()
    {
        return this.age;
    }
    String getFavfood()
    {
        return this.favfood;
    }
    String getOcc()
    {
        return this.occupation;
    }
}