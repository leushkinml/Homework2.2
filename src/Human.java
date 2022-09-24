public class Human {

    // 1,2-е задание
    /*
    String name;
    int age;
    String town;
    int yearOfBirth;
    String job;
    */

    // 2-е задание
    private final String name;
    private int age;
    private String town;
    private int yearOfBirth;
    private String job;


    public Human(String name, int age, String town, String job) {
        this.name = name;
        this.age = age;
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
        yearOfBirth = (2022 - age);
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
