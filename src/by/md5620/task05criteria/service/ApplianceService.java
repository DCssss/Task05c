package by.md5620.task05criteria.service;

import by.md5620.task05criteria.entity.Appliance;
import by.md5620.task05criteria.entity.criteria.Criteria;
import by.md5620.task05criteria.service.exception.ServiceException;

import java.util.List;

public interface ApplianceService {

    List<Appliance> find(Criteria criteria) throws ServiceException;

}
