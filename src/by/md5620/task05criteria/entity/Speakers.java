package by.md5620.task05criteria.entity;

import java.util.Objects;

public class Speakers implements Appliance {

    private int powerConsumption;
    private int numOfSpeakers;
    private String frequencyRange;
    private int cordLength;

    public Speakers() {
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumOfSpeakers() {
        return numOfSpeakers;
    }

    public void setNumOfSpeakers(int numOfSpeakers) {
        this.numOfSpeakers = numOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speakers speakers = (Speakers) o;
        return powerConsumption == speakers.powerConsumption &&
                numOfSpeakers == speakers.numOfSpeakers &&
                cordLength == speakers.cordLength &&
                Objects.equals(frequencyRange, speakers.frequencyRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, numOfSpeakers, frequencyRange, cordLength);
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numOfSpeakers=" + numOfSpeakers +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", cordLength=" + cordLength +
                '}';
    }

    public static class Builder {

        private final Speakers newSpeakers;

        public Builder() {
            newSpeakers = new Speakers();
        }

        public Builder powerConsumption(int powerConsumption) {
            newSpeakers.powerConsumption = powerConsumption;
            return this;
        }

        public Builder numOfSpeakers(int numOfSpeakers) {
            newSpeakers.numOfSpeakers = numOfSpeakers;
            return this;
        }

        public Builder frequencyRange(String frequencyRange) {
            newSpeakers.frequencyRange = frequencyRange;
            return this;
        }

        public Builder cordLength(int cordLength) {
            newSpeakers.cordLength = cordLength;
            return this;
        }

        public Speakers build() {
            return newSpeakers;
        }
    }
}
