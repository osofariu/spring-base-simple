package one;

import ext.MyStringFormatter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringFormatterTest {

    private StringFormatter formatter;

    @Before
    public void setUp() {
        formatter = new MyStringFormatter();
    }

    @Test
    public void whenICapitalizeAWordTheFirstLetterIsUppercase() {
        assertEquals("Hello", formatter.capitalize("hello"));
    }

    @Test
    public void whentCamelCaseingOneWordItLeavesItAlone() {
        assertEquals("hello", formatter.camelCase("hello"));
    }


    @Test
    public void whentCamelCaseingTwoWordsItCaputalizesTheSecond() {
        assertEquals("helloWorld", formatter.camelCase("hello world"));

    }

}
