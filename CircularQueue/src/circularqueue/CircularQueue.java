
package circularqueue;

   public class CircularQueue<T>{
    T[] arr =(T[]) new Object[5];
    int head =0, tail=0;
    int n = arr.length;
    public boolean isEmpty(){
        return(head == tail);
    }
    public boolean isFull(){
        return((tail-head) == n);
    }
    
    public int size(){
        return(tail-head);
    } 
    
    public void enqueue(T value){
        if(isFull()){
            System.out.println("queueu is full");
        }
        else{
            arr[tail % n] = value;
            tail++;
        }
    }
    
    public T dequeue(){
        if(isEmpty()){
            return null;
        }
        else 
        {
            return arr[head++ % n];
        }
    }
    
        public T front(){
        if(isEmpty()){
            return null;
        }
        else 
        {
            return arr[head % n];
        }
    }



        
        public static void main(String[] args)
    {
        CircularQueue<Integer> c = new CircularQueue<>();
        c.enqueue(1);
        c.enqueue(2);
        c.size();
        System.out.println(c.front());
        
      

      
    }
}

