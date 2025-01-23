package queue;

//public class Queues_first<T>      // shrink one
//{
//    T[] arr = (T[]) new Object[5];
//
//    int head = 0, tail = -1;
//
//    private boolean isEmpty()
//    {
//        return (tail <= -1);   // head >tail
//        
//    }
//    private boolean isFull()
//    {
//        return (tail >= arr.length - 1);
//    }
//
//    public void enqueue(T value)
//    {
//        if (isFull())
//        {
//            System.out.println("Shy full de"); 
//            return;
//        }
//        arr[++tail] = value;
//
//    }
//
//    public T dequeue()
//    {
//        if (isEmpty())
//        {
//            System.out.println("Queue is empty.");
//            return null;
//        }
//        return arr[head++];
//    }
//
//    public T front()
//    {
//        if (isEmpty())
//        {
//            return null;
//        } else
//        {
//            return arr[head];
//        }
//    }
//
//    public int size()
//    {
//        return (tail + 1);
//
//    }
//
//    public void traverse()
//    {
//        while (head <= tail)
//        {
//            System.out.println(arr[head++] + " ");
//
//        }
//    }
    
    
    
    
    
    
    
    public class Queues_first{
        int [] arr = new int[5];
        int head=0, tail=-1;
        
        public boolean isEmpty(){
            return (tail <= -1);
    }
    
                public boolean isFull(){
            return (tail >= arr.length -1);
    }
                
    public void enqueue(int val){
        if(isFull()){
            System.out.println("queue is full");
        }
        arr[++tail] = val;
    }    
    
        public int dequ(){
        if(isEmpty()){
            System.out.println("queue is Emoty");
        }
        return arr[head++];
    } 
        
        public int size(){
            return (tail +1);
        }
        
        public void traverse(){
            while(head <= tail ){
                System.out.println(" " + arr[head++]);
            }
        }
        
        public int front(){
            return arr[tail];
        }
    
    
    

    public static void main(String[] args)
    {
//        Queues_first<Integer> q = new Queues_first<>();
        
        Queues_first q = new Queues_first();
        q.enqueue(2);
        q.enqueue(8);
        q.enqueue(4);
        q.enqueue(6);
        q.enqueue(9);
        System.out.println("the front is =" + q.front());
        System.out.println("the size is =" + q.size());
        System.out.println("the deque value is  = " + q.dequ());
        System.out.println("the deque value is  = " + q.dequ());
        System.out.println("the deque value is  = " + q.dequ());
        System.out.println("the deque value is  = " + q.dequ());
        System.out.println("the deque value is  = " + q.dequ());
        System.out.println("the size is =" + q.size());

    }
}
