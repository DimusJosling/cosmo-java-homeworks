package homeworks.java.cosmo.string;

/**
 * Нужно привести строку с полным именем к инициалам.
 * Например, "Носов Алексей Олегович" будет иметь вид: "Н.А.О."
 * Носов Алексей Олегович -> Н.А.О.
 * <p>
 * Подсказка: используйте методы .split() и .charAt() класса String
 */
public class ExH {
    public static void main(String[] args) {
        String fullName = "Носов Алексей Олегович";
        String[] strArr = fullName.split(" ");
        StringBuilder strB = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            strB.append(strArr[i].charAt(0));
            strB.append(".");
        }
        System.out.println(strB.toString());

    }
}
