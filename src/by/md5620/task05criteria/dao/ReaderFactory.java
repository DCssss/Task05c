package by.md5620.task05criteria.dao;

import by.md5620.task05criteria.dao.impl.FileApplianceReader;

public final class ReaderFactory {

    private static final ReaderFactory instance = new ReaderFactory();

    private final ApplianceReader fileApplianceReader = new FileApplianceReader();

    private ReaderFactory() {
    }

    public ApplianceReader getFileApplianceReader() {
        return fileApplianceReader;
    }

    public static ReaderFactory getInstance() {
        return instance;
    }
}