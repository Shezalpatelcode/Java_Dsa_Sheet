import java.util.Arrays;
import java.util.Scanner;
public class code7 {
   public static void main(String args[])
   {
      //user input
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the required size of the array ::");

      //variable for taking the size
      int size = sc.nextInt();
      int [] myArray = new int[size];

      System.out.println("Enter elements of the array");
      for(int i=0; i< size; i++){
         myArray[i] = sc.nextInt();
      }

      //making a temprory variable temp
      System.out.println("Contents of the array: "+ Arrays.toString(myArray));
      int temp = myArray[size-1];
      //Loop to cyclically rotate the array by starting from size-1 of the array
      for(int i = size-1; i>0; i--){
         myArray[i] = myArray[i-1];
      }
      // initalizing the  value at index 0 to temp and printing it...
      myArray[0] = temp;
      System.out.println("Contents of the cycled array: "+Arrays.toString(myArray));
      sc.close();
    }
}

