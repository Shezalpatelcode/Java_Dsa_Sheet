public class code9 {
    //check if the array is sorted and roatated
    public static boolean check_sortandrotate(int numbers[]){
       int n= numbers.length;
       int count=0;

       for(int i=0;i<n;i++){
        if(numbers[i]>numbers[(i+1)%n]){
             count++;

        }
    }
        if(count<=1){
            System.out.println("Yes !!");
           return true;
        }
        else{
            System.out.println("No !!");
            return false;
        }
       
    }
    public static void main(String[] args) {
        int numbers[]={3,4,5,1,2};
        System.out.println("Array is rotated and Sorted : " + check_sortandrotate(numbers));
    }
}
