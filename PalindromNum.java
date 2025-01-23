// import java.util.Scanner;

// public class PalindromNum {
//     public static void main(String[] args) {
//         int n, r, s = 0;

//         System.out.println("Enter any number: ");

//         Scanner sc = new Scanner(System.in);
//         n = sc.nextInt();

//         int c = n;
//         while (n > 0) {
//             r = n % 10;
//             s = (s * 10) + r;
//             n = n / 10;
//         }

//         if (c == s) {
//             System.out.println("is a Palindrome number");
//         } else {
//             System.out.println("Not a palindrome");
//         }
//     }
// }

// public class Solution {
//     public boolean isPalindrome(int x) {
//         int originalNumber = x;
//         int reversedNumber = 0;
        
//         while (x > 0) {
//             int digit = x % 10;
//             reversedNumber = reversedNumber * 10 + digit;
//             x /= 10;
//         }
        
//         return originalNumber == reversedNumber;
//     }

//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         int number = 121;
//         boolean isPalindrome = solution.isPalindrome(number);
//         System.out.println(number + " is " + (isPalindrome ? "" : "not ") + "a palindrome.");
//     }
// }
