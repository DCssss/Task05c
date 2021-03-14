package by.md5620.task05criteria.dao;

import java.util.List;

import by.md5620.task05criteria.dao.exception.DaoException;

public interface ApplianceReader {

    List<String> loadGroup(String group) throws DaoException;
}
