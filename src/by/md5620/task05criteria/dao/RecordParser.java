package by.md5620.task05criteria.dao;

public final class RecordParser {

    public static final String REMOVE_APPLIANCE_TYPE = "[a-zA-Z]+:";
    public static final String PARAMETERS_DELIMITER = ",";
    public static final String REMOVE_WHITESPACES = "\\s+";
    private static final String REMOVE_PARAMETER_TYPE = "\\w+=";

    private RecordParser() {
    }

    public static String[] applianceParamsValue(String record) {
        String[] parameters = applianceParams(record);

        for (int i = 0; i < parameters.length; i++) {
            parameters[i] = parameters[i].replaceAll(REMOVE_PARAMETER_TYPE, "");
        }
        return parameters;
    }

    public static String[] applianceParams(String record) {
        record = record.replaceAll(REMOVE_WHITESPACES, "");
        record = record.replaceAll(REMOVE_APPLIANCE_TYPE, "");

        return record.split(PARAMETERS_DELIMITER);
    }
}