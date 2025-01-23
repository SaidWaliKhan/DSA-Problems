/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorialnumber;

//public class Factorial {
//    public static void main(String[] args) {
//        int number = 5; 
//        int result = factorial(number);
//        System.out.println("Factorial of " + number + " is " + result);
//    }
//
//    public static int factorial(int n) {
//        if (n == 0) {
//            return 1; // Base case: 0! is 1
//        } else {
//            return n * factorial(n - 1); 
//        }
//    }
//}




// iterative 
public class Factorial {
    public static void main(String[] args) {
        int number = 5; // Example number
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
