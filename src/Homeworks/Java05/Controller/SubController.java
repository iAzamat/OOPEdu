package Homeworks.Java05.Controller;

import Homeworks.Java05.Model.SubModel;
import Homeworks.Java05.View.View;

/**
 * Класс управления вычитанием
 */
public class SubController implements I_Controller {
    /**
     * Сущность, которая взаимодействует с пользователем
     */
    View view;
    /**
     * Модель вычитания
     */
    SubModel subModel;

    public SubController(View view, SubModel subModel) {
        this.view = view;
        this.subModel = subModel;
    }

    /**
     * Переопределяю интерфейсный метод
     */
    @Override
    public void doIt() {
        Number a = view.getValue();
        Number b = view.getValue();
        subModel.setX(a);
        subModel.setY(b);
        Number result = subModel.result();
        view.print(result, "Разность: ");
    }
}
