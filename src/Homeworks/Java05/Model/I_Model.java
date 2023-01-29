package Homeworks.Java05.Model;

/**
 * Глобальная модель калькулятора
 */
public interface I_Model {
    /**
     * Метод возвращает результат
     */
    Number result();

    /**
     * Метод устанавливает первое число
     */
    void setX(Number value);

    /**
     * Метод устанавливает второе число
     */
    void setY(Number value);
}


