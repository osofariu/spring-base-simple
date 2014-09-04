package ext;

import one.StringFormatter;
import org.springframework.stereotype.Component;

import java.util.StringTokenizer;

@Component
public class MyStringFormatter implements StringFormatter {

    @Override
    public String capitalize(String s) {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }

    @Override
    public String camelCase(String text) {

        StringBuilder outputBuffer = new StringBuilder();
        StringTokenizer st = new StringTokenizer(text);
        while (st.hasMoreElements()) {
            outputBuffer.append(capitalize(st.nextToken()));

        }
        String output = outputBuffer.toString();
        return Character.toLowerCase(output.charAt(0)) + output.substring(1);
    }
}
