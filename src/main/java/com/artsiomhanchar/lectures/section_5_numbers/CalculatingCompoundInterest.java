package com.artsiomhanchar.lectures.section_5_numbers;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CalculatingCompoundInterest {
    private static final NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
//    private static final NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance(Locale.JAPAN);

    private static final NumberFormat percentFormatter = NumberFormat.getPercentInstance();

    public static BigDecimal calculate(String principal, String rate, int period, String contribution) throws ParseException {
        // balance y = p*(1 + r)^Y + c[((1 + r)^Y - 1) / r]
        // Y - period, r - rate, p - principal, c - contribution

        BigDecimal rateBigDecimal = new BigDecimal(percentFormatter.parse(rate).toString());

        BigDecimal a = BigDecimal.ONE.add(rateBigDecimal); // (1 + r)

        BigDecimal b = a.pow(period); // (1 + r)^Y

        BigDecimal c = b.subtract(BigDecimal.ONE); // ((1 + r)^Y - 1)
        BigDecimal d = c.divide(rateBigDecimal); // ((1 + r)^Y - 1) / r
        BigDecimal e = d.multiply(new BigDecimal(moneyFormatter.parse(contribution).toString())); // c[((1 + r)^Y - 1) / r]

        BigDecimal f = b.multiply(new BigDecimal(moneyFormatter.parse(principal).toString())); // p*(1 + r)^Y

        BigDecimal result = f.add(e); // balance y = p*(1 + r)^Y + c[((1 + r)^Y - 1) / r]

        return result;
    }

    public static void main(String[] args) throws ParseException {
        DecimalFormat df = new DecimalFormat("$#,###.##;$(#)"); // custom number format. left part - positive, right part - negative. Left and Right are divided by semicolon(;)
        DecimalFormat df2 = new DecimalFormat("$0000,000.00;$(#)");

        BigDecimal balance = CalculatingCompoundInterest.calculate("$10,000.00", "8%", 10, "$1,000");

        System.out.println(moneyFormatter.format(balance));

        System.out.println(df.format(balance));
        System.out.println(df.format(balance.negate()));

        System.out.println(df2.format(balance));
        System.out.println(df2.format(balance.negate()));

        DecimalFormat pf = new DecimalFormat("#%");
        System.out.println(pf.format(.08));

        System.out.printf("%f%n", balance);
        System.out.printf("$%,(.2f%n", balance);
        System.out.printf("$%,(.2f%n", balance.negate());

        System.out.format("%f%n", balance);
        System.out.format("$%,(.2f%n", balance);
        System.out.format("$%,(.2f%n", balance.negate());

        String myBalance = String.format("$%,(.2f%n", balance);

        System.out.println(myBalance);
    }
}
