public class Syncronized1
{ 
    public static void main(String[] args) {
     MyThread thread1 = new MyThread(5);
     MyThread thread2 = new MyThread(10);
     thread1.start();
     thread2.start();
    }
}
class MyThread extends Thread
{
    public static int num;
    public MyThread(int n)
    {
        num = n ;

    }
    public void run()
    {
        System.out.println(num);
        num *= 10;
    }
}