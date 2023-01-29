package Seminars.Java05;

public class SubModel extends CalcModel {

    public SubModel() {

    }
    // do_it
    @Override
    public int result() {
        return x - y;
    }

    @Override
    public void setX(int value) {
        super.x = value;
    }

    @Override
    public void setY(int value) {
        super.y = value;
    }

}
