public class Main {
    public static void main(String[] args) {

        // ДЗ 1: 1,2-е задание
        /*
        Human maxim = new Human();
        maxim.name = "Максим";
        maxim.age = 35;
        maxim.town = "Минск";
        maxim.job = "Бренд-менеджер";

        Human ann = new Human();
        ann.name = "Аня";
        ann.age = 29;
        ann.town = "Москва";
        ann.job = "Методист образовательных программ";

        Human kate = new Human();
        kate.name = "Катя";
        kate.age = 28;
        kate.town = "Калининград";
        kate.job = "Продакт-менеджер";

        Human artem = new Human();
        artem.name = "Артём";
        artem.age = 27;
        artem.town = "Москва";
        artem.job = "Директор по развитию бизнеса";*/


        // ДЗ 2: 1-е задание

        Human maxim = new Human("Максим", 30, "Минск", "Бренд-менеджер");
        Human ann = new Human("Аня", 29, "Москва", "Методист образовательных программ");
        Human kate = new Human("Катя", 28, "Калининград","Продакт-менеджер");
        Human artem = new Human("Артём", 27, "Москва","Директор по развитию бизнеса");

        greeting(maxim);
        greeting(ann);
        greeting(kate);
        greeting(artem);

        System.out.println();

        //ДЗ 3: 1-е задание
        Human mike = new Human("Михал");
        greeting(mike);

        Human paul = new Human(44);
        greeting(paul);

    }
    // ДЗ 1: 1,2-е задание
    /*
    public static void greeting(Human human) {
    System.out.println("Привет! Меня зовут " + human.name + ". Я из города " + human.town +
    ". Я родился в " + (2022 - human.age) + " году. Я работаю на должности " + human.job + ". Будем знакомы!");
    }
    */


    // ДЗ 2: 1-е задание
    public static void greeting(Human human) {
        System.out.println("Привет! Меня зовут " + human.getName() + ". Я из города " + human.getTown() +
                ". Я родился в " + human.getYearOfBirth() + " году. Я работаю на должности " + human.getJob() + ". Будем знакомы!");
    }
}