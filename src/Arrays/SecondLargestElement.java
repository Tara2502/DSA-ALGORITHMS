package Arrays;

public class SecondLargestElement {
    public static int findSecondLargestElement(int[] arr){
        int largestElement=Integer.MIN_VALUE;
        int secondLargestElement=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > largestElement) {
                secondLargestElement=largestElement;
                largestElement = arr[i];
            }else if(arr[i] > secondLargestElement && arr[i] !=largestElement) {
                secondLargestElement = arr[i];
            }
        }
return secondLargestElement;
    }

    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,8,78,98,56,9};
        System.out.println(findSecondLargestElement(arr));
    }
    }
//TC WORST CASE- O(n)
