public class Flower {

    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    public Flower(String flowerColor, String country, double cost) {
        this(flowerColor, country, cost, 3);
    }

    public Flower(String flowerColor, String country, double cost, int lifeSpan) {
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost >= 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
        if (lifeSpan >= 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public String getFlowerColor() {
        return this.flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null || !flowerColor.isEmpty() || !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "Белый";
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null
                || !country.isEmpty()
                || !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost >= 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
    }

    public static double costOfSet(Flower... flowers) {
        double totalCost = 0;
        double floristAllowance = 1.1;
        for (Flower flower : flowers) {
            totalCost += flower.getCost();
        }
        double cost = totalCost * floristAllowance;
        return cost;
    }
    public static int minLifeSpan(Flower... flowers) {
        int minimumLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < minimumLifeSpan) {
                minimumLifeSpan = flower.lifeSpan;
            }
        }
        return minimumLifeSpan;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "flowerColor='" + flowerColor + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + cost +
                ", lifeSpan=" + lifeSpan +
                '}';
    }
}
