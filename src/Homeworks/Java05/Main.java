package Homeworks.Java05;

import Homeworks.Java05.Controller.DivController;
import Homeworks.Java05.Controller.MultController;
import Homeworks.Java05.Controller.SubController;
import Homeworks.Java05.Controller.SumController;
import Homeworks.Java05.Model.DivModel;
import Homeworks.Java05.Model.MultModel;
import Homeworks.Java05.Model.SubModel;
import Homeworks.Java05.Model.SumModel;
import Homeworks.Java05.View.View;
import Homeworks.Java05.View.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        View v = new View();
        Presenter p = new Presenter(
                new SumController(v, new SumModel()),
                new SubController(v, new SubModel()),
                new DivController(v, new DivModel()),
                new MultController(v, new MultModel()),
                scanner, new Menu(scanner));
        p.start();
    }
}
