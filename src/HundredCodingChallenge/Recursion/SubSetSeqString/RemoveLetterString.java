package HundredCodingChallenge.Recursion.SubSetSeqString;

public class RemoveLetterString {
    //1. without return
    static void skip(String p,String up){
        // p : processed
        //up: unprocessed

        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch=='a')
        {
            skip(p,up.substring(1));
        }else{
            skip(p+ch,up.substring(1));
        }
    }

//2. with return
    static String skip(String up){
        // p : processed
        //up: unprocessed

        if(up.isEmpty())
        {
            return "";
        }
        char ch = up.charAt(0);
        if(ch=='a')
        {
            return skip(up.substring(1));
        }else{
            return ch+skip(up.substring(1));
        }

    }
//3. skip string with return
    static String skipApple(String up){
        // p : processed
        //up: unprocessed

        if(up.isEmpty())
        {
            return "";
        }

        if(up.startsWith("apple"))
        {
            return skipApple(up.substring(5));
        }else{
            return up.charAt(0)+skipApple(up.substring(1));
        }

    }
    public static void main(String[] args) {
            skip("","accdah");
        System.out.println(skip("accdah"));
        System.out.println(skipApple("adhvdapplehjfklhsdjkfh"));
    }
}
