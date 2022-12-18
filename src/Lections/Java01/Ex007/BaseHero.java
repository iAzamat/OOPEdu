//package Lections.Java01.Ex007;
//
//import java.util.Random;
//
//public class BaseHero {
//    protected static int number;
//    protected static Random r;
//
//    protected String name;
//    protected int hp;
//    protected int maxHp;
//
//    static {
//        BaseHero.number = 0;
//        BaseHero.r = new Random();
//
//    }
//
//    public BaseHero(String name, int hp) {
//
//    }
//
//    public void Attack(BaseHero target){
//        int damage = BaseHero.r.nextInt(10, 20);
//        target.GetDamage(damage);
//    }
//}
