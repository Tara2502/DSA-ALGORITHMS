package SearchingAlgorithms;

public class BinarySearch {
    //check if target==middle ele
    //if target < middle ele ,check the left half
    //if target > middle ele ,check right half
    //can only be performed on the sorted arrays

    public static int binarySearch(int[] arr, int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]>target) {
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return -1;// target not found
    }

    public static void main(String[] args) {
        int [] arr={3,44,56,78,90,100};
        System.out.println(binarySearch(arr,78));

    }
}
