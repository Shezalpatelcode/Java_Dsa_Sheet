//Reverse an array in place 
import java.util.*;
public class code2 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array:");  
        int size= sc.nextInt();
        int arr[]=new int[size];
         System.out.println("Enter the elements: ");
        for(int i=0;i<size;i++)
        { 
             arr[i]=sc.nextInt();
            System.out.println();
        }
         //---------------------------------
        int left=0;
        int right=arr.length -1;
        while(left<right) {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
        System.out.println("Array after reversing an array in place --> ");
        for(int i=0;i<size;i++) {
            //arr[i]=sc.nextInt();
            System.out.print(arr[i]+" ");
        }
       sc.close();
    }
 }
//-------------------------------------

