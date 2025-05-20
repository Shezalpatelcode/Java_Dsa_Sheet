public class code5 {
    void movenum(int a[])
    {
        int j=0;
          for(int i=0;i<a.length-1;i++){
             
                if(a[i]<0)
                {
                   int temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
                   j++;
                }
            }
        
        System.out.println("Array after arrangment--->");
        for(int i=0;i<a.length-1;i++){
            System.out.print(a[i]+ " ");
        }
    }
    
    public static void main(String args[]){
         int a[]={2,3,-4,-78,76,100};
         code5 obj= new code5();
         obj.movenum(a);
    }
}
