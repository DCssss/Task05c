package by.md5620.task05criteria.service.impl;

import by.md5620.task05criteria.dao.ApplianceDAO;
import by.md5620.task05criteria.dao.DAOFactory;
import by.md5620.task05criteria.dao.exception.DaoException;
import by.md5620.task05criteria.entity.Appliance;
import by.md5620.task05criteria.entity.criteria.Criteria;
import by.md5620.task05criteria.service.ApplianceService;
import by.md5620.task05criteria.service.exception.ServiceException;
import by.md5620.task05criteria.service.validation.Validator;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

    @Override
    public List<Appliance> find(Criteria criteria) throws ServiceException {
        if (!Validator.criteriaValidator(criteria)) {
            return null;
        }

        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();

        List<Appliance> appliance;
        try {
            appliance = applianceDAO.find(criteria);
        } catch (DaoException e) {
            throw new ServiceException(e);
        }

        return appliance;
    }
}