package by.md5620.task05criteria.service.validation;

import java.util.Map;

import by.md5620.task05criteria.entity.criteria.Criteria;

public class Validator {

    public static boolean criteriaValidator(Criteria criteria) {

        Map<String, Object> objectMap = criteria.getCriteria();
        for (Map.Entry<String, Object> entry : objectMap.entrySet()) {

            if (entry.getValue() == null) {
                return false;
            }
        }

        return true;
    }
}
