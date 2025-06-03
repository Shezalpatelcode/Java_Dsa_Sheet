import java.util.Arrays;
import java.util.Scanner;
public class code7 {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the required size of the array ::");
      int size = sc.nextInt();
      int [] myArray = new int[size];
      System.out.println("Enter elements of the array");
      for(int i=0; i< size; i++){
         myArray[i] = sc.nextInt();
      }
      System.out.println("Contents of the array: "+Arrays.toString(myArray));
      int temp = myArray[size-1];
      for(int i = size-1; i>0; i--){
         myArray[i] = myArray[i-1];
      }
      myArray[0] = temp;
      System.out.println("Contents of the cycled array: "+Arrays.toString(myArray));
      sc.close();
    }
}
