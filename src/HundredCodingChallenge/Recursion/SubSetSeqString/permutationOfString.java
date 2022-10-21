package HundredCodingChallenge.Recursion.SubSetSeqString;

import java.util.ArrayList;

public class permutationOfString {
    static boolean palindromeString(char[] str,int left, int right)
    {
        if(left>=right)
            return true;
        if(str[left]!=str[right])
            return false;

        return palindromeString(str,left+1,right-1);
    }

    static void printPowerSet(String str,int i,String cur)
    {
        if(i==str.length())
        {
            System.out.print(cur+",");
            return;
        }
        printPowerSet(str,i+1,cur.concat(String.valueOf(str.charAt(i)))); //include
        printPowerSet(str,i+1,cur); //exclude
    }

    //1. Permutations of string
    // Total number of permutation n!
    // what is different in this case? At each step there variable number of recursion calls
    // it is dependent on size of processed string so far. size of processed+1
    static void permutations(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String first =p.substring(0,i);
            String second = p.substring(i,p.length());
            permutations(first+ch+second,up.substring(1));
        }
    }
    //2. permutations
    static ArrayList<String> permutations1(String p, String up)
    {

        if(up.isEmpty())
        {
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for(int i=0;i<=p.length();i++)
        {
            String first =p.substring(0,i);
            String second = p.substring(i,p.length());
           ans.addAll(permutations1(first+ch+second,up.substring(1)));
        }
        return ans;
    }
    //3. count of permutation of string

    static int count(String p,String up)
    {
        if(up.isEmpty())
        {
            return 1;
        }
        int c=0;
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String first =p.substring(0,i);
            String second = p.substring(i,p.length());
            c=c+ count(first+ch+second,up.substring(1));
        }
        return c;
    }
    static void printPermutation(char[] str,int left, int right)
    {
        if(left==right){
            System.out.println(str);
            return;
        }
        for(int i=left;i<=right;i++)
        {
            str = swap(str,left,i);
            printPermutation(str,left+1,right);
            str = swap(str,left,i);

        }
    }
    static char[] swap(char[] chars,int i, int j)
    {
        char temp=chars[i];
        chars[i]=chars[j];
        chars[j]=temp;
        return chars;
    }

    public static void main(String[] args) {
        String srt="abcd";
       /* String str1="";
        System.out.println(palindromeString(srt.toCharArray(),0,srt.length()-1));
        System.out.println(palindromeString(str1.toCharArray(),0,str1.length()-1));
        printPowerSet(srt,0,"");
        printPermutation(srt.toCharArray(),0,srt.length()-1);*/

       // permutations("",srt);
       // System.out.println(permutations1("",srt));
        System.out.println(count("",srt));
    }
}
