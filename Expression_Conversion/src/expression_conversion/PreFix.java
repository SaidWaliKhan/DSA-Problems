/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expression_conversion;

/**
 *
 * @author Dell
 */

public class PreFix<T>
{
    class Node
    {

        T data;
        Node next;
    }

    Node start = null;

    private boolean isEmpty()
    {
        return (start == null);
    }

    public void push(T value)
    {
        Node n = new Node();
        n.data = value;
        n.next = null;

        if (isEmpty())
        {
            start = n;
        } else
        {
            n.next = start;
            start = n;
        }
    }

    public T pop()
    {
        if (isEmpty())
        {
            System.out.println("Stack is Empty");
            return null;
        } else
        {
            T value = start.data;
            start = start.next;
            return value;
        }
    }

    public void printStack()
    {
        if (isEmpty())
        {
            System.out.println("Stack is Empty");
            return;
        } else
        {
            Node t = start;
            while (t != null)
            {
                System.out.print(t.data + "  ");
                t = t.next;
            }
        }
    }

public static void main(String[] args) {
    PreFix<Double> _pre = new PreFix<>();

    String exp = "-+4*237";

    for (int i = exp.length()-1; i >=0; i--) {
        char currentChar = exp.charAt(i);
        if (Character.isDigit(currentChar)) {
            double num = Double.parseDouble("" +(currentChar));
            _pre.push(num);
        } else {
            double op1 = _pre.pop();
            double op2 = _pre.pop();
            switch (currentChar) {
                case '+':
                    _pre.push(op1 + op2);
                    break;
                case '-':
                    _pre.push(op1 - op2);
                    break;
                case '*':
                    _pre.push(op1 * op2);
                    break;
                default:
                    System.out.println("Other signs");
                    break;
            }
        }
    }

    System.out.println("Result :" + _pre.pop());
}


}
