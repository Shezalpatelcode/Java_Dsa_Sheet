 public class code4{
 public void sortArray(int a[]){
     int low,mid,high;
     low=mid=0;
     high=a.length-1;

     while(mid<=high){
         switch(a[mid]){
            //Case when you encounter 0;
            case 0:
              if(a[low]!=a[mid]){
                 int t=a[low];
                 a[low]=a[mid];
                 a[mid]= t;

              }
              low++;
              mid++;
              break;
              //Case when you encounter 1;
              case 1:
                 mid++;
                 break;
                 //Case when you encounter 2;
              case 2:
                 if(a[mid]!=a[high]){
                 int t=a[mid];
                 a[mid]=a[high];
                 a[high]=t;
              }
              high--;
         }
     }
     System.out.println("----Dutch National Flag Printing--->");
     for(int i=0;i<a.length-1;i++){
        System.out.print(a[i]+ " ");
     }
     System.out.println();
     System.out.println("-------------------------------");
 }
 
    public static void main(String[] args)
    {
       code4 obj= new code4();
       int a[]={0,1,1,0,2,2,1,0,2};
       obj.sortArray(a);

    }
 }
