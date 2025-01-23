/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack_demo;

/**
 *
 * @author Dell
 */
public class STACK_Demo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
Stack_LinkedList s = new Stack_LinkedList();
s.push(4);
s.push(5);
s.push(6);
s.push(7);
s.pop();
s.display();
        System.out.println("the peek value is  =" +s.peek());
s.display();


    }
    
}
