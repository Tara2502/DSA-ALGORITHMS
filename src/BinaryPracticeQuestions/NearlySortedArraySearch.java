package BinaryPracticeQuestions;

public class NearlySortedArraySearch {
    public static int searchInNearlySortedArray(int[]arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(mid>low && arr[mid-1]==target){
                return mid-1;
            }
            if(mid<high && arr[mid+1]==target){
                return mid+1;
            }
            if(arr[mid]>target){
                high=mid-2;
            }else{
                low=mid+2;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
int[] arr={10,3,40,20,50,80,70};
        System.out.println(searchInNearlySortedArray(arr,80));
    }
}

/* best case:O(n)
   average case:O(log n)
   worst case:O(log n)
   space complexity:O(1)
    */
