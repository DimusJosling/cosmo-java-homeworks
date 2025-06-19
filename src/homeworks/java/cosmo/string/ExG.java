package homeworks.java.cosmo.string;

/**
 * Дана строка: ”Где мои деньги?”.
 * Необходимо собрать предложение в обратном порядке: “Деньги мои где?”.
 * Где мои деньги? -> Деньги мои где?
 * <p>
 * Подсказка: используйте методы .split(), .trim(), .replace() и .replaceFirst() класса String
 */
public class ExG {
    public static void main(String[] args) {
        String input = "Где мои деньги?";
        input = input.toLowerCase().replaceFirst("\\?", "");
        String[] strArr = input.split(" ");
        strArr[2] = strArr[2].replaceFirst
                (Character.toString(strArr[2].charAt(0)),
                 Character.toString(strArr[2].charAt(0)).toUpperCase());
        for (int i = strArr.length; i > 0; i--) {
            System.out.print(strArr[i - 1]);
            if (i - 1 != 0) {
                System.out.print(" ");
            }
            if (i - 1 == 0) {
                System.out.print("?");
            }
        }

    }
}