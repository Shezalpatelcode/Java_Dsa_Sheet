
//17. Find intersection of two sorted arrays

import java.util.Scanner;
public class code17 {
    public static void Intersection(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       
        int n1 = 6;
         System.out.println("The size of the array 1:- "+n1);
         int[] arr1 = new int[]{ 1,2,3,4,5,6}; 
        System.out.println("The Elements of array 1");
        for (int i = 0; i < n1; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

       
        int n2 = 4;
         System.out.println("The size of the array 2:- "+n2);

         int[] arr2 = new int[]{4,5,6,7}; 
        System.out.println("The Elements of array 2");
        

        for (int i = 0; i < n2; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.println("Intersection of two sorted arrays: ");
        Intersection(arr1, arr2);
        sc.close();
    }
}

