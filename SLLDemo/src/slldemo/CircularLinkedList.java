 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slldemo;

public class CircularLinkedList<T>
{

    class Node
    {

        T data;
        Node pre;
        Node next;

    }
    Node start = null;

    public boolean isEmpty()
    {
        return (start == null);

    }
    public void insertAtStart(T value)
    {
        Node n = new Node();
        n.data = value;

        if (isEmpty())
        {
            n.next = n;
            n.pre = n;
            start = n;   
        } else
        {
            n.next = start;
            n.pre = start.pre;
            n.pre.next = n;
            start.pre = n;
            start = n;
        }
    }

    public void insertAtEnd(T value)
    {
        Node n = new Node();
        n.data = value;

        if (isEmpty())
        {
            n.next = n;
            n.pre = n;
            start = n;

        } else
        {
            n.next = start;
            n.pre = start.pre;
            n.pre.next = n;
            start.pre = n;
        }
    }

    public T deleteAtStart()
    {
        if (isEmpty())
        {
            System.out.println("List is Empty");
            return null;
        } else if (start.next == start)
        {
            T value = start.data;
            start = null;
            return value;
        } else
        {
            T value = start.data;
            start.next.pre = start.pre;
            start.pre.next = start.next;
            start = start.next;
            return value;

        }
    }

    public T deleteAtEnd()
    {
        if (isEmpty())
        {
            System.out.println("list is empty");
            return null;
        } else if (start.next == start)
        {
            T value = start.data;
            start = null;
            return value;
        } else
        {
            Node t = start.pre;
            T value = t.data;
            t.next.pre = t.pre;
            t.pre.next = t.next;
            return value;
        }
    }

    public void traverse()
    {
          if (isEmpty())
        {
            return;
        }
        Node t = start;
        do
        {
            System.out.print(t.data + " <-> ");
            t=t.next;
        } while (t != start);
    }

    public boolean search(T key)
    {
        Node t = start;
        if (isEmpty())
        {
            return false;
        }
        do
        {
            if (t.data.equals(key))
            {
                return true;
            }
            t = t.next;
        } while (t != start);
        return false;
    }

    public Node searchNode(T key)
    {
        Node t = start;
        do
        {
            if (isEmpty())
            {
                return null;
            }
            if (t.data == key)
            {
                return t;
            }
            t = t.next;
        } while (t != start);
        return null;
    }
}
