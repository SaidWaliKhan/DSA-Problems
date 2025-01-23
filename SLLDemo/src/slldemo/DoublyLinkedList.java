 package slldemo;

//public class DoublyLinkedList<T>
//{
//
//    class Node
//    {
//
//        T data;
//        Node pre;
//        Node next;
//
//    }
//    Node start = null;
//    Node end = null;
//
//    public boolean isEmpty()
//    {
//        return (start == null);
//
//    }
//
//    public void insertAtStart(T value)
//    {
//        Node n = new Node();
//        n.data = value;
//        n.pre = null;
//
//        if (isEmpty())
//        {
//            n.next = null;
//            start = end = n;    // if there is no node
//        } else
//        {
//            n.next = start;
//            start.pre = n;
//            start = n;
//        }
//    }
//
//    public void inserAtEnd(T value)
//    {
//        Node n = new Node();
//        n.data = value;
//        n.next = null;
//
//        if (isEmpty())
//        {
//            n.pre = null;
//            start = end = n;
//        } else
//        {
//            n.pre = end;
//            end.next = n;
//            end = n;
//        }
//    }
//
//    public T deleteAtStart()
//    {
//        if (isEmpty())
//        {
//            System.out.println("List is Empty");
//            return null;
//        } else if (start == end)
//        {
//            T value = start.data;    // if there is one node
//            start = end = null;
//            return value;
//        } else
//        {
//            T value = start.data;
//            start = start.next;
//            start.pre = null;
//            return value;
//        }
//    }
//
//    public T deleteAtEnd()
//    {
//        if (isEmpty())
//        {
//            System.out.println("list is empty");
//            return null;
//        } else if (start == null)
//        {
//            T value = start.data;
//            start = end = null;
//            return value;
//        } else
//        {
//            T value = end.data;
//            end = end.pre;
//            end.next = null;
//            return value;
//        }
//    }
//
//    public void traverse()
//    {
//        Node t = start;
//        while (t != null)
//        {
//            System.out.print(t.data + " <-> ");
//            t = t.next;
//        }
//        System.out.println("null");
//    }
//
//    public boolean search(T key)
//    {
//        Node t = start;
//        while (t != null)
//        {
//            if (t.data == key)
//            {
//                return true;
//            }
//            t = t.next;
//        }
//        return false;
//    }
//
//    public Node searchNode(T key)
//    {
//        Node t = start;
//        while (t != null)
//        {
//            if (t.data == key)
//            {
//                return t;
//            }
//            t = t.next;
//        }
//        return null;
//    }
//}



public class DoublyLinkedList
{
    class Node
    { 
        int data;
        Node pre;
        Node next;
    }

    Node start = null;
    Node end = null;

    public boolean isEmpty()
    {
     
        return (start == null);
    }

    public void insertAtStart(int value)
    {
        Node s = new Node();
        s.data = value;
        s.pre = null;

        if (isEmpty())
        {
            s.next = null;
            start = end = s;   // if ther is only one node;

        } else
        {
            s.next = start;
            start.pre = s;
            start = s;
        }
    }

    public void insertAtEnd(int value)
    {
        Node e = new Node();
        e.data = value;
        e.next = null;

        if (isEmpty())
        {
            e.next = null;
            start = end = e;   // if ther is only one node;

        } else
        {
            e.pre = end;
            end.next = e;
            end = e;
        }
    }

    public int deleteAtStart()
    {
        if (isEmpty())
        {
            System.out.println("The list is empty");
            return -1;
        } else
        {
            if (start == end)
            {
                int value = start.data;     // when there is one node
                start = end = null;
                return value;
            } else
            {
                int value = start.data;
                start = start.next;
                start.pre = null;
                return value;
            }
        }
    }

    public int deleteAtEnd()
    {
        if (isEmpty())
        {
            System.out.println("The list is empty");
            return -1;
        } else
        {
            if (start == end)
            {
                int value = start.data;
                start = end = null;
                return value;
            } else
            {
                int value = end.data;
                end = end.pre;
                end.next = null;
                return value;
            }
        }
    }

    public void traverse()
    {
        Node t = start;
        while (t != null)
        {
            System.out.print(t.data + " <-> ");
            t = t.next;
        }
        System.out.println("null");
    }

    public boolean search(int key)
    {
        Node t = start;
        while (t != null)
        {
            if (t.data == key)
            { 
                return true;
            }
            t = t.next;
        }
        return false;
    }

    public Node searchNode(int key)
    {
        Node t = start;
        while (t != null)
        {
            if (t.data == key)
            {
                return t;
            }
            t = t.next;
        }
        return null;
    }

}
