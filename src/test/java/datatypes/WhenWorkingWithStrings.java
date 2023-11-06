package datatypes;

import org.junit.Test;

public class WhenWorkingWithStrings {
    @Test
    public void convertToLowercase(){
        String text = "  This is my string test   ";
        System.out.println("Text in Lowercase-" + text.toLowerCase());
        System.out.println("Text in Uppercase-" + text.toUpperCase());
        System.out.println("Text Trimmed-" + text.trim());
        System.out.println("Length of the Text-" + text.length());
        System.out.println("Replaced Text-" + text.replace("my","your"));
    }
}
