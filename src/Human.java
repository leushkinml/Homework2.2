import java.time.LocalDate;

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
    public String name;
    private int age;
    private String town;
    private int yearOfBirth;
    public String job;

    //ДЗ 3: 1-е задание
    public Human(String name) {
        this(name, 0, "Информация не указана", "Информация не указана");
    }

    public Human(String name, int age, String town, String job) {
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }

        if (age >= 0) {
            this.age = age;
        } else {
            this.age = Math.abs(age);
        }
        this.town = town;
        this.job = job;
    }

       public int getYearOfBirth() {
        if (age != 0) {
            this.yearOfBirth = (LocalDate.now().getYear() - age);
        } else {
            this.yearOfBirth = 0;
        }
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null || !town.isEmpty() || !town.isBlank()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
    }



    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", town='" + town + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", job='" + job + '\'' +
                '}';
    }
}
