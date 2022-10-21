package DataStructures;

public class String_practice {
    public static void main(String[] args) {
        String s1 ="A string is generally understood as " +
                "a data type and is often implemented as an array " +
                "of bytes (or words) that stores a sequence of elements, typically";
        System.out.println(s1.charAt(2));
        System.out.println(s1.codePointAt(2));
        System.out.println(s1.codePointBefore(4));
        System.out.println(s1.codePointCount(0,s1.length()));
        System.out.println(s1.length());

    }
}
