//19. Merge two sorted arrays without using extra space
public class code19 {
    public static void Union(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } 
           else if (arr2[j] < arr1[i]) {
                System.out.print(arr2[j] + " ");
                j++;
            } else {
                System.out.print(arr1[i] + " ");

                i++;
                j++;
            }

        }
        while (i < arr1.length) {
            System.out.print(arr1[i] + " ");
            i++;
        }
        while (j < arr2.length) {
            System.out.print(arr2[j] + " ");
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{ 1,2,3,9}; 
         int[] arr2 = new int[]{4,5,6,7}; 

         for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

         for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        
        System.out.println("Merge of Two sorted arrays-->");
        Union(arr1, arr2);
    }
}
