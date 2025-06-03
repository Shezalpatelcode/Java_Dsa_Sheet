// union function
public class code6 {

    static void union(int [] arr1,int []arr2){
    int i=0;
    int j=0;
    System.out.println("---------Array After Union---------");
     while(i<arr1.length && j<arr2.length){
        if(arr1[i]<arr2[j]){
            System.out.print(arr1[i]+ " ");
            i++;
        }
        else if(arr2[j]<arr1[i]){
            System.out.print(arr1[i]+ " ");
            j++;
        }
         else{
            System.out.print(arr1[i]+ " ");
            i++;
            j++;
        }
     }
     while(i<arr1.length){
        System.out.print(arr1[i] + " ");
        i++;
     }
     while(j<arr2.length){
         System.out.print(arr2[j] + " " );
         j++;
     }
 }
//-----------------------------------------------------------

 static void intersection(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        System.out.println();
        System.out.println("-----Array after Intersection-----");
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }
    public static void main(String [] args){
        
        int [] arr1={1,2,3,4,5,6,9};
        int [] arr2={4,9,13,15,16,17};
         
        union(arr1,arr2);
        intersection(arr1, arr2);
    }
}
