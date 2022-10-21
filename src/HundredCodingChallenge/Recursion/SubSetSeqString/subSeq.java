package HundredCodingChallenge.Recursion.SubSetSeqString;

import java.util.ArrayList;

public class subSeq {
    //1.with return
    static void subset(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.print(p+",");
            return;
        }
        char ch=up.charAt(0);
        subset(p+ch,up.substring(1));
        subset(p,up.substring(1));
    }
//3. with ASCII
    static void subsetAscii(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.print(p+",");
            return;
        }
        char ch=up.charAt(0);
        subsetAscii(p+ch,up.substring(1));
        subsetAscii(p,up.substring(1));
        subsetAscii(p+(ch+0),up.substring(1));
    }
//subset with return arraylist
    static ArrayList<String> subset2(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;

        }
        char ch=up.charAt(0);
        ArrayList<String> left=subset2(p+ch,up.substring(1));
        ArrayList<String> right=subset2(p,up.substring(1));
        left.addAll(right);
        return left;
    }
    public static void main(String[] args) {
          //  subset("","abc");
       // System.out.println(subset2("","abc").toString());
        subsetAscii("","abc");
    }
}
