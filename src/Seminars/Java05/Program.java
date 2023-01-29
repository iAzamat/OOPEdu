package Seminars.Java05;

public class Program {
    public static void main(String[] args) {
        Presenter p1 = new Presenter(new SumModel(), new View());
        Presenter p2 = new Presenter(new SubModel(), new View());
        Presenter p3 = new Presenter(new MultModel(), new View());
        Presenter p4 = new Presenter(new DivModel(), new View());
        p1.buttonClick();
        p2.buttonClick();
        p3.buttonClick();
        p4.buttonClick();

    }
}
