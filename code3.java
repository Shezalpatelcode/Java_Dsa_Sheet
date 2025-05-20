class code3 {
// Finding the Kth max and min in an array
    public static void main(String[] args) {
        
        int a[]={12,3,5,7,19};
        int k=2;
        int n=2;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                
            }
                 if(i==k-1){
                     System.out.println(a[i] +" is the Kth Largest element");
                     break;
                }
        }
        //------------------------For Smallest Kth Element
            for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }  
                 if(i==n-1)
                 {
                     System.out.println(a[i] +" is the Kth Smallest element");
                     break;
                }
        }
    }
}

