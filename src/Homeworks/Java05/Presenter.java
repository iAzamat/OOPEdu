package Homeworks.Java05;

import Homeworks.Java05.Controller.DivController;
import Homeworks.Java05.Controller.MultController;
import Homeworks.Java05.Controller.SubController;
import Homeworks.Java05.Controller.SumController;
import Homeworks.Java05.View.Menu;

import java.util.Scanner;

/**
 * Класс, запускающий действие, в зависимости от выбора пользователя
 */
public class Presenter {
    SumController sumController;
    SubController subController;
    DivController divController;
    MultController multController;
    Menu menu;
    Scanner scanner;

    public Presenter(
            SumController sumController,
            SubController subController,
            DivController divController,
            MultController multController,
            Scanner scanner, Menu menu) {
        this.sumController = sumController;
        this.subController = subController;
        this.divController = divController;
        this.multController = multController;
        this.scanner = scanner;
        this.menu = menu;
    }

    /**
     * Метод запускает работу с калькулятором
     */
    public void start() {

        while (true) {
            switch (menu.selectFunction()) {
                case "1" -> // сложение
                        sumController.doIt();
                case "2" -> // вычитание
                        subController.doIt();
                case "3" -> // деление
                        divController.doIt();
                case "4" -> // умножение
                        multController.doIt();
                case "0" -> // выход
                        System.exit(0);
                default -> System.out.println("Неверный ввод");
            }
        }
    }


}