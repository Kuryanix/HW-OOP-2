public class Human {
    // Задание 1.1; 1.2; 2.1 и 3.1

    public String name;
    private int age;
    private String city;
    public String profession;

    public Human() {
        checkName(name);
        checkAge(age);
        checkCity(city);
        checkProfession(profession);
    }

    public Human(String name, int birthDate, String city, String profession) {
        checkName(name);
        checkAge(birthDate);
        checkCity(city);
        checkProfession(profession);
    }

    public void checkName(String name) {
        if (name == null || name.isEmpty()) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
    }

    public void checkAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public void checkCity(String city) {
        if (city == null || city.isEmpty()) {
            this.city = "Информация не указана";
        } else {
            this.city = city;
        }
    }

    public void checkProfession(String profession) {
        if (profession == null || profession.isEmpty()) {
            this.profession = "Информация не указана";
        } else {
            this.profession = profession;
        }
    }

    public void infoWithYear() {
        int currentYear = 2022;
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + city + ". Я родился в " + (currentYear - age) + " году. Я работаю на должности " + profession + ". Будем Знакомы!");
    }

    public void info() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + city + ". Мне " + age + " лет. Я работаю на должности " + profession + ". Будем Знакомы!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        checkAge(age);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        checkCity(city);
    }
}
