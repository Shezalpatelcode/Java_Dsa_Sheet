//Kadane Algorithm
//Algorithim to take out the Maximum Positive Subarray

public class code8 {
    public static void main(String[] args)throws java.lang.Exception {
        
        int a[]={2,-4,3,-1,2};
        int max_local=0;  // the value of at intial is zero
        int max_global=Integer.MIN_VALUE;//the assumed maximum value stored in max_gobal 
        //this will change with every iteration when it find the positive subarray

        int n=a.length;  // length of the given array

        //Loop
        for(int i=0;i<n;i++){

    //Use of Math.max library to simply compare out the maximum value 
             max_local=Math.max(a[i], a[i]+ max_local);

             if(max_local > max_global)
             {
                //Assigning the maximum value as the new value of the max_global
                 max_global =max_local;
             }
        }
        System.out.println();
        System.out.println("Maximum Positive Array sum of the gievn array is : " + max_global);
        }
}
