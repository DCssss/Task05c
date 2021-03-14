package by.md5620.task05criteria.entity;

import java.util.Objects;

public class Laptop implements Appliance {

    private double batteryCapacity;
    private String oc;
    private int memoryRom;
    private int systemMemory;
    private double cpu;
    private int displayInches;

    public Laptop() {
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOc() {
        return oc;
    }

    public void setOc(String oc) {
        this.oc = oc;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.batteryCapacity, batteryCapacity) == 0 &&
                memoryRom == laptop.memoryRom &&
                systemMemory == laptop.systemMemory &&
                Double.compare(laptop.cpu, cpu) == 0 &&
                displayInches == laptop.displayInches &&
                Objects.equals(oc, laptop.oc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, oc, memoryRom, systemMemory, cpu, displayInches);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", OC='" + oc + '\'' +
                ", memoryROM=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displayInches=" + displayInches +
                '}';
    }

    public static class Builder {

        private final Laptop newLaptop;

        public Builder() {
            newLaptop = new Laptop();
        }

        public Builder batteryCapacity(double batteryCapacity) {
            newLaptop.batteryCapacity = batteryCapacity;
            return this;
        }

        public Builder oc(String oc) {
            newLaptop.oc = oc;
            return this;
        }

        public Builder memoryRom(int memoryRom) {
            newLaptop.memoryRom = memoryRom;
            return this;
        }

        public Builder systemMemory(int systemMemory) {
            newLaptop.systemMemory = systemMemory;
            return this;
        }

        public Builder cpu(double cpu) {
            newLaptop.cpu = cpu;
            return this;
        }

        public Builder displayInches(int displayInches) {
            newLaptop.displayInches = displayInches;
            return this;
        }

        public Laptop build() {
            return newLaptop;
        }
    }
}
