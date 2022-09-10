public class InsertionSort 
{
    public static void main(String[] args) 
    {
        int arr[]={2,1,10,5};
        for(int i=0;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>0 && arr[i]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
