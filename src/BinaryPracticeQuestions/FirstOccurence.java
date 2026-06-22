package BinaryPracticeQuestions;

public class FirstOccurence {
    public static int firstOccurence(int[] arr,int target){
        int ans=-1;
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
                high=mid-1;
            } else if (arr[mid]>target) {
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,2,2,3,4,5};
        System.out.println(firstOccurence(arr,2));
    }
}

 /* Time Complexity
Best Case: O(log n)
Average Case: O(log n)
Worst Case: O(log n)
Space Complexity: O(1) */
