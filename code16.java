
//16. Find duplicate number in array in java
//Using Brute Force
import java.util.Arrays;
public class code16 {
    public static void main(String args[]){
           int[] array = { 5, 3, 5, 4, 3, 1, 3, 5, 1, };
      
      //sorting an array
      Arrays.sort(array);
      
      //declaring the variables
      int i,j,frequency;
      System.out.println("These elements are repeated along with its frequency-");
      
      //loop for logic implementation
      for(i=0; i<array.length; i++){
         frequency = 1;
         for(j=i+1; j<array.length; j++){
            if(array[j] == array[i]){
               frequency++;
            } else {
               break;
            }
         }
         i=j-1;
         if(frequency > 1){
         
            //printing the output
            System.out.println(array[i] + " --> " + frequency);
         }
      }
    }
}
