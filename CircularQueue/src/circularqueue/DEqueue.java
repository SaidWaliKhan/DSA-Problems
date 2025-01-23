 
//package circularqueue;
//
//public class DEqueue<T>
//{
//    T[] arr = (T[]) new Object[5];
//
//    int head = 0, tail = -1;
//
//    private boolean isEmpty()
//    {
//        return (head > tail);
//        //tail<=-1;
//    }
//    private boolean isFull()
//    {
//        return (tail >= arr.length - 1);
//    }
//    public void enqeueAtHead(T value)
//    {
//        if (isFull())
//        {
//            System.out.println("queueuis full");
//        } else
//        {
//            moveBack();
//            arr[head] = value;
//        }
//    }
//
//    private void moveBack()
//    {
//        for (int i = tail; i >= 0; i--)
//        {
//            arr[i + 1] = arr[i];
//        }
//        tail++;
//    }
//
//    public void enqueueAtTail(T value)
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
//    public T dequeueAtHead()
//    {
//        if (isEmpty())
//        {
//            System.out.println("Queue is empty.");
//            return null;
//        }
//        return arr[head++];
//    }
//
//    public T dequeueAtTail()
//    {
//        if (isEmpty())
//        {
//            return null;
//        } else
//        {
//            return arr[tail--];
//        }
//    }
//
//    public int size()
//    {
//        return (tail - head) + 1;
//
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
//    public void traverse()
//    {
//        while (head <= tail)
//        {
//            System.out.println(arr[head++] + " ");
//
//        }
//    }
//
//    public static void main(String[] args)
//    {
//        DEqueue<Integer> q = new DEqueue<>();
//        q.enqeueAtHead(3);
//        q.enqeueAtHead(5);
//        q.dequeueAtHead();
//        System.out.println(q.size());
//    }
//}

public class DEqueue<T>
{

    T[] arr = (T[]) new Object[5];
    int head = 0, tail = -1;

    private boolean isEmpty()
    {
        return (head > tail);
    }

    private boolean isFull()
    {
        return (tail >= arr.length - 1);
    }

    public void enqueueAtTail(T value)
    {
        if (isFull())
        {
            System.out.println("queue is Full");
            return;
        } else
        {
            arr[++tail] = value;
        }
    }
    public T dequeueAtHead()
    {
        if (isEmpty())
        {
            System.out.println("the queue is Empty");
            return null;
        } else
        {
            return arr[head++];
        }
    }

    public T dequeueAtTail()
    {
        if (isEmpty())
        {
            System.out.println("the queue is Empty");
            return null;
        } else
        {
            return arr[tail--];
        }
    }

    public void equeueAtHead(T value)
    {
        if (isFull())
        {
            System.out.println("the queue is full");
            return;
        } else
        {
            moveBack();
            arr[head] = value;
        }
    }

    private void moveBack()
    {
        for (int i = tail; i >= 0; i--)
        {
            arr[i + 1] = arr[i];
        }
        tail++;
    }

    public int size()
    {
        return (tail + 1);
    }

    public T front()
    {
        if (isEmpty())
        {
            return null;
        }
        return arr[head];
    }
    
    
    
    
    public static void main(String[] args)
    {
        DEqueue <Integer> d = new DEqueue<> ();
        d.enqueueAtTail(4);
        d.enqueueAtTail(5);
        System.out.println(d.size());
        d.equeueAtHead(6);
        d.equeueAtHead(9);
        System.out.println(d.size());
        System.out.println(d.front());
    }
    
    
}
 