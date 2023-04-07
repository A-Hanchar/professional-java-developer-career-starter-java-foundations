package com.artsiomhanchar.exercises.section_4_regular_expressions.Task_2;

public class Task_2 {
//    Use capture groups to write a regex that could match: Abracadabra or Agracadagra
    public static void main(String[] args) {
      String text1 = "Abracadabra";
      String text2 = "Agracadagra";

      String regex = "A((bra)|(gra))cada((bra)|(gra))";
      String regex1 = "A[b,g]racada[b,g]ra";

      System.out.println(text1.matches(regex));
      System.out.println(text2.matches(regex));

      System.out.println(text1.matches(regex1));
      System.out.println(text2.matches(regex1));
    }
}
