/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_qualimétrie;

import java.util.Arrays;

/**
 *
 * @author Inclusive-PC
 */
public class Nombreentier {
    
   
      public static void selectionSort(int[] myArray) {
       int n = myArray.length;

       for (int i = 0; i < n - 1; i++) {
           int minIndex = i;

           
           for (int j = i + 1; j < n; j++) {
               if (myArray[j] < myArray[minIndex]) {
                   minIndex = j;
               }
           }

           
           int temp = myArray[minIndex];
           myArray[minIndex] = myArray[i];
           myArray[i] = temp;
       }
   }

   public static void main(String[] args) {
       int[] arr = {16, 26, 43, 2, 80, 9};

       System.out.println("Array avant tri:");
       for (int num : arr) {
           System.out.print(num + " ");
       }

       selectionSort(arr);

       System.out.println("\nArray après tri:");
       for (int num : arr) {
           System.out.print(num + " ");
       }
   }
}

