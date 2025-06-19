package homeworks.java.cosmo.string;

/**
 * Напишите программу,
 * которая на вход получает строку “Мама мыла Милу мылом!” и выводит её без пробелов.
 * Мама мыла Милу мылом! -> МамамылаМилумылом!
 * <p>
 * Подсказка: используйте метод .replace() класса String
 */
public class ExA {
    public static void main(String[] args) {
        String input = "Мама мыла Милу мылом!";
        System.out.println(input.replace(" ", ""));
    }
}