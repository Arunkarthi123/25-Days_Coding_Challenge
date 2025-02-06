public class Stack1
{
    public static void main(String[] stk)
    {
        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        System.out.println(stack);

    }
       
}
class Stack
{
    private int top;
    private int cap;
    private int[] arr;        
    public Stack(int n)
    {
        this.top = -1;
        this.cap = n;
        arr = new int[cap];
    }
    private boolean isFull()
    {
        return cap == top +1;
    }
    public void push(int val)
    {
        if(isFull())
        {
            System.out.println("Stack is full !!");
            return ;
        }
        arr[++top] = val;
    }
    public boolean imEmpty()
    {
        return top == -1;
    }
    public int pop()
    {
        if(imEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }
    public int peek()
    {
        if(imEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
    public int size()
    {
        return top +1;
    }
    public String toString()
    {
        String str = "[ ";
        for(int i =0;i<=top;i++)
        {
            str =str + arr[i]+" ";
        }
        return str+"]";
    }static class Stack
{
    private int top;
    private int cap;
    private int[] arr;        
    public Stack(int n)
    {
        this.top = -1;
        this.cap = n;
        arr = new int[cap];
    }
    private boolean isFull()
    {
        return cap == top +1;
    }
    public void push(int val)
    {
        if(isFull())
        {
            System.out.println("Stack is full !!");
            return ;
        }
        arr[++top] = val;
    }
    public boolean imEmpty()
    {
        return top == -1;
    }
    public int pop()
    {
        if(imEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }
    public int peek()
    {
        if(imEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
    public int size()
    {
        return top +1;
    }
    public String toString()
    {
        String str = "[ ";
        for(int i =0;i<=top;i++)
        {
            str =str + arr[i]+" ";
        }
        return str+"]";
    }
}
}
