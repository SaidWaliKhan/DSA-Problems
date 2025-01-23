/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package assignment;

import java.util.Random;
import java.util.Scanner;

public class Randomizer
{

   /*
* GROUP MEMBERS
* SAUD
* OMER AYAZ
* SAID WALI
    */
   static Scanner sc = new Scanner(System.in);
   static Random random = new Random();
   static int[] arr = new int[10];
   static int counter = 0;
   static final int emptySpace = -1;

   
   {
       for (int i = 0; i < arr.length; i++)
       {
           arr[i] = emptySpace;
       }
   }

   public static void main(String[] args)
   {
       Randomizer randomizer = new Randomizer();
       System.out.println("Enter the numbers: ");
       for (int i = 0; i < arr.length; i++)
       {
           int num = sc.nextInt();
           randomizer.input(num);
       }

       System.out.println("Random output: " + randomizer.output());
       System.out.println("Arry size :" +counter);
   }

   public void input(int value)
   {
       if (isFull())
       {
           System.out.println("Array is full");
       } else if (value < 0)
       {
           System.out.println("Negative values can't be added");
       } else
       {
           int randomIndex = random.nextInt(arr.length);
           while (arr[randomIndex] >= 0)
           {
               randomIndex = random.nextInt(arr.length);
           }
           arr[randomIndex] = value;
           counter++;
       }
   }

   public int output()
   {
       if (isEmpty())
       {
           System.out.println("Array is Empty");
           return emptySpace;
       } else
       {
           int randomIndex = random.nextInt(arr.length);;
           int value = arr[randomIndex];
           while (value == emptySpace)
           {
               randomIndex = random.nextInt(arr.length);
               value = arr[randomIndex];
           }
           arr[randomIndex] = emptySpace;
           counter--;
           return value;
       }
   }

   private boolean isFull()
   {
       return (counter == arr.length);
   }

   private boolean isEmpty()
   {
       return (counter == 0);
   }
   

}



public class Randomizer{
    public static void main(String[] args)
    {
        print(1);
      
    }
    
    static void print(int n){
        if(n==5){
            System.out.print(5);
            return;
        }
       
        System.out.println(n);
        print(n + 1);
    }
}