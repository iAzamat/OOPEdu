package Seminars.Java02.S4;

public class DefaultProg {
    public static void main(String[] args) {
        MyRandAClass obj = new MyRandAClass();

        int uId = RandA.getUniversalId();
        System.out.println("Универсальный ID " + uId);

        System.out.println("Id пользователя " + obj.getUserId());
        System.out.println("Id админа " + obj.getAdminId());
    }
}
