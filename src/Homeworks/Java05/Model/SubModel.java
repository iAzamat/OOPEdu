package Homeworks.Java05.Model;

/**
 * Класс вычитания
 */
public class SubModel extends CalcModel {

    public SubModel() {
    }

    /**
     * Переопределяю методы интерфейса
     */
    @Override
    public Number result() {
        return addNumbers(x, y);
    }

    @Override
    public void setX(Number value) {
        super.x = value;
    }

    @Override
    public void setY(Number value) {
        super.y = value;
    }

    private Number addNumbers(Number a, Number b) {
        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue() - b.doubleValue();
        } else if (a instanceof Float || b instanceof Float) {
            return a.floatValue() - b.floatValue();
        } else if (a instanceof Long || b instanceof Long) {
            return a.longValue() - b.longValue();
        } else {
            return a.intValue() - b.intValue();
        }
    }
}
