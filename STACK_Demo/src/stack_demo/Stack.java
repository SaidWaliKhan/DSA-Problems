package stack_demo;

//public class Stack<T> {
//    T[] arr = (T[]) new Object[5];
//    int top = -1;
//
//    private boolean isEmpty() {
//        return top == -1;
//    }
//
//    private boolean isFull() {
//        return top == arr.length - 1;
//    }
//
//    public void push(T value) {
//        if (isFull()) {
//            System.out.println("Stack overflow");
//        } else {
//            arr[++top] = value;
//        }
//    }
//
//    public T pop() {
//        if (isEmpty()) {
//            System.out.println("Stack underflow");
//            return null;
//        } else {
//            return arr[top--];
//        }
//    }
//
//    public T peek() {
//        if (isEmpty()) {
//            return null;
//        } else {
//            return arr[top];
//        }
//    }
//
//    public int size() {
//        return top + 1;
//    }
//
//    public void print() {
//        for (int i = top; i >= 0; i--) {
//            System.out.println("|\t" + arr[i] + "\t|");
//            System.out.println("----------------");
//        }
//    }
//}

public class Stack{
    int [] arr = new int [5];
    int top = -1;
    
    public boolean isEmpty(){
        return (top <= -1);
    }
    
    public boolean isFull(){
        return (top >= arr.length-1);
    }
    
    public void push(int val){
        if (isFull()){
            System.out.println("the over flow");
        }
         arr[++top] = val;
    }
    
    public int pop(){
        if (isEmpty()){
            System.out.println("the stsck is underflow");
        }
        return arr[top--];
    }
    
    public int peek(){
        if(isEmpty()){
            System.out.println("full");
        }
        return arr[top];
    }
    
    public void traverse(){
        for(int i=top; i>=0; i--){
            System.out.println(" " + arr[i]);
        }
    }
}

class StackExample {
    public static void main(String[] args) {
//        Stack<Integer> s = new Stack<>();
 Stack s = new Stack();
        s.push(4);
        s.push(5);
        s.push(7);
        
        s.traverse();
        
        
//        System.out.println("Top element: " + s.peek());
        
        
    }
}
