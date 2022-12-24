package Seminars.Java01.S2;

public class Bottle extends Product {
    private double volume;

    public Bottle(String nameProduct, double cost, double volume) {
        super(nameProduct, cost);
        this.volume = volume;
    }

    @Override
    public String toString() {
        String s = super.toString();
        return s.replace('}',',')+
                " volume=" + volume +
                '}';
    }
}
