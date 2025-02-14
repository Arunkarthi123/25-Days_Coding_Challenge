public class MinHeapDelete
{
    public static void main(String[] args) 
    {
        Heap heap = new Heap(10);
        heap.display();
        for(int i = 10 ; i >= 1 ; i--)
        {
            heap.insert(i);
        }
        heap.display();
        for(int i = 0 ; i< 10 ; i++)
        {
            System.out.println(heap.delete());
        }
    }
}
class Heap
{
    int n ;
    int ind ;
    int[] arr ;
    public Heap(int size)
    {
        this.n = size;
        this.ind = -1;
        this. arr = new int[n];
    }
    boolean isFull()
    {
        return ind == n - 1;
    }
    int parent(int i )
    {
        return (i - 1) / 2;
    }
    void insert(int data)
    {
        if(this.isFull())
        {
            System.out.println("Heap is full");
            return ;
        }
        int i = ++ind;
        arr[ ind ] = data;
        while( i != 0 && arr[i] < arr[parent(i)])
        {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp ;
            i = parent(i);
        }
    }
    boolean isEmpty()
    {
        return ind == -1;
    }
    int delete()
    {
        if(isEmpty())
        {
            System.out.println("Heap is empty");
            return -1;
        }
        int temp = arr[0];
        int min =0;
        arr[0] = arr[ind--];
        int i =0;
        while(i <= parent(ind))
        {
            i = min;
            int left = ( 2 * min) + 1;
            int right = (2 * min) + 2;
            min = left <= ind && arr[left] < arr[min] ? left : min ;
            min = right <= ind && arr[right] < arr[min] ? right : min;
            if(i != min)
            {
                int t = arr[i];
                arr[i] = arr[min] ;
                arr[min] = t;
            }
            if( i == min)
                break;
            i = min;
        }
        return temp;
    }
    void display()
    {
        if(isEmpty())
        {
            System.out.println("Heap is empty");
            return;
        }
        for(int i = 0 ; i <= ind ; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}