package DataStructures;

public class ImmutableString {
    public static void main(String[] args) {
        String s1 = "John, Jennie, Jim, Jack, Joe";
        System.out.println(s1);
        String s2=s1.toUpperCase();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.length());
        char[] charArr = s1.toCharArray();

    }
}
