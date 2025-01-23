package Expression_Conversion;
import java.util.Stack;
public class Postfix<T>
{
//    class Node
//    {
//        T data;
//        Node next;
//    }
//
//    Node start = null;
//
//    private boolean isEmpty()
//    {
//        return (start == null);
//    }
//
//    public void push(T value)
//    {
//        Node n = new Node();
//        n.data = value;
//        n.next = null;
//
//        if (isEmpty())
//        {
//            start = n;
//        } else
//        {
//            n.next = start;
//            start = n;
//        }
//    }
//
//    public T pop()
//    {
//        if (isEmpty())
//        {
//            System.out.println("Stack is Empty");
//            return null;
//        } else
//        {
//            T value = start.data;
//            start = start.next;
//            return value;
//        }
//    }
//
//    public void printStack()
//    {
//        if (isEmpty())
//        {
//            System.out.println("Stack is Empty");
//            return;
//        } else
//        {
//            Node t = start;
//            while (t != null)
//            {
//                System.out.print(t.data + "  ");
//                t = t.next;
//            }
//        }
//    }

public static void main(String[] args) {     // post evaluation
    Stack<Double> _postfix = new Stack<>();

    String exp = "231*+9-";

    for (int i = 0; i < exp.length(); i++) {
        char currentChar = exp.charAt(i);
        if (Character.isLetterOrDigit(currentChar)) {
            double num = Double.parseDouble(" " +(currentChar));
            _postfix.push(num);
            
        } else {
            double op2 = _postfix.pop();
            double op1 = _postfix.pop();
            
            switch (currentChar) {
                case '^':
                    _postfix.push(Math.pow(op1 , op2));
                    break;
                case '+':
                    _postfix.push(op1 + op2);
                    break;
                case '-':
                    _postfix.push(op1 - op2);
                    break;
                case '*':
                    _postfix.push(op1 * op2);
                    break;
                default:
                    System.out.println("Other signs");
                    break;
            }
        }
    }

    System.out.println("Result :" + _postfix.pop());
}
}
