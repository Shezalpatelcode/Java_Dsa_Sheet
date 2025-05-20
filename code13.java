//Find all  pairs with given sum 
import java.util.Scanner;
public class code13 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n= sc.nextInt();//size of an array
        int [] arr= new int[n];
        System.out.println("Enter the elemnts of an array:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the sum of whose pair is to be find :");
        int num=sc.nextInt();
        for(int i=0;i<n;i++)
        {
              for(int j=i+1;j<n;j++){
                if((arr[i]+ arr[j])==num){
                    System.out.println("Indices of the sum forming values:");
                    System.out.println(i + ", "+ j);
                }
              }
        }
        sc.close();
    }
    
}
