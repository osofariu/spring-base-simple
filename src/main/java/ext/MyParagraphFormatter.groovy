package ext
import one.ParagraphFormatter
import one.StringFormatter
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class MyParagraphFormatter implements ParagraphFormatter {

    @Autowired
    StringFormatter stringFormatter;

    @Override
    String format(Object string) {
        return string;
    }

    @Override
    String formatWithHelper(Object string) {
        return format(stringFormatter.camelCase(string))
    }
}
