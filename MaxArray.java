public class MaxArray {
    public static int max(int arr[],int idx) {
        if(arr.length==idx) return arr[idx-1];
        int x = max(arr,idx+1);
        if(arr[idx]>x) return arr[idx]; else return x;
    }   
    public static void main(String[] args) {
           int arr[] = {4,3,7,2,5};
           System.out.println(max(arr,0));
       }
}