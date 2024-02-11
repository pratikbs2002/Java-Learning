// package strings;

import java.util.Scanner;

/*
 * Owner: Pratik Suthar
 */
public class StringLearning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // There are two ways to implement strings:
        // 1. Using string literals

        String s = "Pratik Suthar";
        System.out.println("s : " + s);

        // 2. Using constructors
        String s1 = new String("Pratik Suthar");
        System.out.println("s1: " + s1);

        char[] c2 = { 'I', 'N', 'D', 'I', 'A' };
        String s2 = new String(c2);
        System.out.println("s2: " + s2);

        byte[] b3 = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75 };
        String s3 = new String(b3);
        System.out.println("s3: " + s3);

        System.out.println(s == s1);

        // 📌 String Pool:

        /*
         * -> The string pool is a special area in memory where immutable string objects
         * are stored.
         * 
         * -> When you create a string literal like "Hello", the compiler checks if an
         * identical string already exists in the pool.
         * 
         * -> If it does, it reuses that instance instead of creating a new one,
         * optimizing
         * memory usage.
         * 
         * -> String pool helps in saving memory and improving performance by reducing
         * the number of duplicate string objects.
         */

        // 📌 Heap Memory:

        /*
         * -> The heap is a region of memory where dynamically allocated memory is
         * managed.
         * 
         * -> Objects created using the 'new' keyword or dynamic memory allocation
         * functions are stored in the heap.
         * 
         * -> Unlike the string pool, objects stored in the heap are mutable, allowing
         * their contents to be modified.
         * 
         * -> Memory in the heap is managed either by the programmer (in languages like
         * C/C++) or by a garbage collector (in managed languages like Java and C#).
         * 
         * -> Garbage collectors reclaim memory occupied by objects that are no longer
         * referenced, preventing memory leaks.
         */

        // String Methods.................
        String str = "Pratik Suthar";

        // length()
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // toUpperCase()
        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase: " + upperCaseStr);

        // toLowerCase()
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase: " + lowerCaseStr);

        str = "         Pratik Suthar          ";

        // trim()
        str = str.trim();
        System.out.println("Trimmed string: " + str);

        // substring(int beginIndex)
        String subStr1 = str.substring(6);
        System.out.println("Substring from index 6: " + subStr1);

        // substring(int beginIndex, int endIndex)
        String subStr2 = str.substring(6, 11);
        System.out.println("Substring from index 6 to 11: " + subStr2);

        // replace(char oldChar, char newChar)
        String replacedStr = str.replace('P', 'p');
        System.out.println("Replaced string: " + replacedStr);

        // startsWith(String prefix)
        boolean startsWithHello = str.startsWith("Pratik");
        System.out.println("Starts with 'Pratik': " + startsWithHello);

        // endsWith(String suffix)
        boolean endsWithWorld = str.endsWith("Suthar");
        System.out.println("Ends with 'Suthar': " + endsWithWorld);

        // charAt(int index)
        char charAtIndex5 = str.charAt(5);
        System.out.println("Character at index 5: " + charAtIndex5);

        // indexOf(String str)
        int indexOfHello = str.indexOf("r");
        System.out.println("Index of 'r': " + indexOfHello);

        // lastIndexOf(String str)
        int lastIndexOfSpace = str.lastIndexOf("r");
        System.out.println("Last index of 'r': " + lastIndexOfSpace);

        String str1 = "Pratik";
        String str2 = "pratik";
        String str3 = "Suthar";
        String str4 = "pratik";

        // equals(Object obj)
        boolean isEqual = str1.equals(str2);
        System.out.println("str1 equals str2: " + isEqual);

        // equalsIgnoreCase(String anotherString)
        boolean isEqualIgnoreCase = str2.equalsIgnoreCase(str4);
        System.out.println("str2 equals ignore case str4: " + isEqualIgnoreCase);

        // compareTo(String anotherString)
        int compareToResult = str2.compareTo(str4);
        System.out.println("str1 compared to str3: " + compareToResult);

        // valueOf(int i)
        String valueOfString = String.valueOf(10);
        System.out.println("Value of integer 10: " + valueOfString);
        System.out.println("\n");

        // Regular expression
        String sports = "cricket";
        // boolean isRegularExpression = sports.matches(".");
        // boolean isRegularExpression = sports.matches("[abc]");
        // boolean isRegularExpression = sports.matches("[^abc]");
        // boolean isRegularExpression = sports.matches("[a-z0-9]");
        // boolean isRegularExpression = sports.matches("[a-z0-9]");
        // for two symbols
        // boolean isRegularExpression = sports.matches("[a-z][0-9]");
        // boolean isRegularExpression = sports.matches("a|b");

        // exact string
        // boolean isRegularExpression = sports.matches("cricket");

        System.out.print("Please enter input for the regular Expression: ");
        String input_re = scanner.nextLine();

        /*
         * 📌 Meta Character
         * \d - digits
         * \D - no digits
         * \s - space
         * \S - no space
         * \w - Alphabets or digits
         * \W - Neither alphabet or digits
         */

        boolean isRegularExpression = input_re.matches("\\d");
        // boolean isRegularExpression = input_re.matches("\\D");
        // boolean isRegularExpression = input_re.matches("\\s");
        // boolean isRegularExpression = input_re.matches("\\S");
        // boolean isRegularExpression = input_re.matches("\\w");
        // boolean isRegularExpression = input_re.matches("\\W");

        /*
         * 📌 Quantifiers:
         * '*' - 0 or more time
         * '+' - 1 or more time
         * '?' - o or 1 time
         * {X} - X times
         * {X, Y} - Between X and Y time
         * 
         */

        // boolean isRegularExpression = input_re.matches("[a]*");
        // boolean isRegularExpression = input_re.matches("[a]+");
        // boolean isRegularExpression = input_re.matches("[a]?");
        // boolean isRegularExpression = input_re.matches("[a]{2}");
        // boolean isRegularExpression = input_re.matches("[a]{4,6}");

        System.out.println("Regular Expression : " + isRegularExpression);
    }
}
