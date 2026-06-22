package BinaryPracticeQuestions;

public class SimpleBinary {
    public static int simpleBinary(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==arr[mid]){
                return mid;
            } else if (arr[mid]>target) {
                high=mid-1;
            } else{
                low=mid+1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        System.out.println(simpleBinary(arr,13));
            }
}
