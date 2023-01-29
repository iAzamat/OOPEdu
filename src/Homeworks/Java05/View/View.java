package Homeworks.Java05.View;

import java.util.Scanner;

/**
 * Класс работы с консольным вводом-выводом
 */

public class View {
    Scanner in = new Scanner(System.in);

    /**
     * Метод возвращет число, введенное пользователем
     */
    public Number getValue() {
        System.out.println("Введите число: ");
        String strValue = in.nextLine();
        Number numValue;
        if (isNumeric(strValue)) {
            if (strValue.contains(".")) {
                numValue = Double.valueOf(strValue);
            } else {
                numValue = Long.valueOf(strValue);
            }
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз: ");
            numValue = getValue();
        }
        return numValue;
    }

    /**
     * Метод возвращет делитель, не дает ввести 0
     */
    public Number getValueDiv() {
        System.out.println("Введите число, не равное нулю: ");
        String strValue = in.nextLine();
        Number numValue;
        if (isNumeric(strValue)) {
            if (strValue.contains(".")) {
                numValue = Double.valueOf(strValue);
            } else {
                numValue = Long.valueOf(strValue);
                if (numValue.intValue() == 0) {
                    System.out.println("На ноль делить нельзя. Попробуйте еще раз.");
                    numValue = getValueDiv();
                }
            }
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз: ");
            numValue = getValueDiv();
        }
        return numValue;
    }

    /**
     * Метод выводит результат на экран
     */
    public void print(Number data, String title) {
        String strData = String.valueOf(data);
        System.out.printf("%s %s\n", title, strData);
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
