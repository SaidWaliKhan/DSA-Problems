 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;

/**
 *
 * @author Dell
 */
public class DeShrink_Queue<T>
{

    T[] arr = (T[]) new Object[5];

    int head = 0, tail = -1;

    private boolean isEmpty()
    {
        return (tail<=-1);   // head >tail
        //tail<=-1;

    }

    private boolean isFull()
    {
        return (tail >= arr.length - 1);
    }

    public void enqueue(T value)
    {
        if (isFull())
        {
            System.out.println("Shy full de");
            return;
        }
        arr[++tail] = value;
    }
    
    public void moveFwrd(){
        for(int i = 1; i <=tail; i++){
            arr[i-1] = arr[i];
        }
        tail--;
    }

    public T dequeue()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty.");
            return null;
        }
        T val =arr[head++];
        moveFwrd();
        return val;
    }

    public int size() 
    {
        return (tail + 1);

    }

    public void traverse()
    {
        while (head <= tail)
        {
            System.out.println(arr[head++] + " ");

        }
    
    }
    public static void main(String[] args)
    {
        DeShrink_Queue<Integer> q = new DeShrink_Queue<>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(3);
        q.enqueue(3);

        System.out.println("the size is " + q.size());
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        System.out.println("the size is " + q.size());
        q.enqueue(10);
        System.out.println("the size is " + q.size());
//        q.traverse();
    }
    
}