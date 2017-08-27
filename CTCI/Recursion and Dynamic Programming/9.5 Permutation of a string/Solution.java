import java.util.ArrayList;

public class Solution{

    public static ArrayList<String> permutation(String str){
        ArrayList<String> res = new ArrayList<String>();
        if (str.length() == 1){
            res.add(str);
        }

        else if(str.length() > 1){

            int lastIndex = str.length() - 1;
            String rest = str.substring(0, lastIndex);
            String last = str.substring(lastIndex);

            res = merge(permutation(rest), last);
        }

        return res;
    }

    public static ArrayList<String> merge (ArrayList<String> list, String last){
        ArrayList<String> res = new ArrayList<String>();

        for(String s: list){
            for(int i =0; i <= s.length(); i++){
                String str = new StringBuffer(s).insert(i, last).toString();
                res.add(str);
            }
           
        }
        return res;
    }


    public static void main(String[] args){

        String str = "abc";
        System.out.println(permutation(str).toString());

    }
}