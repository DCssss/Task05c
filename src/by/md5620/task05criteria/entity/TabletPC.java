package by.md5620.task05criteria.entity;

import java.util.Objects;

public class TabletPC implements Appliance {

    private int batteryCapacity;
    private int displayInches;
    private int memoryROM;
    private int flashMemoryCapacity;
    private String color;

    public TabletPC() {
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletPC = (TabletPC) o;
        return batteryCapacity == tabletPC.batteryCapacity &&
                displayInches == tabletPC.displayInches &&
                memoryROM == tabletPC.memoryROM &&
                flashMemoryCapacity == tabletPC.flashMemoryCapacity &&
                Objects.equals(color, tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, displayInches, memoryROM, flashMemoryCapacity, color);
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryROM=" + memoryROM +
                ", FlashMemoryCapacity=" + flashMemoryCapacity +
                ", color='" + color + '\'' +
                '}';
    }

    public static class Builder {

        private final TabletPC newTabletPC;

        public Builder() {
            newTabletPC = new TabletPC();
        }

        public Builder batteryCapacity(int batteryCapacity) {
            newTabletPC.batteryCapacity = batteryCapacity;
            return this;
        }

        public Builder displayInches(int displayInches) {
            newTabletPC.displayInches = displayInches;
            return this;
        }

        public Builder memoryROM(int memoryROM) {
            newTabletPC.memoryROM = memoryROM;
            return this;
        }

        public Builder flashMemoryCapacity(int flashMemoryCapacity) {
            newTabletPC.flashMemoryCapacity = flashMemoryCapacity;
            return this;
        }

        public Builder color(String color) {
            newTabletPC.color = color;
            return this;
        }

        public TabletPC build() {
            return newTabletPC;
        }
    }
}
