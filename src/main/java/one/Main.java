package one;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext("ext");

        Main app = new Main();
        app.run(ctx);
    }

    public void run(AnnotationConfigApplicationContext ctx)  {
        StringFormatter formatter = ctx.getBean(StringFormatter.class);

        String input = "This is not the sentence you typed in";
        System.out.println(formatter.camelCase(input));

        ParagraphFormatter pFormatter = ctx.getBean(ParagraphFormatter.class);
        System.out.println("pFormatter: " + pFormatter.format("Hello world"));

        String improvedStr = pFormatter.formatWithHelper("The sentence That would be know as enhanced Sentence");
        System.out.println("enhanced: " + improvedStr);
    }
}