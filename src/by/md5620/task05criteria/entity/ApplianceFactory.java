package by.md5620.task05criteria.entity;

public class ApplianceFactory {

    public Appliance create(String group, String[] params) {
        switch (group) {
            case "Laptop":
                return createLaptop(params);
            case "Oven":
                return createOven(params);
            case "Refrigerator":
                return createRefrigerator(params);
            case "Speakers":
                return createSpeakers(params);
            case "TabletPC":
                return createTablet(params);
            case "VacuumCleaner":
                return createCleaner(params);
            default:
                return null;
        }
    }

    private static Laptop createLaptop(String[] params) {

        return new Laptop.Builder()
                .batteryCapacity(Double.parseDouble(params[0]))
                .oc(params[1])
                .memoryRom(Integer.parseInt(params[2]))
                .systemMemory(Integer.parseInt(params[3]))
                .cpu(Double.parseDouble(params[4]))
                .displayInches(Integer.parseInt(params[5]))
                .build();
    }


    private static Oven createOven(String[] params) {

        return new Oven.Builder()
                .powerConsumption(Integer.parseInt(params[0]))
                .weight(Integer.parseInt(params[1]))
                .capacity(Integer.parseInt(params[2]))
                .depth(Integer.parseInt(params[3]))
                .height(Double.parseDouble(params[4]))
                .width(Double.parseDouble(params[5]))
                .build();
    }


    private static Refrigerator createRefrigerator(String[] params) {

        return new Refrigerator.Builder()
                .powerConsumption(Integer.parseInt(params[0]))
                .weight(Integer.parseInt(params[1]))
                .freezerCapacity(Integer.parseInt(params[2]))
                .overallCapacity(Double.parseDouble(params[3]))
                .height(Integer.parseInt(params[4]))
                .width(Integer.parseInt(params[5]))
                .build();
    }


    private static Speakers createSpeakers(String[] params) {

        return new Speakers.Builder()
                .powerConsumption(Integer.parseInt(params[0]))
                .numOfSpeakers(Integer.parseInt(params[1]))
                .frequencyRange(params[2])
                .cordLength(Integer.parseInt(params[3]))
                .build();
    }


    private static TabletPC createTablet(String[] params) {

        return new TabletPC.Builder()
                .batteryCapacity(Integer.parseInt(params[0]))
                .displayInches(Integer.parseInt(params[1]))
                .memoryROM(Integer.parseInt(params[2]))
                .flashMemoryCapacity(Integer.parseInt(params[3]))
                .color(params[4])
                .build();
    }

    private static VacuumCleaner createCleaner(String[] params) {

        return new VacuumCleaner.Builder()
                .powerConsumption(Integer.parseInt(params[0]))
                .filterType(params[1])
                .bagType(params[2])
                .wandType(params[3])
                .motorSpeedRegulation(Integer.parseInt(params[4]))
                .cleaningWidth(Integer.parseInt(params[5]))
                .build();
    }
}
