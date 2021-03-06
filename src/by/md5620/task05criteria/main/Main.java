package by.md5620.task05criteria.main;

import by.md5620.task05criteria.entity.Appliance;
import by.md5620.task05criteria.entity.criteria.Criteria;
import by.md5620.task05criteria.service.ApplianceService;
import by.md5620.task05criteria.service.ServiceFactory;
import by.md5620.task05criteria.service.exception.ServiceException;

import static by.md5620.task05criteria.entity.criteria.SearchCriteria.*;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Appliance> appliances = null;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
        criteriaOven.add(Oven.CAPACITY.toString(), 33);

        try {
            appliances = service.find(criteriaOven);
        } catch (ServiceException e) {
            e.printStackTrace();
        }

        if (appliances != null) {
            for (Appliance appliance : appliances) {
                PrintApplianceInfo.print(appliance);
            }
        }

        //////////////////////////////////////////////////////////////////

        criteriaOven = new Criteria(Oven.class.getSimpleName());
        criteriaOven.add(Oven.HEIGHT.toString(), 200);
        criteriaOven.add(Oven.DEPTH.toString(), 300);

        try {
            appliances = service.find(criteriaOven);
        } catch (ServiceException e) {
            e.printStackTrace();
        }

        if (appliances != null) {
            for (Appliance appliance : appliances) {
                PrintApplianceInfo.print(appliance);
            }
        }

        //////////////////////////////////////////////////////////////////

        Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());

        criteriaTabletPC.add(TabletPC.COLOR.toString(), "BLUE");
        criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
        criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);

        try {
            appliances = service.find(criteriaTabletPC);
        } catch (ServiceException e) {
            e.printStackTrace();
        }

        if (appliances != null) {
            for (Appliance appliance : appliances) {
                PrintApplianceInfo.print(appliance);
            }
        }
    }
}