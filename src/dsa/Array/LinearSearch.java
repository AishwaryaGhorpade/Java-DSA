public class LinearSearch {
    static int Search(int[] arr,int key)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Search(arr,4));
        System.out.println(Search(arr,100));
    }
    
}
