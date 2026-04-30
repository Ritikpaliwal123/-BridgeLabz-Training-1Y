package main.java.assingment17;

public class a class Censor {

    public static void main(String[] args) {

        String text = "This is a damn bad example with some stupid words";

        text = text.replaceAll("damn|stupid", "****");

        System.out.println(text);
    }
}{
}
