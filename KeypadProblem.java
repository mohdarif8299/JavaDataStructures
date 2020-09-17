import java.util.*;
public class KeypadProblem {
    
    public static String codes [] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0) {
            ArrayList<String> al = new ArrayList<>();
            al.add("");
            return al;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> mres = new ArrayList<String>();
        String codeofch = codes[ch-'0'];
        for(int i=0;i<codeofch.length();i++) {
            char code = codeofch.charAt(i);
            for(String s:rres) {
                mres.add(code+s);
            }
        }
        return mres;
    }

    public static void main(String[] args) {
        System.out.println(getKPC("78"));       
    }
}