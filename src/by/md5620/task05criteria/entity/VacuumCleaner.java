package by.md5620.task05criteria.entity;

import java.util.Objects;

public class VacuumCleaner implements Appliance {

    private int powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    public VacuumCleaner() {
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return powerConsumption == that.powerConsumption &&
                motorSpeedRegulation == that.motorSpeedRegulation &&
                cleaningWidth == that.cleaningWidth &&
                Objects.equals(filterType, that.filterType) &&
                Objects.equals(bagType, that.bagType) &&
                Objects.equals(wandType, that.wandType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "powerConsumption=" + powerConsumption +
                ", filterType='" + filterType + '\'' +
                ", bagType='" + bagType + '\'' +
                ", wandType='" + wandType + '\'' +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                '}';
    }

    public static class Builder {

        private final VacuumCleaner newVacuum;

        public Builder() {
            newVacuum = new VacuumCleaner();
        }

        public Builder powerConsumption(int powerConsumption) {
            newVacuum.powerConsumption = powerConsumption;
            return this;
        }

        public Builder filterType(String filterType) {
            newVacuum.filterType = filterType;
            return this;
        }

        public Builder bagType(String bagType) {
            newVacuum.bagType = bagType;
            return this;
        }

        public Builder wandType(String wandType) {
            newVacuum.wandType =wandType ;
            return this;
        }

        public Builder motorSpeedRegulation(int motorSpeedRegulation) {
            newVacuum.motorSpeedRegulation = motorSpeedRegulation;
            return this;
        }

        public Builder cleaningWidth(int cleaningWidth) {
            newVacuum.cleaningWidth = cleaningWidth;
            return this;
        }

        public VacuumCleaner build() {
            return newVacuum;
        }
    }
}
