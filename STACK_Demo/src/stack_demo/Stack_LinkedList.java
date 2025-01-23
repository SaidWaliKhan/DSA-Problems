/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack_demo;

public class Stack_LinkedList
{

    class Node
    {
        int data;
        Node next;
    }
    Node start = null;

    public boolean isEmpty()
    {
        if (start == null)
        {
            return true;
        }
        return false;
    }

    public void push(int value)
    {
        Node n = new Node();
        n.data = value;
        n.next = start;
        start = n;
    }

    public int pop()
    {
        if (isEmpty())
        {
            System.out.println("the stack is empty!");
            return -1;
        } else
        {
            int poppedData = start.data;
            start = start.next;
            return poppedData;
        }
    }

    public int peek()
    {
        if (isEmpty())
        {
            System.out.println("the list is empty");
            return -1;
        } else
        { 
            return start.data;
        }
    }

    public void display()
    {
        if (isEmpty())
        {
            System.out.println("the list is empty!");
        } else
        {
            Node newnode = start;
            while (newnode != null)
            {
                System.out.println("|__" + newnode.data + "__|");
                newnode = newnode.next;
            }
        }
    }

}

