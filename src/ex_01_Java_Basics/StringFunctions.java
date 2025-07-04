package ex_01_Java_Basics;

public class StringFunctions {
    public static void main(String[] args) {
        CharSequence s = "java".subSequence(1, 3);
        System.out.println(s);//it will print char from 1 to 2 .ie i less than the limit

        String a="sneha".substring(3);
        System.out.println(a);//will print from 3

        String b="sneha".substring(1,3);
        System.out.println(b);//will print from 1 to 2 only

        char[] arr="sneha".toCharArray();
        System.out.println(arr);//['s','n','e','h','a'] it will breakdown like this

        String c="  boolean  ".trim();
        System.out.println(c);// it will remove the white space from front and back side

        boolean d="  ".isBlank();
        System.out.println(d);//print true if there is any blank

        String e="o".repeat(3);
        System.out.println(e);// repeat

        boolean f="sneha".equalsIgnoreCase("SNEHA");
        System.out.println(f);//In Java, equalsIgnoreCase() is a method used to compare two strings, ignoring case differences (uppercase/lowercase).

        String g=String.format("%s=%d","age",25);
        System.out.println(g);//%s is string ,%d is integer

        long count="a\nb\nc".lines().count();
        System.out.println(count);// \n divides the lines into 3 here.

        int h="java".compareTo("Java");
        System.out.println(h);// compareTo() compares two strings lexicographically (dictionary order).

        int result = "David".compareToIgnoreCase("DAVID");
        System.out.println(result);//The method compareToIgnoreCase() compares strings without considering uppercase or lowercase.

        int i = "Hello world".indexOf('o');
        System.out.println(i);//The indexOf() method is used to find the position (index) of a character or substring in a string.

        boolean j = "".isEmpty();
        System.out.println(j);

        String joined = String.join(" ", "I", "love", "Java");
        System.out.println(joined);//String.join() is used to join multiple strings using a delimiter (like space, comma, dash, etc.).

        int index = "snehas".lastIndexOf("s");
        System.out.println(index);//it will take last index of s

        String replaced = "sneho".replace('o','a');
        System.out.println(replaced); //The .replace() method in Java is used to replace characters or substrings in a string with something else.







    }
}
