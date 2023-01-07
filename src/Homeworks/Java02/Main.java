package Homeworks.Java02;

public class Main {
    public static void main(String[] args) {
        Human person1 = new Man("Иван", "Иванов", "Петрович", 1977, 11, 3);
        Human person2 = new Female("Анна", "Иванова", "Cергеевна", 1982, 3, 30);
        Human person3 = new Man("Андрей", "Иванов", "Иванович", 2012, 12, 20);
        Human person4 = new Female("Мария", "Иванова", "Ивановна", 2007, 12, 05);
        Human person5 = new Female("Мария", "Петрова", "Сергеевна", 1984, 8, 03);
        Human person6 = new Man("Aнтон", "Петров", "Петрович", 1985, 11, 7);

        Family ivanov = new Family();
        ivanov.addPerson(person1);
        ivanov.addPerson(person2);
        ivanov.addPerson(person3);
        ivanov.addPerson(person4);

        setMarry(person1, person2);

        person3.setFather(1);
        person3.setMother(2);
        person4.setMother(2);
        person4.setFather(1);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);


        person6.setMarried(person5);
        person5.setMarried(person6);
        System.out.println(person5);
        System.out.println(person6);
        Family petrov = new Family();
        petrov.addPerson(person5);
        petrov.addPerson(person6);

        System.out.println(ivanov.findParents(person3));
        System.out.println(person6.getSpouse());
        System.out.println(petrov.findSpouse(person6));
    }

    private static void setMarry(Human spouse1, Human spouse2) {
        spouse1.setMarried(spouse2);
    }

}
