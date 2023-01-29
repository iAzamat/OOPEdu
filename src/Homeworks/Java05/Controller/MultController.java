package Homeworks.Java05.Controller;

import Homeworks.Java05.Model.MultModel;
import Homeworks.Java05.View.View;

/**
 * Класс управления умножением
 */
public class MultController implements I_Controller {
    /**
     * Сущность, которая взаимодействует с пользователем
     */
    View view;
    /**
     * Модель умножения
     */
    MultModel multModel;

    public MultController(View view, MultModel multModel) {
        this.view = view;
        this.multModel = multModel;
    }

    /**
     * Переопределяю интерфейсный метод
     */
    @Override
    public void doIt() {
        Number a = view.getValue();
        Number b = view.getValue();
        multModel.setX(a);
        multModel.setY(b);
        Number result = multModel.result();
        view.print(result, "Произведение: ");
    }
}
