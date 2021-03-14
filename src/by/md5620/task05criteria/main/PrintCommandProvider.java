package by.md5620.task05criteria.main;

import by.md5620.task05criteria.entity.*;
import by.md5620.task05criteria.main.imp.*;

import java.util.HashMap;
import java.util.Map;

public class PrintCommandProvider {

    public static final String NO_SUCH_APPLIANCE = "NoSuchAppliance";
    private Map<String, PrintCommand> printCommands = new HashMap<>();

    public PrintCommandProvider() {
        printCommands.put(Laptop.class.getSimpleName(), new LaptopPrintCommand());
        printCommands.put(Oven.class.getSimpleName(), new OvenPrintCommand());
        printCommands.put(Refrigerator.class.getSimpleName(), new RefrigeratorPrintCommand());
        printCommands.put(Speakers.class.getSimpleName(), new SpeakersPrintCommand());
        printCommands.put(TabletPC.class.getSimpleName(), new TablePCPrintCommand());
        printCommands.put(VacuumCleaner.class.getSimpleName(), new VacuumCleanerPrintCommand());
        printCommands.put(NO_SUCH_APPLIANCE, new NoSuchApplianceCommand());

    }

    public PrintCommand takeCommand(String command) {
        PrintCommand value = printCommands.get(command);
        if (value == null) {
            value = printCommands.get(NO_SUCH_APPLIANCE);

        }

        return value;
    }
}
