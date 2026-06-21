package SearchingAlgorithms;

public class InterpolationSearch {
    public static int interpolationSearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && target >= arr[low] && target <= arr[high]) {
            if (low == high) {
                if(arr[low]==target){
                    return low;
                }
                return -1;
            }
            int position = low + ((target - arr[low]) * (high - low)) / (arr[high] - arr[low]);
            if(arr[position]==target){
                return position;
            } else if (arr[position]<target) {
                low=position+1;

            } else if (arr[position]>target) {

                high=position-1;
            }


        }
     return -1;
    }

    public static void main(String[] args) {
int[] arr={2,4,6,8,10};
        System.out.println(interpolationSearch(arr,5));

    }
}
