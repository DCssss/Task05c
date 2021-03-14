package by.md5620.task05criteria.dao;

import by.md5620.task05criteria.dao.exception.DaoException;
import by.md5620.task05criteria.entity.Appliance;
import by.md5620.task05criteria.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceDAO {
    List<Appliance> find(Criteria criteria) throws DaoException;
}
