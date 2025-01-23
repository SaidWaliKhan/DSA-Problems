/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circularqueue;
import java.util.LinkedList;
import java.util.Queue;
       
public class Priority_Queue<T>
{
    Queue<T> q1 = new LinkedList<>();
    Queue<T> q2 = new LinkedList<>();
    Queue<T> q3 = new LinkedList<>();

   public void enqueue(T data, int priority) {
    if (priority == 0) {
        q1.add(data);
    } else {
        if (priority == 1) {
            q2.add(data);
        } else {
            if ( priority == 2) {
                q3.add(data);
            }
      }
    }
   } 
   
public T dequeue() {
    if (!q1.isEmpty()) {
        return q1.poll(); 
    } else if (!q2.isEmpty()) {
        return q2.poll(); 
    } else if (!q3.isEmpty()) { 
        return q3.poll(); 
    } else {
        return null; 
    }
}
    public static void main(String[] args) {
        Priority_Queue<Integer> priorityQueue = new Priority_Queue<>();
        
       
        priorityQueue.enqueue(3, 0);
        priorityQueue.enqueue(6, 1);
        priorityQueue.enqueue(5, 0);
        
      
    }
}


