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

        //ДЗ 4: 1-е задание
        Human vladimir = new Human("Владимир", 21, "Казань", "Временно не работаю");
        greeting(vladimir);

        //ДЗ 4: 2-е задание
        Flower rose = new Flower("","Голландия", 35.59);
        Flower chrysanthemum = new Flower("", "", 15.0, 5);
        Flower pion = new Flower("", "Англия", 69.9,1);
        Flower gypsophila = new Flower("", "Турция", 19.5,10);

        System.out.println();
        flowerInfo(rose);
        flowerInfo(chrysanthemum);
        flowerInfo(pion);
        flowerInfo(gypsophila);

        System.out.println();


        setOfFlowers();
        double cost = Flower.costOfSet(rose, rose, rose,
                chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,
                gypsophila);
        int minimumLifeSpan = Flower.minLifeSpan(rose, rose, rose,
                chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,
                gypsophila);
        System.out.println("Стоимость букета с учётом стоимости работ флориста составляет " + cost);
        System.out.println("Минимальный срок стояния букета составляет " + minimumLifeSpan);

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
        System.out.println("Привет! Меня зовут " + human.name + ". " +
                "Я из города " + human.getTown() +
                ". Я родился в " + human.getYearOfBirth() + " году. " +
                "Я работаю на должности " + human.job + ". " +
                "Будем знакомы!");
    }

    public static void flowerInfo(Flower flower) {
        System.out.println("Цвет цветка: " + flower.getFlowerColor() +
                ". Страна происхождения: " + flower.getCountry() +
                ". Стоимость: " + flower.getCost() +
                ". Срок стояния: " + flower.lifeSpan +
                 " дней.");
    }


     public static void setOfFlowers() {
         int countOfRose = 3;
         int countOfChrysanthemum = 5;
         int countOfPion = 0;
         int countOfGypsophila = 1;

         System.out.println("Букет состоит из:");
         if (countOfRose > 0) {
             System.out.println("Роз в кличестве " + countOfRose + " штук.");
         }
         if (countOfChrysanthemum > 0) {
             System.out.println("Хризантем в кличестве " + countOfChrysanthemum + " штук.");
         }
         if (countOfPion > 0) {
             System.out.println("Пионов в кличестве " + countOfPion + " штук.");
         }
         if (countOfGypsophila > 0) {
             System.out.println("Гипсофил в кличестве " + countOfGypsophila + " штук.");
         }
    }
}
