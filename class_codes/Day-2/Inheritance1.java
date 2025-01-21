        
        public class Inheritance1
        {
            public static void main(String args[])
            {
                Programmer p = new Programmer();
                System.out.println(p.Salary);
            }
        }
        class Programmer extends Emp // child class 
        {
            int Bonus = 100;
            
        } 
        class Emp // parent class
        {
            int Salary=1000;
        }