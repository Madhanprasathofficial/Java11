package org.example;

public class StringMethods {
    public static void main(String[] args) {
        String str = "  Hello World!  ";

        // isBlank() method
        System.out.println("Is blank: " + str.isBlank());

        // lines() method
        String multilineStr = "Hello\nWorld\nJava 11";
        multilineStr.lines().forEach(System.out::println);

        // strip(), stripLeading(), and stripTrailing()
        System.out.println("Stripped: '" + str.strip() + "'");
        System.out.println("Leading Stripped: '" + str.stripLeading() + "'");
        System.out.println("Trailing Stripped: '" + str.stripTrailing() + "'");

        // repeat() method
        System.out.println("Repeated: " + "Java ".repeat(3));

        // stripIndent()
        String indented = "    Indented text\n    More indented text";
        System.out.println("Without indent: \n" + indented.stripIndent());
    }
}
