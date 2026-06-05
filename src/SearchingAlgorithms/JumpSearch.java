package SearchingAlgorithms;

public class JumpSearch {
    public static int jumpSearch(int[] arr,int target){
     int n=arr.length;
     int step=(int)Math.sqrt(n);
     int prev=0;
     while(arr[Math.min(step,n)-1]<target){
         prev=step;
         step+= (int)Math.sqrt(n);
         if(prev>=n){
             return -1;
         }

            }
        for(int i=prev;i<step;i++){
            if(arr[i]==target){
                return i;
            }
        }
     return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println(jumpSearch(arr,11));
    }
}
