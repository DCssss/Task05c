package by.md5620.task05criteria.main;

import by.md5620.task05criteria.entity.*;

public class PrintApplianceInfo {

    private static final PrintCommandProvider provider = new PrintCommandProvider();

    public static void print(Appliance appliance) {

        PrintCommand command;

        if (appliance instanceof Laptop) {
            command = provider.takeCommand(Laptop.class.getSimpleName());
        } else if (appliance instanceof Oven) {
            command = provider.takeCommand(Oven.class.getSimpleName());
        } else if (appliance instanceof Refrigerator) {
            command = provider.takeCommand(Refrigerator.class.getSimpleName());
        } else if (appliance instanceof Speakers) {
            command = provider.takeCommand(Speakers.class.getSimpleName());
        } else if (appliance instanceof TabletPC) {
            command = provider.takeCommand(TabletPC.class.getSimpleName());
        } else if (appliance instanceof VacuumCleaner) {
            command = provider.takeCommand(VacuumCleaner.class.getSimpleName());
        } else {
            command = provider.takeCommand(PrintCommandProvider.NO_SUCH_APPLIANCE);
        }

        command.print(appliance);

    }
}
