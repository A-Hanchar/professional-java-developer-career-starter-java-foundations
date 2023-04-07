package com.artsiomhanchar.lectures.section_3_working_with_text;

public class StripAndTrim {
    public static void main(String[] args) {
        String firstName = "  Artsiom      ";

        System.out.println("strip: '" + firstName.strip() + "'"); // all
        System.out.println("stripLeading: '" + firstName.stripLeading() + "'"); // from the start
        System.out.println("stripTrailing: '" + firstName.stripTrailing() + "'"); // from the end

        System.out.println("custom strip: '" + strip(firstName) + "'");

        System.out.println("trim: '" + firstName.trim() + "'"); // check only space, no tab and so on

        String multiLineText = """
                <html>
                    <div>Here's a div block</div>
                </html>
                """;
        System.out.println("'" + multiLineText.stripIndent() + "'"); // ????
    }

//    very simple method of strip
    public static String strip(String text) {
        return text.replace(" ", "");
    }
}
