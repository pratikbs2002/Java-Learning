
/*
 * Methods:
 * returnType methodName (parameter List) // signature or header of method
 * { }
 */

public class Methods {

    static int maxNumber(int a, int b) { // with formal parameter
        return a < b ? a : b;
    }

    public static void main(String[] args) {
        /*
         * Here we are calling the method in the main method, which is already a static
         * method. Since we can call only static methods from a static context, we need
         * to make
         * our called method (maxNumber) a static method as well.
         */

        // System.out.println(maxNumber(2, 3)); // with actual parameters
        String s = "Hello";
        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s1 = "Hello";
        System.out.println(s2 == s1);
        System.out.println(s);
        System.out.println(s2);

        char[] c = { 'a', 'b', 'c', 'd', 'e' };
        String resuString = new String(c);
        System.out.println(resuString);

    }
}