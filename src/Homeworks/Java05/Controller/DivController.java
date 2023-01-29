package Homeworks.Java05.Controller;

import Homeworks.Java05.Model.DivModel;
import Homeworks.Java05.View.View;

/**
 * Класс управления делением
 */
public class DivController implements I_Controller {
    /**
     * Сущность, которая взаимодействует с пользователем
     */
    View view;
    /**
     * Модель деления
     */
    DivModel divModel;

    public DivController(View view, DivModel divModel) {
        this.view = view;
        this.divModel = divModel;
    }

    /**
     * Переопределяю интерфейсный метод
     */
    @Override
    public void doIt() {
        Number a = view.getValue();
        Number b = view.getValueDiv();
        divModel.setX(a);
        divModel.setY(b);
        Number result = divModel.result();
        view.print(result, "Частное: ");

    }
}
