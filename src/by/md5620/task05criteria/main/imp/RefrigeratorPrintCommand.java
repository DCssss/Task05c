package by.md5620.task05criteria.main.imp;

import by.md5620.task05criteria.entity.Appliance;
import by.md5620.task05criteria.entity.Refrigerator;
import by.md5620.task05criteria.main.PrintCommand;

public class RefrigeratorPrintCommand implements PrintCommand {

    @Override
    public void print(Appliance appliance) {
        Refrigerator refrigerator = (Refrigerator) appliance;

        String output = "Refrigerator: " +
                "powerConsumption=" + refrigerator.getPowerConsumption() +
                ", weight=" + refrigerator.getWeight() +
                ", freezerCapacity=" + refrigerator.getFreezerCapacity() +
                ", overallCapacity=" + refrigerator.getOverallCapacity() +
                ", height=" + refrigerator.getHeight() +
                ", width=" + refrigerator.getWidth();

        System.out.println(output);
    }
}
