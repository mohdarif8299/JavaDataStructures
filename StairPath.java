import java.util.*;
public class StairPath {
    public static void main(String[] args) {
      System.out.print(getStairPath(3));      
    }
    public static ArrayList<String> getStairPath(int n) {
        if(n==0) {
            ArrayList<String> al = new ArrayList<>();
            al.add("");
            return al;
        }
        else if(n<0) {
            ArrayList<String> al = new ArrayList<>();
            return al;
        }
        ArrayList<String> paths1 = getStairPath(n-1);
         ArrayList<String> paths2 = getStairPath(n-2);
          ArrayList<String> paths3 = getStairPath(n-3);
           ArrayList<String> paths = new ArrayList<>();
           for(String s:paths1) paths.add(1+s);
           for(String s:paths2) paths.add(2+s);
           for(String s:paths3) paths.add(3+s);
           return paths;
    }
}