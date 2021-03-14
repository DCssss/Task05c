package by.md5620.task05criteria.main.imp;

import by.md5620.task05criteria.entity.Appliance;
import by.md5620.task05criteria.entity.VacuumCleaner;
import by.md5620.task05criteria.main.PrintCommand;

public class VacuumCleanerPrintCommand implements PrintCommand {

    @Override
    public void print(Appliance appliance) {
        VacuumCleaner cleaner = (VacuumCleaner) appliance;

        String output = "VacuumCleaner: " +
                "powerConsumption=" + cleaner.getPowerConsumption() +
                ", filterType='" + cleaner.getFilterType() +
                ", bagType='" + cleaner.getBagType() +
                ", wandType='" + cleaner.getWandType() +
                ", motorSpeedRegulation=" + cleaner.getMotorSpeedRegulation() +
                ", cleaningWidth=" + cleaner.getCleaningWidth();

        System.out.println(output);
    }
}
