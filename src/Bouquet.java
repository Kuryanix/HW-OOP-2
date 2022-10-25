import java.sql.SQLOutput;

public class Bouquet {

    private final Flower[] flowers;

    public Bouquet(Flower... flowers) {
        this.flowers = flowers;
    }

    public double getCoast() {
        float sum = 0;
        for (Flower flower : flowers) {
            if (flower != null) {
                sum += flower.getCost();

            }
        }
        return sum * 1.1;
    }

    public int getLifeSpan() {
        int min = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower != null && flower.getLifeSpan() < min) {
                min = flower.getLifeSpan();
            }
        }
        return min;
    }
}

