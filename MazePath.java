import java.util.*;
public class MazePath {
    public static void main(String[] args) {
        System.out.print(getMazePath(1,1,3,3));
    }
    public static ArrayList<String> getMazePath(int sr,int sc,int dr,int dc) {
        if(sr == dr && sc == dc) {
            ArrayList<String> al = new ArrayList<>();
            al.add("");
            return al;
        }
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();
        if(sr<dr) vpaths = getMazePath(sr+1,sc,dr,dc);
        if(sc<dc) hpaths = getMazePath(sr,sc+1,dr,dc);
        ArrayList<String> paths = new ArrayList<>();
        for(String h:hpaths) paths.add("h"+h);
        for(String v:vpaths) paths.add("v"+v);
        return paths;

    }
}