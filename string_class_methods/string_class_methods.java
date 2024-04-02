import java.util.Arrays;

class StringMethodsExample {
    public static void main(String[] args) {
        // charAt(int index)
        String str = "Hello";
        char ch = str.charAt(0);
        System.out.println("charAt(0): " + ch); // Output: H

        // chars()
        str.chars().forEach(System.out::println);

        // codePointAt(int index)
        int codePoint = str.codePointAt(1);
        System.out.println("codePointAt(1): " + codePoint); // Output: 101

        // codePointBefore(int index)
        int beforeCodePoint = str.codePointBefore(2);
        System.out.println("codePointBefore(2): " + beforeCodePoint); // Output: 108

        // codePointCount(int beginIndex, int endIndex)
        int codePointCount = str.codePointCount(0, 3);
        System.out.println("codePointCount(0, 3): " + codePointCount); // Output: 3

        // codePoints()
        str.codePoints().forEach(System.out::println);

        // compareTo(String anotherString)
        int compareResult = str.compareTo("Hello");
        System.out.println("compareTo(\"Hello\"): " + compareResult); // Output: 0

        // compareToIgnoreCase(String str)
        int ignoreCaseResult = str.compareToIgnoreCase("HELLO");
        System.out.println("compareToIgnoreCase(\"HELLO\"): " + ignoreCaseResult); // Output: 0

        // concat(String str)
        String concatStr = str.concat(" World!");
        System.out.println("concat(\" World!\"): " + concatStr); // Output: Hello World!

        // contains(CharSequence s)
        boolean contains = str.contains("ell");
        System.out.println("contains(\"ell\"): " + contains); // Output: true

        // contentEquals(CharSequence cs)
        boolean contentEquals = str.contentEquals(new StringBuilder("Hello"));
        System.out.println("contentEquals(new StringBuilder(\"Hello\")): " + contentEquals); // Output: true

        // describeConstable()
        System.out.println("describeConstable(): " + str.describeConstable()); // Output: Optional[Hello]

        // endsWith(String suffix)
        boolean endsWith = str.endsWith("lo");
        System.out.println("endsWith(\"lo\"): " + endsWith); // Output: true

        // equals(Object anObject)
        boolean equals = str.equals("Hello");
        System.out.println("equals(\"Hello\"): " + equals); // Output: true

        // equalsIgnoreCase(String anotherString)
        boolean equalsIgnoreCase = str.equalsIgnoreCase("HELLO");
        System.out.println("equalsIgnoreCase(\"HELLO\"): " + equalsIgnoreCase); // Output: true

        // formatted(Object... args)
        String formattedStr = String.format("Value of pi: %.2f", Math.PI);
        System.out.println("formatted(\"Value of pi: %.2f\", Math.PI): " + formattedStr); // Output: Value of pi: 3.14

        // getBytes()
        byte[] bytes = str.getBytes();
        System.out.println("getBytes(): " + Arrays.toString(bytes)); // Output: [72, 101, 108, 108, 111]

        // getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        char[] charArray = new char[5];
        str.getChars(0, 5, charArray, 0);
        System.out.println("getChars(0, 5, charArray, 0): " + Arrays.toString(charArray)); // Output: [H, e, l, l, o]

        // getClass()
        Class cls = str.getClass();
        System.out.println("getClass(): " + cls); // Output: class java.lang.String

        // hashCode()
        int hashCode = str.hashCode();
        System.out.println("hashCode(): " + hashCode); // Output: 69609650

        // indent(int n)
        String indentedStr = str.indent(2);
        System.out.println("indent(2): \n" + indentedStr); // Output:   Hello

        // indexOf(int ch)
        int indexOfCh = str.indexOf('e');
        System.out.println("indexOf('e'): " + indexOfCh); // Output: 1

        // indexOf(String str)
        int indexOfStr = str.indexOf("llo");
        System.out.println("indexOf(\"llo\"): " + indexOfStr); // Output: 2

        // indexOf(int ch, int fromIndex)
        int indexOfChFromIndex = str.indexOf('l', 3);
        System.out.println("indexOf('l', 3): " + indexOfChFromIndex); // Output: 3

        // indexOf(String str, int fromIndex)
        int indexOfStrFromIndex = str.indexOf("lo", 3);
        System.out.println("indexOf(\"lo\", 3): " + indexOfStrFromIndex); // Output: 3

        // intern()
        String internedStr = str.intern();
        System.out.println("intern(): " + internedStr); // Output: Hello

        // isBlank()
        boolean isBlank = str.isBlank();
        System.out.println("isBlank(): " + isBlank); // Output: false

        // isEmpty()
        boolean isEmpty = str.isEmpty();
        System.out.println("isEmpty(): " + isEmpty); // Output: false

        // lastIndexOf(int ch)
        int lastIndexOfCh = str.lastIndexOf('l');
        System.out.println("lastIndexOf('l'): " + lastIndexOfCh); // Output: 3

        // lastIndexOf(String str)
        int lastIndexOfStr = str.lastIndexOf("lo");
        System.out.println("lastIndexOf(\"lo\"): " + lastIndexOfStr); // Output: 3

        // lastIndexOf(int ch, int fromIndex)
        int lastIndexOfChFromIndex = str.lastIndexOf('l', 2);
        System.out.println("lastIndexOf('l', 2): " + lastIndexOfChFromIndex); // Output: 2

        // lastIndexOf(String str, int fromIndex)
        int lastIndexOfStrFromIndex = str.lastIndexOf("lo", 2);
        System.out.println("lastIndexOf(\"lo\", 2): " + lastIndexOfStrFromIndex); // Output: 2

        // length()
        int length = str.length();
        System.out.println("length(): " + length); // Output: 5

        // lines()
        str.lines().forEach(System.out::println);

        // matches(String regex)
        boolean matches = str.matches("Hel*o");
        System.out.println("matches(\"Hel*o\"): " + matches); // Output: true

        // notify() and notifyAll() are methods of Object class and not directly applicable to strings.

        // offsetByCodePoints(int index, int codePointOffset)
        int offsetByCodePoints = str.offsetByCodePoints(0, 3);
        System.out.println("offsetByCodePoints(0, 3): " + offsetByCodePoints); // Output: 3

        // regionMatches(int toffset, String other, int ooffset, int len)
        boolean regionMatches = str.regionMatches(0, "Hello", 0, 5);
        System.out.println("regionMatches?: " + regionMatches);
}}
