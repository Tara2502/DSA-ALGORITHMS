package Arrays;

public class LargestElement {
public static int findLargestElement(int[] arr){
    int largestElement=0;
    //if we take linear approach then we'll compare it with each element in an arr
    for(int i=0;i<arr.length;i++){
      if(arr[i]>largestElement)  {
          largestElement=arr[i];
      }
    }
    return largestElement;
}
    public static void main(String[] args) {
    int[] arr={2,3,4,5,6,8,78,98,56,9};
        System.out.println(findLargestElement(arr));
    }
}

//worst case scenario- O(n)
