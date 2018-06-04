public class StringManipulatorTesting {
    public static void main(String[] args){
        StringManipulator manipulator = new StringManipulator();
        System.out.println("Test Case 1");
        String str = manipulator.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str);
        System.out.println("Test Case 2");
        char letter = 'o';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        Integer b = manipulator.getIndexOrNull("Hello World", letter);
        Integer c = manipulator.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); //Null
        System.out.println("Test Case 3");
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer x = manipulator.getIndexOrNull(word, subString);
        Integer z = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(x); // 2
        System.out.println(z); // null
        System.out.println("Test case 4");
        String xword = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(xword); // eworld
    }
}