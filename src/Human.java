public class Human {

    // ДЗ 1: 1,2-е задание
    /*
    String name;
    int age;
    String town;
    int yearOfBirth;
    String job;
    */

    // ДЗ 2: 1-е задание
    private String name;
    private int age;
    private String town;
    private int yearOfBirth;
    private String job;

    //ДЗ 3: 1-е задание
    public Human(String name) {
        this(name, 0, "Информация не указана", "Информация не указана");
    }
    public Human(int age) {
        this("Информация не указана", age, "Информация не указана", "Информация не указана");
    }

    public Human(String name, int age, String town, String job) {
        this.name = name;
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = Math.abs(age);
        }
        this.town = town;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getYearOfBirth() {
        int currentYear = 2022;
        if (age != 0) {
            yearOfBirth = (currentYear - age);
        } else {
            yearOfBirth = 0;
        }

        return yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", town='" + town + '\'' +
                '}';
    }
}
