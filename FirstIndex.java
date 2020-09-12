public class FirstIndex {
   
    public static int firstIndex(int[] arr, int idx, int x){
       if(arr.length==idx && arr[arr.length-1]!=x) return -1;
       if(arr[idx]==x) return idx;
       else return firstIndex(arr,idx+1,x);
    }
    public static void main(String[] args) {
       int arr[] = {1,2,4,5,6,8};
       System.out.println(firstIndex(arr,0,6));
   } 
}