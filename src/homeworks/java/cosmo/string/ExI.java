package homeworks.java.cosmo.string;

import java.util.Arrays;

/**
 * Дан массив строк с номерами телефонов {“9806567890”, “89990980644”, “+79005556134”}.
 * Необходимо все номера телефонов отформатировать на вариант с +7-***-***-**-**.
 * 89990980644 -> +7-999-098-06-44
 * <p>
 * Подсказка: используйте методы .format() и .substring() класса String
 */
public class ExI {
    public static void main(String[] args) {
        String[] input = {"9806567890", "89990980644", "+79005556134" };
        for (int i = 0; i < input.length; i++) {
//            StringBuilder sb = new StringBuilder(input[i]);
            if (input[i].length() == 10) {
                input[i] = "+7" + input[i];
            }
            if (input[i].length() == 11 && input[i].charAt(0) == '8') {
                input[i] = input[i].replaceFirst("8", "+7");
            }
            if (input[i].length() == 11 && input[i].charAt(0) == '7') {
                input[i] = "+" + input[i];
            }

            for (int j = 0; j < 12; j++) {
                System.out.print(input[i].charAt(j));
                if (j == 1 || j == 4 || j == 7 || j == 9){
                    System.out.print("-");
                }
                if (j == 11) {
                    System.out.println("");
                }
            }
        }

    }
}