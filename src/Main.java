import transport.Car;

public class Main {

    public static final Flower[] flowers = new Flower[3];

    public static int lifeSpanOfBouquet() {
        int min = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.getLifeSpan() != 0 && flower.getLifeSpan() < min) {
                min = flower.getLifeSpan();
            }
        }
        return min;
    }
    public static void main(String[] args) {

        // Задание 1.1

        Human maxim = new Human("Максим", 35, "Москва", "бренд-менеджер");
        Human anna = new Human("Аня", 29, "Москва", "методист образовательных программ");
        Human kate = new Human("Катя", 28, "Калининград", "продакт-менеджер");
        Human artem = new Human("Артем", 27, "Москва", "директор по развитию бизнеса");
        Human vladimir = new Human("Владимир", 21, "Москва", "безработный");

        maxim.info();
        anna.info();
        kate.info();
        artem.info();
        vladimir.info();

        System.out.println();


        // Задание 1.2

        Flower rose = new Flower("Роза обыкновенная","", "Голландия", 35.59, 0);
        Flower chrysanthemum = new Flower("Хризантема","", "", 15, 5);
        Flower peony = new Flower("Пион","", "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила","", "Турция", 19.5, 10);
        Bouquet bouquet = new Bouquet(rose, rose, rose, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, gypsophila);

        rose.info();
        chrysanthemum.info();
        peony.info();
        gypsophila.info();
        System.out.println("Стоимость букета: " + bouquet.getCoast());
        System.out.println("Срок стояния букета: " + bouquet.getLifeSpan());
        System.out.println("Состав букета");
        // Не понимаю как вывести состав букета
        System.out.println();

        // Задание 2.1

        Car lada = new Car("Lada", "Granta", "1.7 л.", "желтый", "2015", "Россия", "автомат", "кроссовер", "X123УУ096", 4, false);
        Car audi = new Car("Audi", "A8", "3.0 л.", "черный", "2020", "Германия", "автомат", "купе", "В666ОР777", 2, true);
        Car bmw = new Car("BMW", "Z8", "3.0 л.", "черный", "2021", "Германия", "автомат", "купе", "Р000РР007", 2, true);
        Car kia = new Car("KIA", "Sportage 4-го поколения", "2.4 л.", "красный", "2018", "Южная Корея", "механика", "внедорожник", "Г683УМ102", 5, true );
        Car hyundai = new Car("Hyundai", "Avante", "1.6 л.", "оранжевый", "2016", "Южная Корея", "механика", "хэтчбек", "Я456ВА001", 5, true);

        lada.carInfo();
        audi.carInfo();
        bmw.carInfo();
        kia.carInfo();
        hyundai.carInfo();
        // Не понимаю как вывести название шин в виде строки "зимняя" или "летняя"
        lada.changeTires();
        lada.isNumberValid();
        // Почему не работает метод?
        lada.getNumber();
        // Почему не работают геттеры?

    }
}