public class Flower {

    private String name;
    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;

    public Flower(String name,String flowerColor, String country, double cost, int lifeSpan) {
        this.name = name;
        checkFlowerColor(flowerColor);
        checkCountry(country);
        checkCost(cost);
        checkLifeSpan(lifeSpan);
    }

    public void checkFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public void checkCountry(String country) {
            if (country == null || country.isEmpty()) {
                this.country = "Россия";
            } else {
                this.country = country;
            }
        }

    public void checkCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }

    public void checkLifeSpan(int lifeSpan) {
        if (lifeSpan % 1 ==0 && lifeSpan>0) {
            this.lifeSpan =lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public String getName() {
        return name;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        checkFlowerColor(flowerColor);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        checkCountry(country);
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        checkCost(cost);
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void info() {
        System.out.println("Цветок: " + getName() + ", цвет: " + getFlowerColor() + ", страна: " + getCountry() + ", цена: " + getCost() +", срок: " +getLifeSpan());
    }
}
