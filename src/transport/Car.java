package transport;

import java.time.LocalDate;
public class Car {
    // Задание 2.1

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public static class Insurance {
        private LocalDate validity;
        private int cost;
        private String numberOfInsurance;

        public Insurance(LocalDate validity, int cost, String numberOfInsurance) {

            if (validity == null) {
                this.validity = LocalDate.now().plusDays(10);
            }
            this.validity = validity;

            if (cost <= 0) {
                this.cost = 100_000;
            }
            this.cost = cost;

            if (numberOfInsurance != null ||numberOfInsurance.isEmpty()) {
                this.numberOfInsurance = "Информация отсутствует!";
            }
            this.numberOfInsurance = numberOfInsurance;
        }

        private void checkValidity() {
            if (validity<=LocalDate.now()) {
                // Не понимаю как сделать проверку рабочую
                System.out.println("Нужно ехать оформлять страховку");
            }
        }

        private boolean numberOfInsurance(char symbol) {
            return false;
        }

        public boolean checkNumberOfInsurance() {
            char[] charsInsurance = this.numberOfInsurance.toCharArray();
            return numberOfInsurance(charsInsurance[0])
                    && numberOfInsurance(charsInsurance[1])
                    && numberOfInsurance(charsInsurance[2])
                    && numberOfInsurance(charsInsurance[3])
                    && numberOfInsurance(charsInsurance[4])
                    && numberOfInsurance(charsInsurance[5])
                    && numberOfInsurance(charsInsurance[6])
                    && numberOfInsurance(charsInsurance[7])
                    && numberOfInsurance(charsInsurance[8]);
        }
    }

        private final String brand;
        private final String model;
        private String engine;
        private String color;
        private final String year;
        private final String country;
        private String transmission;
        private final String body;
        private String number;
        private final int places;
        private boolean winterTires;
        private Key key;
        private Insurance insurance;

    public Car(String brand,
               String model,
               String engine,
               String color,
               String year,
               String country,
               String transmission,
               String body,
               String number,
               int places,
               boolean winterTires
               Key key
               Insurance insurance) {
// Не понимаю почему не передаются конструкторы
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (year == null || year.isEmpty()) {
            this.year = "2000";
        } else {
            this.year = year;
        }

        if (country == null || country.isEmpty()) {
            this.country = "default";
        } else {
            this.country = country;
        }

        if (body == null || body.isEmpty()) {
            this.body = "Седан";
        } else {
            this.body = body;
        }

        if (places < 2 || places > 8) {
            this.places = 4;
        } else {
            this.places = places;
        }
        checkEngine(engine);
        checkColor(color);
        checkTransmission(transmission);
        checkNumber(number);
        setWinterTires(winterTires);
    }

    public void checkEngine(String engine) {
        if (engine == null || engine.isEmpty()) {
            this.engine = "1.5 л.";
        } else {
            this.engine = engine;
        }
    }

    public void checkColor(String color) {
        if (color == null || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public void checkTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "механическая";
        } else {
            this.transmission = transmission;
        }
    }

    public void checkNumber(String number) {
        if (number == null || number.isEmpty()) {
            this.number = "Номер не указан";
        } else {
            this.number = number;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBody() {
        return body;
    }

    public int getPlaces() {
        return places;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean getWinterTires() {
        return winterTires;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public void changeTires() {
        int currentMonth = LocalDate.now().getMonthValue();
        if (currentMonth > 11 || currentMonth < 3 != this.winterTires) {
            System.out.println("Пора менять колеса");
        } else {
            System.out.println("Сезонные шины уже установлены");
        }
    }

    private boolean isNumber(char symbol) {
        return Character.isDigit(symbol);
    }

    private boolean isNumberLetter(char symbol) {
        String allowedSymbol = "АБВГДЕЁЖЗИЙКЛМНОПРСТ";
        return allowedSymbol.contains("" + symbol);
    }

    public boolean isNumberValid() {
        if (this.number.length() != 9) {
            return false;
        }
        char[] NumberChars = this.number.toCharArray();
        return isNumberLetter(NumberChars[0])
                && isNumber(NumberChars[1])
                && isNumber(NumberChars[2])
                && isNumber(NumberChars[3])
                && isNumberLetter(NumberChars[4])
                && isNumberLetter(NumberChars[5])
                && isNumber(NumberChars[6])
                && isNumber(NumberChars[7])
                && isNumber(NumberChars[8]);
    }

    public void carInfo() {
        System.out.println("Марка: " + brand + ", модель: " + model + ", объем двигателя: " + engine + ", цвет: " + color + ", год производства: " + year + ", страна производитель: " + country
                + ", коробка передач: " + transmission + ", кузов: " + body + ", номер: " + number + ", кол-во мест: " + number + ", резина: " + winterTires);
    }
}
