package by.md5620.task05criteria.dao.impl;

import by.md5620.task05criteria.dao.ApplianceReader;
import by.md5620.task05criteria.dao.exception.DaoException;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileApplianceReader implements ApplianceReader {

    @Override
    public List<String> loadGroup(String group) throws DaoException {

        Path filePath = FileSystems.getDefault().getPath("resources" + File.separator + "appliances.db");
        List<String> records = new ArrayList<>();

        boolean startReadingGroup = false;
        try (BufferedReader reader = Files.newBufferedReader(filePath)) {

            String currentLine;
            while ((currentLine = reader.readLine()) != null) {

                if (!currentLine.startsWith(group)) {
                    continue;
                }

                if (!startReadingGroup && (currentLine.startsWith(group))) {
                    startReadingGroup = true;
                }

                if (startReadingGroup && (currentLine.isEmpty())) {
                    break;
                }

                records.add(currentLine);
            }
        } catch (IOException e) {
            throw new DaoException("Error reading file", e);
        }

        return records;
    }
}
