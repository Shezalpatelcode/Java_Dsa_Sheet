import java .util.*;
public class code1 {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size= sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            System.out.println();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
            {
                max=arr[i];
            }
            else if(arr[i]<min){
                min= arr[i];

            }
        }
        System.out.println("Maximmum array elemnt is:" + max);
        System.out.println("Mininum array elemnt is :" + min);
        sc.close();
    }

}

