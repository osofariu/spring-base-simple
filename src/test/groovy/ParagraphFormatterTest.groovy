import ext.MyParagraphFormatter
import org.junit.Test
import one.ParagraphFormatter

import static org.junit.Assert.assertEquals;

class ParagraphFormatterTest {

    @Test
    public void whenIFormatShortParagraphItDoesntBreakItUp() {
        ParagraphFormatter paragraphFormatter = new MyParagraphFormatter();
        String p = "This is the paragraph";
        assertEquals(p, paragraphFormatter.format(p));
    }

    @Test
    public void whenIAlignParagraphItInsertsNewLineAtMaxLineLength() {

    }

}
