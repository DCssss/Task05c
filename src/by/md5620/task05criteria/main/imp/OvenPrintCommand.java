package by.md5620.task05criteria.main.imp;

import by.md5620.task05criteria.entity.Appliance;
import by.md5620.task05criteria.entity.Oven;
import by.md5620.task05criteria.main.PrintCommand;

public class OvenPrintCommand implements PrintCommand {

    @Override
    public void print(Appliance appliance) {
        Oven oven = (Oven) appliance;

        String output = "Oven: " +
                "powerConsumption=" + oven.getPowerConsumption() +
                ", weight=" + oven.getWeight() +
                ", capacity=" + oven.getCapacity() +
                ", depth=" + oven.getDepth() +
                ", height=" + oven.getHeight() +
                ", width=" + oven.getWidth();

        System.out.println(output);
    }
}
