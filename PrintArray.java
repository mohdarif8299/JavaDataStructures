public class PrintArray {
public static void print(int arr[],int index){
    if(arr.length==index) return;
    System.out.println(arr[index]);
    print(arr,index+1);
}
    public static void main(String[] args) {
     int arr[]  = new int[]{1,4,3,5};
     print(arr,0);
 }   
}