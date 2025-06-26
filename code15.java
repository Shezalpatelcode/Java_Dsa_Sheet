
//15. Missing number in array [1 to n] : 
//Using the total sum Technique
import java.util.*;
//import java.util.Arrays;
public class code15 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n;
        //Declare the array size 
        System.out.println("Enter Total number of Elemnts");
        n=sc.nextInt();

        //Array DEcalration
        int arr[]= new int[n];

        //inputting the array elements
        System.out.println("Enter the elemnts of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //Calculate the missing number by the sum of total Technique
         int sum=(n+1)*(n+2)/2;
        for(int i=0;i<n;i++){
              sum=sum-arr[i];
        }
        System.out.println("Missing elemnts is-->  " +  sum);
        sc.close();
    }
}
