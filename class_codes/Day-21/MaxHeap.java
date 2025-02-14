public class MaxHeap
{
    public static void main(String [] args)
    {
        Heap heap = new Heap(5);
        heap.display();
        for(int i = 1 ; i < 7 ; i++)
        {
            heap.insert(i);
        }
        heap.display();
    }
}
class Heap
{
    int n ;
    int ind ;
    int[] arr;
    public Heap(int size)
    {
        this.n = size;
        this.ind = -1;
        this.arr = new int[n];
    }
    int parent(int i)
    {
        return (i - 1) / 2;
    }
    void insert(int data)
    {
        if(ind == n - 1)
        {
            System.out.println("Heap is Full");
            return;
        }
        int i = ++ind;
        arr[ind] = data;
        while(i != 0 && arr[this.parent(i)] < arr[i])
        {
            int temp = arr[i];
            arr[i] = arr[this.parent(i)];
            arr[this.parent(i)] = temp;
            i = this.parent(i);
        }
    }
    void display()
    {
        System.out.println();
        if(ind == -1)
            System.out.println("Heap is empty");
        for(int i =0 ; i <= ind ; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}