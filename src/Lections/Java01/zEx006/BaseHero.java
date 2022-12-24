package Lections.Java01.zEx006;

import java.util.Random;

public class BaseHero {
    protected static int number;
    protected static Random r;

    protected String name;
    protected int hp;
    protected int maxHp;

    static {
    }

    public BaseHero(String name, int hp) {

    }

    public BaseHero() {
    }

    public String getInfo() {
        return String.format(("Name: %s Hp: %d Type: %s"),
                this.name, this.hp, this.getClass().getSimpleName());
    }

    public void healed(int Hp) {
    }

    public void GetDamage(int damage) {

    }
}
