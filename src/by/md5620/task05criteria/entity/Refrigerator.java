package by.md5620.task05criteria.entity;

import java.util.Objects;

public class Refrigerator implements Appliance {

    private int powerConsumption;
    private int weight;
    private int freezerCapacity;
    private double overallCapacity;
    private int height;
    private int width;

    public Refrigerator() {
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

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerator that = (Refrigerator) o;
        return powerConsumption == that.powerConsumption &&
                weight == that.weight &&
                freezerCapacity == that.freezerCapacity &&
                Double.compare(that.overallCapacity, overallCapacity) == 0 &&
                height == that.height &&
                width == that.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    public static class Builder {

        private final Refrigerator newRefrigerator;

        public Builder() {
            newRefrigerator = new Refrigerator();
        }

        public Builder powerConsumption(int powerConsumption) {
            newRefrigerator.powerConsumption = powerConsumption;
            return this;
        }

        public Builder weight(int weight) {
            newRefrigerator.weight = weight;
            return this;
        }

        public Builder freezerCapacity(int freezerCapacity) {
            newRefrigerator.freezerCapacity = freezerCapacity;
            return this;
        }

        public Builder overallCapacity(double overallCapacity) {
            newRefrigerator.overallCapacity = overallCapacity;
            return this;
        }

        public Builder height(int height) {
            newRefrigerator.height = height;
            return this;
        }

        public Builder width(int width) {
            newRefrigerator.width = width;
            return this;
        }

        public Refrigerator build() {
            return newRefrigerator;
        }
    }
}
