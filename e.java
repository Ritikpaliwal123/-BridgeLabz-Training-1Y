package main.java.assingment17.assingment.assing.assing.assign;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class e import java.util.regex.*;

class ExtractLinks {

    public static void main(String[] args) {

        String text = "Visit https://www.google.com and http://example.org";

        Pattern p = Pattern.compile("https?://\\S+");

        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}{
}
