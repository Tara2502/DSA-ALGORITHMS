package SearchingAlgorithms;

public class LinearSearch {
    //checks each element in an array one by one until the target is found or the list is exhausted

    public int linearSearch(int[] arr, int target){
        int presentAtIndex=-1;
for(int i=0;i<arr.length;i++){
    if(arr[i]==target){
        presentAtIndex=i;
    }
}
return presentAtIndex;// will return i if target is found else returns -1

    }
    public static void main(String[] args){
int[] arr={1,2,3,7,6,8,9,10};
LinearSearch linearSearch=new LinearSearch();//created object because we have created non-static method
        System.out.println(linearSearch.linearSearch(arr,10));

    }
}
