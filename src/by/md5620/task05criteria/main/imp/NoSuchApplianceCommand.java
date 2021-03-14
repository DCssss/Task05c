package by.md5620.task05criteria.main.imp;

import by.md5620.task05criteria.entity.Appliance;
import by.md5620.task05criteria.main.PrintCommand;

public class NoSuchApplianceCommand implements PrintCommand {

    @Override
    public void print(Appliance appliance) {
        System.out.println("There's no such appliance type");
    }
}
