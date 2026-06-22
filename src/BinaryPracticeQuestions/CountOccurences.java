package BinaryPracticeQuestions;

public class CountOccurences {
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
    public  static int lastOccurence(int[]arr, int target){
        int ans=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
                low=mid+1;

            } else if (arr[mid]<target) {
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return ans;
    }
    public static int countOccurences(int[] arr,int target){
        int first=firstOccurence(arr,target);
        int last=lastOccurence(arr,target);
        if(first==-1){
            return 0;
        }
return last-first+1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,2,2,3,4,5};
//        System.out.println(firstOccurence(arr,2));
//        System.out.println(lastOccurence(arr,2));
        System.out.println(countOccurences(arr,6));
    }

}
