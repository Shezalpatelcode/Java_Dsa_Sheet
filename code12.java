 /*Java Program to find the occurence of each element in an array*/
    import java.util.*;  
    //import java.util.Arrays; 
    
    //Driver Code
    public class code12 
    {  
       public static void main(String args[])   
       {  
           Scanner sc=new Scanner(System.in);
    
          int n;    //Declare array size
          System.out.println("Enter the total number of elements ");
          n=sc.nextInt();     //Initialize array size
    
          int arr[]=new int[n];   //Declare array
          System.out.println("Enter the elements of the array ");
          for(int i=0; i<n ;i++)     //Initialize array
          {
              arr[i]=sc.nextInt();
          }
          
            //Enter the element whose frequency you want to know
            System.out.println("Enter the element whose frequency you want to know");
            int ele=sc.nextInt();
            int occ=0;
            
            // Traverse through map and check frequencies 
            for(int i=0;i<n;i++)
            {
                if(ele==arr[i])
                {
                    occ++; //Increment the occurrence once the element is found
                }
            }
            //Print the element and its frequency
            System.out.println(ele+" occurred "+occ+" times ");
            sc.close();
           
       }
    }
    