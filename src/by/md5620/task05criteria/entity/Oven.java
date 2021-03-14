package by.md5620.task05criteria.entity;

import java.util.Objects;

public class Oven implements Appliance {

    private int powerConsumption;
    private int weight;
    private int capacity;
    private int depth;
    private double height;
    private double width;

    public Oven() {
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oven oven = (Oven) o;
        return powerConsumption == oven.powerConsumption &&
                weight == oven.weight &&
                capacity == oven.capacity &&
                depth == oven.depth &&
                Double.compare(oven.height, height) == 0 &&
                Double.compare(oven.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, capacity, depth, height, width);
    }

    @Override
    public String toString() {
        return "Oven{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    public static class Builder {

        private final Oven newOven;

        public Builder() {
            newOven = new Oven();
        }

        public Builder powerConsumption(int powerConsumption) {
            newOven.powerConsumption = powerConsumption;
            return this;
        }

        public Builder weight(int weight) {
            newOven.weight = weight;
            return this;
        }

        public Builder capacity(int capacity) {
            newOven.capacity = capacity;
            return this;
        }

        public Builder depth(int depth) {
            newOven.depth = depth;
            return this;
        }

        public Builder height(double height) {
            newOven.height = height;
            return this;
        }

        public Builder width(double width) {
            newOven.width = width;
            return this;
        }

        public Oven build() {
            return newOven;
        }
    }
}
