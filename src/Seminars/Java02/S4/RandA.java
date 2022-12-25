package Seminars.Java02.S4;

public interface RandA {
    int getUserId();
    default int getAdminId() { //метод по умолчанию, если не будет другой реализации используется указанная
        return 1;
    };
    static int getUniversalId() { //не наследуются реализующими классами, вызываются точечной анотацией по имени интерфейса
        return 5;
    }
}
