 package slldemo;
//
//public class SinglyLinkedList
//{
//    class Node
//    {
//        int data;
//        Node next;
//    }
//    
//    Node start = null;
//   
//    
//    public boolean isEmpty()
//    {
//        if(start == null)
//            return true;
//        return false;
//    }
//    
//    public void insertAtEnd(int value)
//    {
//        Node n = new Node();
//        n.data = value;
//        n.next = null;
//        
//        if(isEmpty())
//            start = n;
//        else
//        {
//            Node t = start;
//            while(t.next != null)
//                t = t.next;
//            t.next = n;
//        }
//        
//    }
//    
//    public void insertAtStart(int value)
//    {
//        Node n = new Node();
//        n.data = value;
//        n.next = start;
//        start = n;
//    }
//    
//    public void traverse()
//    {
//        if(isEmpty())
//            System.out.println("List is Empty");
//        else
//        {
//            Node t = start;
//            while(t != null)
//            {
//                System.out.print(t.data+ " -> ");
//                t = t.next;
//            }
//            System.out.println(" null");
//        }
//    }
//    
//    public boolean search(int key)
//    {
//        if(isEmpty())
//            return false;
//        else
//        {
//            Node t = start;
//            while(t != null)
//            {
//                if(t.data == key)
//                    return true;
//                t = t.next;
//            }
//            return false;
//        }
//    }
//    
//    private Node searchNode(int key)
//    {
//        if(isEmpty())
//            return null;
//        else
//        {
//            Node t = start;
//            while(t != null)
//            {
//                if(t.data == key)
//                    return t;
//                t = t.next;
//            }
//            return null;
//        }
//    }
//    
//public boolean delete() {
//    if (isEmpty()) {
//        System.out.println("The list is already empty.");
//        return true; 
//    } else {
//        start = null;
//        System.out.println("The list is deleted."); 
//        return true;
//    }
//}
//
//
//    public static void main(String[] args) {
//        SinglyLinkedList s = new SinglyLinkedList();
//        s.insertAtEnd(2);
////        s.insertAtStart(1);
////        s.insertAtEnd(3);
////        s.traverse();
////         s.search(2); 
//        System.out.println("Is 4 in the list? " + s.search(4)); 
//////        s.delete(); 
//        s.traverse(); 
//    }
//}
//
 
 

public class SinglyLinkedList
{
    Node start = null;

    class Node
    {
        int data;
        Node next;
    }

    public boolean isEmpty()
    {
        if (start == null)
        
            return true;
        
        return false;
    }

    public void insertAtEnd(int value)
    {
        Node n = new Node();
        n.data = value;
        n.next = null;

        if (isEmpty())
        {
            start = n;
        } else
        {
            Node t = start;
            while (t.next != null)
            {
                t = t.next;
            }
            t.next = n;
        }
    }

    public void insertAtStart(int value)
    {
        Node n = new Node();
        n.data = value;
        n.next = start;
        start = n;
    }

    public void traverse()
    {
        if (isEmpty())
        {
            System.out.println("the list is Empty");
        } else
        {
            Node t = start;
            while (t != null)
            {
                System.out.print(t.data + " --> ");
                t = t.next;
            }
            System.out.println("Null");
        }
    }

    public boolean search(int key)
    {
        if (isEmpty())
        {
            return true;
        } else
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
    }

    public Node searchNode(int key)
    {
        if (isEmpty())
        {
            return null;
        } else
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

    public boolean delete()
    {
        if (isEmpty())
        {
            System.out.println("the list is Empty");
            return true;
        } else
        {
            start = null;
            System.out.println("the list is deleted");
            return true;
        }
    }

    public int deleteAtStart()
    {
        if (isEmpty())
        {
            return -9999;
        } else
        {
            int val = start.data;
            start = start.next;
            return val;
        }
    }

    public int deleteAtEnd()
    {
        if (isEmpty())
        {
            return -999;
        } else if (start.next == null)   // if there is one Node
        { 
            int val = start.data;
            start = null;
            return val;
        } else
        {

            Node t1 = start;
            Node t2 = null;

            while (t1.next != null)
            {
                t2 = t1;
                t1 = t1.next;
            }

            t2.next = null;
            return t1.data;
        }
    }

}
