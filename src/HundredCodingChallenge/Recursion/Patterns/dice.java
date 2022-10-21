package HundredCodingChallenge.Recursion.Patterns;

import java.util.ArrayList;
import java.util.Arrays;

public class dice {
    static void dice(String p,int sum)
    {

        if(sum==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<=sum;i++)
        {
            dice(p+i,sum-i);
        }
    }

    static ArrayList<String>diceR (String p,int sum)
    {

        if(sum==0){
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i=1;i<=6 && i<=sum;i++)
        {
            list.addAll( diceR(p+i,sum-i));
        }
        return list;
    }

    static int diceC (String p,int sum,int count)
    {
        if(sum==0){
            return 1;
        }
        for(int i=1;i<=6 && i<=sum;i++)
        {
            count=count+( diceC(p+i,sum-i,count));
        }
        return count;
    }

    public static void main(String[] args) {
       //dice("",4);
        System.out.println(diceC("",4,0));
    }
}
