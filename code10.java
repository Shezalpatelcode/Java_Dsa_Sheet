import java.util.Arrays;

public class code10 {
    public static void main(String args[])
    {
        // Creating the array
        int arr[] = {12, 2, 34, 54, 20, 6};
        boolean flag;
        // Prints the array elements
        System.out.println();
        System.out.println("The array elements are"+Arrays.toString(arr));
          

        System.out.println();
        // Prints the leader elements
        System.out.print("The leaders in the array are: ");
        // Finds out the leader elements
        for(int i = 0; i < arr.length; i++)
        {
            flag = true;
            for(int next = i; next < arr.length; next++)
            {    if(arr[i]<arr[next])
                {   flag = false;
                    break;
                }
            }
            if(flag)
                System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
    
      