package Homeworks.Java05.Controller;

import Homeworks.Java05.Model.SumModel;
import Homeworks.Java05.View.View;

/**
 * Класс управления сложением
 */
public class SumController implements I_Controller {
    /**
     * Сущность, которая взаимодействует с пользователем
     */
    View view;
    /**
     * Модель сложения
     */
    SumModel model;

    public SumController(View view, SumModel model) {
        this.view = view;
        this.model = model;
    }


    /**
     * Переопределяю интерфейсный метод
     */
    @Override
    public void doIt() {
        Number a = view.getValue();
        Number b = view.getValue();
        model.setX(a);
        model.setY(b);
        Number result = model.result();
        view.print(result, "Сумма: ");
    }
}
