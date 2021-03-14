package by.md5620.task05criteria.main.imp;

import by.md5620.task05criteria.entity.Appliance;
import by.md5620.task05criteria.entity.TabletPC;
import by.md5620.task05criteria.main.PrintCommand;

public class TablePCPrintCommand implements PrintCommand {

    @Override
    public void print(Appliance appliance) {
        TabletPC tabletPC = (TabletPC) appliance;

        String output = "TablePC: " +
                "batteryCapacity=" + tabletPC.getBatteryCapacity() +
                ", displayInches=" + tabletPC.getDisplayInches() +
                ", memoryROM=" + tabletPC.getMemoryROM() +
                ", FlashMemoryCapacity=" + tabletPC.getFlashMemoryCapacity() +
                ", color=" + tabletPC.getColor();

        System.out.println(output);
    }
}
