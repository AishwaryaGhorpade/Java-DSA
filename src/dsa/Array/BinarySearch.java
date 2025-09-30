public class BinarySearch {
    static boolean isAsc(int[] arr)
    {
        return arr[0]<arr[arr.length-1];
    }
    static int search(int[] arr,int key)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            if (isAsc(arr)) {
                if(arr[mid]<key)
                {
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(arr[mid]>key)
                {
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={-18,-16,-9,-4,0,3,9,14,60,76,79,80,99};
        System.out.println(search(arr,60));
        System.out.println(search(arr,100));

    }
}