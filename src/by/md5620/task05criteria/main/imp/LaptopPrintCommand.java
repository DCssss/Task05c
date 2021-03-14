package by.md5620.task05criteria.main.imp;

import by.md5620.task05criteria.entity.Appliance;
import by.md5620.task05criteria.entity.Laptop;
import by.md5620.task05criteria.main.PrintCommand;

public class LaptopPrintCommand implements PrintCommand {

    @Override
    public void print(Appliance appliance) {
        Laptop laptop = (Laptop) appliance;

        String output = "Laptop: " +
                "batteryCapacity=" + laptop.getBatteryCapacity() +
                ", OC='" + laptop.getOc() +
                ", memoryROM=" + laptop.getMemoryRom() +
                ", systemMemory=" + laptop.getSystemMemory() +
                ", cpu=" + laptop.getCpu() +
                ", displayInches=" + laptop.getDisplayInches();

        System.out.println(output);
    }
}
