package HundredCodingChallenge.Recursion.Patterns;

public class PhonePattern {
    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit =up.charAt(0) -'0'; // this will convert '2' into 2
        for(int i=(digit-1)*3;i<digit*3;i++)
        {
            char ch = (char)('a'+i);
            pad(p+ch,up.substring(1));
        }

    }

    static int padCount(String p,String up){
        if(up.isEmpty()){
            //System.out.println(p);
            return 1;
        }
        int digit =up.charAt(0) -'0'; // this will convert '2' into 2
        int count=0;
        for(int i=(digit-1)*3;i<digit*3;i++)
        {
            char ch = (char)('a'+i);
           count=count+ padCount(p+ch,up.substring(1));
        }
        return count;

    }
    public static void main(String[] args) {
        pad("","12");
        System.out.println(padCount("","12"));
    }
}
